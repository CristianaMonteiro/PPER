package models;

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
import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

import java.util.Objects;

public class IQuestion implements interfaces.models.IQuestion {

    private int id;
    private static int count = 0;
    private String Title;
    private String Question_description;
    private IQuestionMetadata Question_metadata;
    private boolean Done;
    private String answer;
    private boolean evaluateAnswer;
    private float Mark;

    /**
     * Construtor por defeito que incremente o count e associa esse count ao ID
     */
    {
        this.id = IQuestion.count++;
    }

    /**
     * Método que retorna o ID
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Método que retorna a resposta a uma pergunta
     *
     * @return resposta
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Método que retorna a avaliação da resposta
     *
     * @return verdadeiro ou falso
     */
    public boolean isEvaluateAnswer() {
        return evaluateAnswer;
    }

    /**
     * Método que cria uma única string com várias strings
     *
     * @return string unica
     */
    @Override
    public String toString() {

        String str = "Question: " + this.getId() + "\n" + "Title: " + this.getTitle() + "\n" + "Question description: "
                + this.getQuestion_description() + "\n" + "Question metadata: " + this.getQuestion_metadata() + "\n"
                + "Done: " + this.isDone() + "\n" + "answer: " + this.getAnswer() + "\n" + "evaluate Answer: "
                + this.evaluateAnswer() + "\n" + "Mark: " + this.getMark();
        return str;
    }

    /**
     * Método para retornar o titulo
     *
     * @return titulo
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Método para definir titulo
     *
     * @param string titulo recebido por parâmetro
     * @throws QuestionException
     */
    public void setTitle(String string) throws QuestionException {
        this.Title = string;

    }

    /**
     * Método para retornar a descrição da pergunta
     *
     * @return descrição da pergunta
     */
    public String getQuestion_description() {
        return this.Question_description;

    }

    /**
     * Método para definir descrição da pergunta
     *
     * @param string descirção da pergunta recebido como parametro
     * @throws QuestionException
     */
    public void setQuestion_description(String string) throws QuestionException {
        this.Question_description = string;

    }

    /**
     * Método que retorna o metadata de uma pergunta
     *
     * @return metadata de uma pergunta
     */
    public IQuestionMetadata getQuestion_metadata() {
        return this.Question_metadata;

    }

    /**
     * Método para definir o metadata de uma pergunta
     *
     * @param iqm metadata de uma pergunta recebida como parametro
     */
    public void setQuestion_metadata(IQuestionMetadata iqm) {
        this.Question_metadata = iqm;

    }

    /**
     * Método que verifica se duas perguntas são iguais
     *
     * @param o é a pergunta
     * @return verdadeiro ou falso
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IQuestion)) return false;
        IQuestion iQuestion = (IQuestion) o;
        return id == iQuestion.id &&
                isDone() == iQuestion.isDone() &&
                evaluateAnswer == iQuestion.evaluateAnswer &&
                Float.compare(iQuestion.getMark(), getMark()) == 0 &&
                getTitle().equals(iQuestion.getTitle()) &&
                getQuestion_description().equals(iQuestion.getQuestion_description()) &&
                getQuestion_metadata().equals(iQuestion.getQuestion_metadata()) &&
                answer.equals(iQuestion.answer);
    }

    /**
     * Método que associa um código único a cada campo
     *
     * @return código
     */
    @Override
    public int hashCode() {
        return Objects.hash(id, getTitle(), getQuestion_description(), getQuestion_metadata(), isDone(), answer,
                evaluateAnswer, getMark());
    }

    /**
     * Método que retorna o estado da pergunta
     *
     * @return estado da perdunta (verdadeiro ou falso)
     */
    public boolean isDone() {
        return this.Done;

    }

    /**
     * Método para definir o estado da pergunta
     *
     * @param bln estado da pergunta recebido como parametro
     */
    public void setDone(boolean bln) {
        this.Done = bln;

    }

    /**
     * Método para definir a resposta para a pergunta
     *
     * @param string resposta da pergunta recebido como parametro
     */
    @Override
    public void answer(String string) {
        this.answer = string;

    }

    /**
     * Método
     *
     * @return
     */
    @Override
    public boolean evaluateAnswer() {

    }

    /**
     * Método que retorna o valor da cotação
     *
     * @return valor da cotação
     */
    @Override
    public float getMark() {
        return this.Mark;

    }

    /**
     * Método para definir o valor da cotação
     *
     * @param f valor da cotação recebido como parametro
     */
    @Override
    public void setMark(float f) {
        this.Mark = f;

    }

}
