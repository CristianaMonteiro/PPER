package controllers;

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
 * Autor: Cristiana Ferreira Monteiro
 * Número Mecanográfico: 8150489
 * <p>
 */
import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;

public class ITest implements interfaces.controller.ITest {

    private static int count = 0;
    private boolean Complete;
    private IQuestion[] IQuestion;
    private boolean loadFromJSONFile;
    private int numberQuestions;
    private boolean Question;
    private boolean removeQuestion;
    private boolean saveTestResults;
    private String Score;
    private IScoreStrategy ScoreStrategy;
    private ITestStatistics TestStatistics;


    public ITest(int size) {
        this.IQuestion[size];
    }

    /**
     * Método que adiciona uma pergunta ao array de perguntas
     *
     * @param iq pergunta
     * @return verdadeiro ou falso
     * @throws TestException
     */
    @Override
    public boolean addQuestion(IQuestion iq) throws TestException {
        this.IQuestion[count] = iq;
        count++;

        //Verifica se as perguntas são iguais
        return this.IQuestion[count - 1].equals(iq);
    }

    /**
     *
     * @return
     */
    @Override
    public String calculateScore() {
        return this.Score;
    }

    /**
     * Método que retorna a pergunta na posição i passada po parametro
     *
     * @param i posição da pergunta no array
     * @return pergunta
     * @throws TestException
     */
    @Override
    public IQuestion getQuestion(int i) throws TestException {
        return this.IQuestion[i];
    }

    /**
     * Método que retorna a estratégia da pontuação
     *
     * @return estratégia da pontuação
     */
    @Override
    public IScoreStrategy getScoreStrategy() {
        return this.ScoreStrategy;
    }

    /**
     * Método para definir a estratégia de pontuação
     *
     * @param iss estratégia de pontuação
     */
    @Override
    public void setScoreStrategy(IScoreStrategy iss) {

        this.ScoreStrategy = iss;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isComplete() {
        return this.Complete;
    }

    /**
     * Método que retorna a estatistica do teste
     *
     * @return estatistica do teste
     */
    @Override
    public ITestStatistics getTestStatistics() {
        return this.TestStatistics;

    }

    /**
     *
     * @param string
     * @return
     * @throws TestException
     */
    @Override
    public boolean loadFromJSONFile(String string) throws TestException {


    }

    /**
     * Método que retorna o numero de perguntas
     *
     * @return numero da perguntas existente no teste
     */
    @Override
    public int numberQuestions() {
        return count;
    }

    /**
     * Método que remove a pergunta
     *
     * @param i
     * @return remoção
     */
    @Override
    public boolean removeQuestion(int i) {
        for (int k = i; k < ITest.count - 1; k++) {
            this.Question[k] = this.Question[k + 1];
        }

        return false;
    }

    /**
     * Método que remove a pergunta
     *
     * @param iq
     * @return pergunta
     */
    @Override
    public boolean removeQuestion(IQuestion iq) {

    }

    /**
     * Método que guarda os resultados do teste
     *
     * @param string
     * @return resultados do teste
     * @throws TestException
     */
    @Override
    public boolean saveTestResults(String string) throws TestException {

    }

}
