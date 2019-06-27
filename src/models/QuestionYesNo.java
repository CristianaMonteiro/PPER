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
public class QuestionYesNo extends Question implements interfaces.models.IQuestionYesNo {

    private String correctAnswer;
    private String userAnswer;

    public QuestionYesNo(String correctAnswer, String userAnswer, boolean done, int id, float mark, String questionDescription, QuestionMetadata questionMetadata, String title) {
        super(correctAnswer, done, id, mark, questionDescription, questionMetadata, title);
        this.correctAnswer = correctAnswer;
        this.userAnswer = userAnswer;
    }

    /**
     * Método que retorna a resposta correta
     *
     * @return resposta correta
     */
    @Override
    public String getCorrect_answer() {
        return this.correctAnswer;

    }

    /**
     * Método que define a resposta correta
     *
     * @param correctAnswer resposta correta como parametro
     */
    @Override
    public void setCorrect_answer(String correctAnswer) {
        this.correctAnswer = correctAnswer;

    }

    /**
     * Método que retorna o utilizador da resposta
     *
     * @return utilizador da resposta
     */
    @Override
    public String getUser_answer() {
        return this.userAnswer;

    }

    /**
     * Método que define o utilizador da resposta
     *
     * @param userAnswer utilizador da resposta como parametro
     */
    @Override
    public void setUser_answer(String userAnswer) {
        this.userAnswer = userAnswer;

    }

    @Override
    public boolean evaluateAnswer() {
        if (this.correctAnswer.equals(this.userAnswer)) {
            return true;
        } else {
            return false;
        }
    }

}
