package controllers;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico de Porto <br>
 * LEI - Licenciatura em Engenharia Informática <br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 *
 * Autor: Cristiana Ferreira Monteiro Número Mecanográfico: 8150489
 * <p>
 */
import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;

public class ITest implements interfaces.controller.ITest {

    private static int count = 0;
    private boolean Complete;
    private IQuestion IQuestion;

    private boolean loadFromJSONFile;
    private int numberQuestions;
    private boolean Question;
    private boolean removeQuestion;
    private boolean saveTestResults;
    private String Score;
    private IScoreStrategy ScoreStrategy;
    private ITestStatistics TestStatistics;

    /**
     *
     * @param iq
     * @return
     * @throws TestException
     */
    @Override
    public boolean addQuestion(IQuestion iq) throws TestException {
        // aQUI VAI O CODIGO
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
     *
     * @param i
     * @return
     * @throws TestException
     */
    @Override
    public IQuestion getQuestion(int i) throws TestException {
        return this.IQuestion;
    }

    /**
     *
     * @return
     */
    @Override
    public IScoreStrategy getScoreStrategy() {
        return this.ScoreStrategy;
    }

    /**
     *
     * @return
     */
    @Override
    public ITestStatistics getTestStatistics() {
        return this.TestStatistics;

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
     *
     * @param string
     * @return
     * @throws TestException
     */
    @Override
    public boolean loadFromJSONFile(String string) throws TestException {

    }

    /**
     *
     * @return
     */
    @Override
    public int numberQuestions() {

    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public boolean removeQuestion(int i) {
        for (int k = i; k < ITest.count - 1; k++) {
            this.Question[k] = this.Question[k + 1];
        }

        return false;
    }

    /**
     *
     * @param iq
     * @return
     */
    @Override
    public boolean removeQuestion(IQuestion iq) {

    }

    /**
     *
     * @param string
     * @return
     * @throws TestException
     */
    @Override
    public boolean saveTestResults(String string) throws TestException {

    }

    /**
     *
     * @param iss
     */
    @Override
    public void setScoreStrategy(IScoreStrategy iss) {
        this.ScoreStrategy = iss;
    }

}
