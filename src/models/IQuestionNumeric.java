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
public class IQuestionNumeric extends IQuestion implements interfaces.models.IQuestionNumeric {

    private double Correct_anwser;
    private double User_answer;


    /**
     * Método que retorna o titulo
     *
     * @return titulo
     */
    @Override
    public String getTitle() {
        return super.getTitle();
    }

    /**
     * Método para definir o titulo
     *
     * @param s titulo recebido como parametro
     * @throws QuestionException
     */
    @Override
    public void setTitle(String s) throws QuestionException {
        super.setTitle(s);
    }

    /**
     * Metodo que retorna a descrição da pergunta
     *
     * @return descrição da pergunta
     */
    @Override
    public String getQuestion_description() {
        return super.getQuestion_description();
    }

    /**
     * Método para definir a descrição da pergunta
     *
     * @param s descrição da pergunta recebida como parametro
     * @throws QuestionException
     */
    @Override
    public void setQuestion_description(String s) throws QuestionException {
        super.setQuestion_description(s);

    }

    /**
     * Método que retorna o metadata da pergunta
     *
     * @return metadata da pergunta
     */
    @Override
    public IQuestionMetadata getQuestion_metadata() {
        return super.getQuestion_metadata();
    }

    /**
     * Método que define o metadata da pergunta
     *
     * @param iQuestionMetadata metadata da pergunta como parametro
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
     * Metodo que define o estado da pergunta
     *
     * @param b stado da pergunta para parametro
     */
    @Override
    public void setDone(boolean b) {
        super.setDone(b);

    }

    /**
     * Método que define a resposta
     *
     * @param s reposta como parametro
     */
    @Override
    public void answer(String s) {
        super.answer(s);

    }

    /**
     * Método que retorna a avaliação da pergunta
     *
     * @return verdadeiro ou falso
     */
    @Override
    public boolean evaluateAnswer() {
        return super.evaluateAnswer();
    }

    /**
     * Método que retorna o valor da cotação
     *
     * @return valor da cotação
     */
    @Override
    public float getMark() {
        return super.getMark();
    }

    /**
     * Método que define o valor da cotação
     *
     * @param v valor da cotação como parametro
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
    public double getCorrect_anwser() {
        return this.Correct_anwser;

    }

    /**
     * Método que define a resposta correta
     *
     * @param d resposta correta como parametro
     */
    @Override
    public void setCorrect_anwser(double d) {
        this.Correct_anwser = d;

    }

    /**
     * Método que retorna o utilizador da resposta
     *
     * @return utilizador da resposta
     */
    @Override
    public double getUser_answer() {
        return this.User_answer;

    }

    /**
     * Método que define o utilizador da resposta
     *
     * @param d utilizador da resposta como parametro
     */
    @Override
    public void setUser_answer(double d) {
        this.User_answer = d;

    }

}
