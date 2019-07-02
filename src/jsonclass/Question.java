package jsonclass;

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
public class Question {

    private String title;
    private int score;
    private float mark;
    private String question_description;
    private String options[];
    private String correct_answer;

    /**
     *
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     */
    public int getScore() {
        return score;
    }

    /**
     *
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     *
     * @return
     */
    public float getMark() {
        return mark;
    }

    /**
     *
     * @param mark
     */
    public void setMark(float mark) {
        this.mark = mark;
    }

    /**
     *
     * @return
     */
    public String getQuestionDescription() {
        return question_description;
    }

    /**
     *
     * @param questionDescription
     */
    public void setQuestionDescription(String questionDescription) {
        this.question_description = questionDescription;
    }

    /**
     *
     * @return
     */
    public String[] getOptions() {
        return options;
    }

    /**
     *
     * @param Options
     */
    public void setOptions(String[] Options) {
        this.options = Options;
    }

    /**
     *
     * @return
     */
    public String getCorrectAnswer() {
        return correct_answer;
    }

    /**
     *
     * @param correctAnswer
     */
    public void setCorrectAnswer(String correctAnswer) {
        this.correct_answer = correctAnswer;
    }

}
