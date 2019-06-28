package models;

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
public class QuestionNumeric extends Question implements interfaces.models.IQuestionNumeric {

    private double correctAnwser;
    private double userAnswer;

    public QuestionNumeric(double correctAnwser, double userAnswer, boolean done, float mark, String questionDescription, String title) {
        super(String.valueOf(userAnswer), done, mark, questionDescription, title);
        this.correctAnwser = correctAnwser;
        this.userAnswer = userAnswer;
    }

    /**
     * Método que retorna a resposta correta
     *
     * @return resposta correta
     */
    @Override
    public double getCorrect_anwser() {
        return this.correctAnwser;

    }

    /**
     * Método que define a resposta correta
     *
     * @param correctAnwser resposta correta como parametro
     */
    @Override
    public void setCorrect_anwser(double correctAnwser) {
        this.correctAnwser = correctAnwser;

    }

    /**
     * Método que retorna o utilizador da resposta
     *
     * @return utilizador da resposta
     */
    @Override
    public double getUser_answer() {
        return this.userAnswer;

    }

    /**
     * Método que define o utilizador da resposta
     *
     * @param userAnswer utilizador da resposta como parametro
     */
    @Override
    public void setUser_answer(double userAnswer) {
        this.userAnswer = userAnswer;

    }

    @Override
    public boolean evaluateAnswer() {
        return this.correctAnwser == this.userAnswer;
    }

}
