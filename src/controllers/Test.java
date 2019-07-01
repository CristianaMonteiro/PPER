/*
 *
 */
package controllers;

import com.google.gson.Gson;
import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;
import jsonclass.TypeQuestion;
import models.Question;
import models.QuestionMultipleChoice;
import models.QuestionNumeric;
import models.QuestionYesNo;
import myutil.ContainerOfObjects;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    private ContainerOfObjects questions;

    private TestStatistics testStatistics;
    private ScoreStrategy scoreStrategy;

    public Test() {
        this.questions = new ContainerOfObjects();
    }

    @Override
    public boolean addQuestion(IQuestion question) throws TestException {
        return questions.addObject(question);
    }

    @Override
    public IQuestion getQuestion(int i) throws TestException {
        Question q = (Question) questions.getObjects(i);
        return q;
    }

    @Override
    public boolean removeQuestion(int i) {
        Question q = (Question) questions.removeObject(i);
        return q != null;

    }

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

    @Override
    public int numberQuestions() {
        return questions.arraySize();
    }

    @Override
    public boolean isComplete() {
        Object[] questionsObjects = questions.getObjects();

        boolean returnValue = true;

        int i = 0;

        while (i < questionsObjects.length && returnValue == true) {

            if (!((Question) questionsObjects[i]).isDone()) {
                returnValue = false;
            }

            i++;

        }

        return returnValue;

    }

    @Override
    public ITestStatistics getTestStatistics() {
        TestStatistics testStatistics = new TestStatistics(this);
        return testStatistics;
    }

    @Override
    public boolean loadFromJSONFile(String path) throws TestException {
        try {
            Gson gson = new Gson();
            TypeQuestion[] typeQuestion = gson.fromJson(new FileReader(path), TypeQuestion[].class);

            for (int i = 0; i < typeQuestion.length; i++) {

                if (typeQuestion[i].getType().equals("MultipleChoice")) {
                    QuestionMultipleChoice question = new QuestionMultipleChoice(typeQuestion[i].getQuestion().getCorrectAnswer(), typeQuestion[i].getQuestion().getOptions(), null, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    questions.addObject(question);

                } else if (typeQuestion[i].getType().equals("YesNo")) {
                    QuestionYesNo question = new QuestionYesNo(typeQuestion[i].getQuestion().getCorrectAnswer(), null, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    questions.addObject(question);

                } else if (typeQuestion[i].getType().equals("Numeric")) {
                    QuestionNumeric question = new QuestionNumeric(Double.valueOf(typeQuestion[i].getQuestion().getCorrectAnswer()), 0, false, typeQuestion[i].getQuestion().getMark(), typeQuestion[i].getQuestion().getQuestionDescription(), typeQuestion[i].getQuestion().getTitle());

                    questions.addObject(question);
                }
            }

            return true;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);

            return false;
        }

    }

    @Override
    public IScoreStrategy getScoreStrategy() {

        return this.scoreStrategy;

    }

    @Override
    public void setScoreStrategy(IScoreStrategy iss) {

        this.scoreStrategy = (ScoreStrategy) iss;
    }

    @Override
    public String calculateScore() {

        Question[] q = new Question[this.questions.arraySize()];

        for (int i = 0; i < questions.arraySize(); i++) {
            q[i] = (Question) questions.getObjects(i);
        }

        String result = this.scoreStrategy.CalculateScore(q);

        return result;

    }

    @Override
    public boolean saveTestResults() throws TestException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
