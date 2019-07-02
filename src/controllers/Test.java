package controllers;

import com.google.gson.Gson;
import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import jsonclass.TypeQuestion;
import models.Question;
import models.QuestionMultipleChoice;
import models.QuestionNumeric;
import models.QuestionYesNo;
import myutil.ContainerOfObjects;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico de Porto <br>
 * LEI - Licenciatura em Engenharia Informática <br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: Trabalho Época de Recurso </strong><br>
 *
 * Autor: Cristiana Ferreira Monteiro Número Mecanográfico: 8150489
 * <p>
 */
public class Test implements interfaces.controller.ITest {

    protected ContainerOfObjects questions;

    private TestStatistics testStatistics;
    private ScoreStrategy scoreStrategy;

    /**
     *
     */
    public Test() {
        this.questions = new ContainerOfObjects();
        scoreStrategy = new ScoreStrategy();

    }

    /**
     *
     * @param question
     * @return
     * @throws TestException
     */
    @Override
    public boolean addQuestion(IQuestion question) throws TestException {
        return questions.addObject(question);
    }

    /**
     *
     * @param i
     * @return
     * @throws TestException
     */
    @Override
    public IQuestion getQuestion(int i) throws TestException {
        Question q = (Question) questions.getObjects(i);
        return q;
    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public boolean removeQuestion(int i) {
        Question q = (Question) questions.removeObject(i);
        return q != null;
    }

    /**
     *
     * @param iq
     * @return
     */
    @Override
    public boolean removeQuestion(IQuestion iq) {
        int pos = questions.findObject(iq);

        if (pos == -1) {
            return false;
        } else {
            Question q = (Question) questions.removeObject(pos);

            return q != null;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public int numberQuestions() {
        return questions.arraySize();
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isComplete() {
        Object[] questionsObjects = questions.getObjects();

        boolean returnValue = true;

        int i = 0;

        // percorre as perguntas todas em busca de alguma que não esteja completa
        while (i < questionsObjects.length && returnValue == true) {

            // se a questão atual for diferente de null e se não estiver respondido
            if (questionsObjects[i] != null && !((Question) questionsObjects[i]).isDone()) {
                returnValue = false;
            }

            i++;
        }
        return returnValue;
    }

    /**
     *
     * @return
     */
    @Override
    public ITestStatistics getTestStatistics() {
        TestStatistics testStatistics = new TestStatistics(this);
        return testStatistics;
    }

    /**
     *
     * @param path
     * @return
     * @throws TestException
     */
    @Override
    public boolean loadFromJSONFile(String path) throws TestException {
        try {
            // obter a pergunta do ficheiro e converter a pergunta num objeto
            Gson gson = new Gson();
            TypeQuestion[] typeQuestion = gson.fromJson(new FileReader(path), TypeQuestion[].class);

            // percorre todas as perguntas do ficheiro
            for (int i = 0; i < typeQuestion.length; i++) {

                // verifica o tipo de pergunta e instancia o objeto da classe correspondente
                if (typeQuestion[i].getType().equals("MultipleChoice")) {
                    QuestionMultipleChoice question = new QuestionMultipleChoice(typeQuestion[i].getQuestion().getCorrectAnswer(), typeQuestion[i].getQuestion().getOptions(), null, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    //adiciona a pergunta ao arry de perguntas
                    addQuestion(question);

                } else if (typeQuestion[i].getType().equals("YesNo")) {
                    QuestionYesNo question = new QuestionYesNo(typeQuestion[i].getQuestion().getCorrectAnswer(), null, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    addQuestion(question);

                } else if (typeQuestion[i].getType().equals("Numeric")) {
                    QuestionNumeric question = new QuestionNumeric(Double.valueOf(typeQuestion[i].getQuestion().getCorrectAnswer()), 0, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    addQuestion(question);
                }
            }

            return true;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public IScoreStrategy getScoreStrategy() {
        return this.scoreStrategy;
    }

    /**
     *
     * @param iss
     */
    @Override
    public void setScoreStrategy(IScoreStrategy iss) {
        this.scoreStrategy = (ScoreStrategy) iss;
    }

    /**
     * Método que converte um valor numeral num valor discreto
     *
     * @return retorna a classificação do teste
     */
    @Override
    public String calculateScore() {

        Question[] q = new Question[this.questions.arraySize()];

        for (int i = 0; i < questions.arraySize(); i++) {
            q[i] = (Question) questions.getObjects(i);
        }

        String result = this.scoreStrategy.CalculateScore(q);

        return result;
    }

    /**
     * Grava os resultados em ficheiro
     *
     * @return retorna se guardou em ficheiro
     * @throws TestException se acontecer algum problema lança a exeção
     */
    @Override
    public boolean saveTestResults() throws TestException {

        // verifica se o ficheiro de resultados existe
        boolean exists = true;
        File file = new File("result.json");
        if (!file.exists()) {
            exists = false;
        }

        try {

            // se o ficheiro existir apaga a ultima linha (fecho do array)
            if (exists == true) {

                RandomAccessFile f = new RandomAccessFile("result.json", "rw");
                long length = f.length() - 1;
                byte b = 0;
                do {
                    try {
                        length -= 1;
                        f.seek(length);
                        b = f.readByte();
                    } catch (IOException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } while (b != 10);
                f.setLength(length + 1);
                f.close();
            }

            // adiciona os resultados ao ficheiro
            BufferedWriter buffWrite = null;
            try {
                buffWrite = new BufferedWriter(new FileWriter("result.json", true));
                String linha = "";

                // se o ficheiro já existir
                if (exists) {
                    linha = getTestStatistics().toString();
                    buffWrite.append("," + linha + "\n]");

                    // caso o ficheiro ainda nao exista
                } else {
                    linha = getTestStatistics().toString();
                    buffWrite.append("[" + linha + "\n]");
                }

                buffWrite.close();
            } catch (IOException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                throw new TestException();
            } finally {
                try {
                    buffWrite.close();
                } catch (IOException ex) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    throw new TestException();
                }
            }

            return true;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;

    }

}
