package models;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

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
public class IQuestionYesNo extends IQuestion implements interfaces.models.IQuestionYesNo {

    private String Correct_answer;
    private String User_answer;

    /**
     *
     */
    public IQuestionYesNo() {
        super();
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    /**
     * @param s
     * @throws QuestionException
     */
    @Override
    public void setTitle(String s) throws QuestionException {
        super.setTitle(s);

    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public String getQuestion_description() {
        return super.getQuestion_description();
    }

    /**
     * @param s
     * @throws QuestionException
     */
    @Override
    public void setQuestion_description(String s) throws QuestionException {
        super.setQuestion_description(s);

    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public IQuestionMetadata getQuestion_metadata() {
        return super.getQuestion_metadata();
    }

    /**
     * @param iQuestionMetadata
     */
    @Override
    public void setQuestion_metadata(IQuestionMetadata iQuestionMetadata) {
        super.setQuestion_metadata(iQuestionMetadata);

    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public boolean isDone() {
        return super.isDone();
    }

    /**
     * Metodo que retorna
     *
     * @param b
     */
    @Override
    public void setDone(boolean b) {
        super.setDone(b);

    }

    /**
     * Metodo que retorna
     *
     * @param s
     */
    @Override
    public void answer(String s) {
        super.answer(s);

    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public boolean evaluateAnswer() {
        return super.evaluateAnswer();
    }

    /**
     * Metodo que retorna
     *
     * @return
     */
    @Override
    public float getMark() {
        return super.getMark();
    }

    /**
     * Metodo que retorna
     *
     * @param v
     */
    @Override
    public void setMark(float v) {
        super.setMark(v);

    }

    /**
     * Método que retorna a resposta correta
     *
     * @return resposta correta
     */
    @Override
    public String getCorrect_answer() {
        return this.Correct_answer;

    }

    /**
     * Método que define a resposta correta
     *
     * @param string resposta correta como parametro
     */
    @Override
    public void setCorrect_answer(String string) {
        this.Correct_answer = string;

    }

    /**
     * Método que retorna o utilizador da resposta
     *
     * @return utilizador da resposta
     */
    @Override
    public String getUser_answer() {
        return this.User_answer;

    }

    /**
     * Método que define o utilizador da resposta
     *
     * @param string utilizador da resposta como parametro
     */
    @Override
    public void setUser_answer(String string) {
        this.User_answer = string;

    }

}
