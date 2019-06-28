/*
 *
 */
package models;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

import java.util.Objects;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico de Porto <br>
 * LEI - Licenciatura em Engenharia Informática <br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: Trabalho Época de Recurso </strong><br>
 * <p>
 * Autor: Cristiana Ferreira Monteiro Número Mecanográfico: 8150489
 * <p>
 */
public abstract class Question implements interfaces.models.IQuestion {

    private static int count = 0;
    private String answer;
    private boolean done;
    private int id;
    private float mark;
    private String questionDescription;
    private QuestionMetadata questionMetadata;
    private String title;

    public Question(String answer, boolean done, float mark, String questionDescription, String title) {
        this.id = Question.count++;
        this.answer = answer;
        this.done = done;
        this.mark = mark;
        this.questionDescription = questionDescription;
        this.questionMetadata = new QuestionMetadata();
        this.title = title;
    }

    /**
     * Método para definir a resposta para a pergunta
     *
     * @param userAnswer resposta da pergunta recebido como parametro
     */
    @Override
    public void answer(String userAnswer) {
        this.answer = userAnswer;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.done != other.done) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.mark) != Float.floatToIntBits(other.mark)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.questionDescription, other.questionDescription)) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return Objects.equals(this.questionMetadata, other.questionMetadata);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.answer);
        hash = 23 * hash + (this.done ? 1 : 0);
        hash = 23 * hash + this.id;
        hash = 23 * hash + Float.floatToIntBits(this.mark);
        hash = 23 * hash + Objects.hashCode(this.questionDescription);
        hash = 23 * hash + Objects.hashCode(this.questionMetadata);
        hash = 23 * hash + Objects.hashCode(this.title);
        return hash;
    }

    @Override
    public abstract boolean evaluateAnswer();

    /**
     * Método que retorna a resposta a uma pergunta
     *
     * @return resposta
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * Método que retorna o ID
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Método que retorna o valor da cotação
     *
     * @return valor da cotação
     */
    @Override
    public float getMark() {
        return this.mark;
    }

    /**
     * Método para retornar a descrição da pergunta
     *
     * @return descrição da pergunta
     */
    @Override
    public String getQuestion_description() {
        return this.questionDescription;

    }

    /**
     * Método que retorna o metadata de uma pergunta
     *
     * @return metadata de uma pergunta
     */
    @Override
    public QuestionMetadata getQuestion_metadata() {
        return this.questionMetadata;

    }

    @Override
    public void setQuestion_metadata(IQuestionMetadata iQuestionMetadata) {
        this.questionMetadata = (QuestionMetadata) iQuestionMetadata;
    }

    /**
     * Método para retornar o titulo
     *
     * @return titulo
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Método que associa um código único a cada campo
     *
     * @return código
     */
    /*@Override
	public int hashCode() {
		return Objects.hash(this.id, this.getTitle(), this.getQuestion_description(), this.getQuestion_metadata(),
				this.isDone(), this.answer, this.evaluateAnswer, this.getMark());
	}*/
    /**
     * Método que retorna o estado da pergunta
     *
     * @return estado da perdunta (verdadeiro ou falso)
     */
    @Override
    public boolean isDone() {
        return this.done;

    }

    /**
     * Método para definir o estado da pergunta
     *
     * @param done estado da pergunta recebido como parametro
     */
    @Override
    public void setDone(boolean done) {
        this.done = done;

    }

    /**
     * Método para definir o valor da cotação
     *
     * @param f valor da cotação recebido como parametro
     */
    @Override
    public void setMark(float mark) {
        this.mark = mark;
    }

    /**
     * Método para definir descrição da pergunta
     *
     * @param questionDescription descirção da pergunta recebido como parametro
     * @throws QuestionException
     */
    @Override
    public void setQuestion_description(String questionDescription) throws QuestionException {
        this.questionDescription = questionDescription;

    }

    /**
     * Método para definir titulo
     *
     * @param title titulo recebido por parâmetro
     * @throws QuestionException
     */
    @Override
    public void setTitle(String title) throws QuestionException {
        this.title = title;

    }

    @Override
    public String toString() {
        return "Question{" + "answer=" + answer + ", done=" + done + ", id=" + id + ", mark=" + mark + ", questionDescription=" + questionDescription + ", questionMetadata=" + questionMetadata + ", title=" + title + '}';
    }

}