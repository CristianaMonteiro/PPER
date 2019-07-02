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
     * Define a resposta da pergunta e define a pergunta como respondida
     *
     * @param userAnswer a resposta de uma pergunta
     */
    @Override
    public void answer(String userAnswer) {
        this.answer = userAnswer;
        this.setDone(true);
        questionMetadata.setTimestamp_finish(System.currentTimeMillis());
    }

    /**
     * Compara duas intancias de peguntas
     *
     * @param obj a pergunta que vai ser comparada com esta
     * @return true se forem iguais, false se forem diferentes
     */
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

    /**
     * Método que gera um código único com base nas propriedades da pergunta
     *
     * @return o código
     */
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

    /**
     * Avalia a resposta de uma pergunta
     *
     *
     * @return true se a resposta está correta ou false caso contrário
     */
    @Override
    public abstract boolean evaluateAnswer();

    /**
     * Método
     *
     * @return
     */
    public String getAnswer() {
        return this.answer;
    }

    /**
     * Método que retorna o ID
     *
     * @return
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
     * Método obtém a descrição de uma pergunta
     *
     * @return descrição de uma pergunta
     */
    @Override
    public String getQuestion_description() {
        return this.questionDescription;
    }

    /**
     * Método que obtém um objeto que implementa metadados de uma pergunta
     *
     * @return um objeto que implementa metadados de uma pergunta
     */
    @Override
    public QuestionMetadata getQuestion_metadata() {
        return this.questionMetadata;
    }

    /**
     * Método que define um objeto que implementa metadados de uma pergunta
     *
     * @param iQuestionMetadata um objeto que implementa metadados de uma
     * pergunta
     */
    @Override
    public void setQuestion_metadata(IQuestionMetadata iQuestionMetadata) {
        this.questionMetadata = (QuestionMetadata) iQuestionMetadata;
    }

    /**
     * Método que obtém o título de uma pergunta
     *
     * @return o título de uma pergunta
     */
    @Override
    public String getTitle() {
        return this.title;
    }

    /**
     * Método que verifica se a pergunta é respondida
     *
     * @return true se o pergunta for respondida false caso contrário
     */
    @Override
    public boolean isDone() {
        return this.done;
    }

    /**
     * Método que define se a pergunta é respondida
     *
     * @param done booleano se a pergunta for respondida
     */
    @Override
    public void setDone(boolean done) {
        this.done = done;
    }

    /**
     * Método para
     *
     * @param mark
     */
    @Override
    public void setMark(float mark) {
        this.mark = mark;
    }

    /**
     * Método que define a descrição de uma pergunta
     *
     * @param questionDescription a descrição de uma pergunta
     * @throws QuestionException se a descrição é nula
     */
    @Override
    public void setQuestion_description(String questionDescription) throws QuestionException {
        this.questionDescription = questionDescription;
    }

    /**
     * Método que define o título de uma pergunta
     *
     * @param title o título de uma pergunta
     * @throws QuestionException se título é nulo
     */
    @Override
    public void setTitle(String title) throws QuestionException {
        this.title = title;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Question{" + "answer=" + answer + ", done=" + done + ", id=" + id + ", mark=" + mark + ", questionDescription=" + questionDescription + ", questionMetadata=" + questionMetadata + ", title=" + title + '}';
    }
}
