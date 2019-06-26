/*
 * 
 */
package models;

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
 *
 * Autor: Cristiana Ferreira Monteiro
 * Número Mecanográfico: 8150489
 * <p>
 */
import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

public class IQuestion implements interfaces.models.IQuestion {

	private static int count = 0;
	private String answer;
	private boolean Done;
	private boolean evaluateAnswer;
	private int id;
	private float Mark;
	private String Question_description;
	private IQuestionMetadata Question_metadata;
	private String Title;

	/**
	 * Construtor por defeito que incremente o count e associa esse count ao ID
	 */
	{
		this.id = IQuestion.count++;
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
	 * Método que verifica se duas perguntas são iguais
	 *
	 * @param o é a pergunta
	 * @return verdadeiro ou falso
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof IQuestion)) {
			return false;
		}
		IQuestion iQuestion = (IQuestion) o;
		return this.id == iQuestion.id && this.isDone() == iQuestion.isDone()
				&& this.evaluateAnswer == iQuestion.evaluateAnswer
				&& Float.compare(iQuestion.getMark(), this.getMark()) == 0
				&& this.getTitle().equals(iQuestion.getTitle())
				&& this.getQuestion_description().equals(iQuestion.getQuestion_description())
				&& this.getQuestion_metadata().equals(iQuestion.getQuestion_metadata())
				&& this.answer.equals(iQuestion.answer);
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
		return this.Mark;
	}

	/**
	 * Método para retornar a descrição da pergunta
	 *
	 * @return descrição da pergunta
	 */
	@Override
	public String getQuestion_description() {
		return this.Question_description;

	}

	/**
	 * Método que retorna o metadata de uma pergunta
	 *
	 * @return metadata de uma pergunta
	 */
	@Override
	public IQuestionMetadata getQuestion_metadata() {
		return this.Question_metadata;

	}

	/**
	 * Método para retornar o titulo
	 *
	 * @return titulo
	 */
	@Override
	public String getTitle() {
		return this.Title;
	}

	/**
	 * Método que associa um código único a cada campo
	 *
	 * @return código
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.getTitle(), this.getQuestion_description(), this.getQuestion_metadata(),
				this.isDone(), this.answer, this.evaluateAnswer, this.getMark());
	}

	/**
	 * Método que retorna o estado da pergunta
	 *
	 * @return estado da perdunta (verdadeiro ou falso)
	 */
	@Override
	public boolean isDone() {
		return this.Done;

	}

	/**
	 * Método que retorna a avaliação da resposta
	 *
	 * @return verdadeiro ou falso
	 */
	public boolean isEvaluateAnswer() {
		return this.evaluateAnswer;
	}

	/**
	 * Método para definir o estado da pergunta
	 *
	 * @param bln estado da pergunta recebido como parametro
	 */
	@Override
	public void setDone(boolean bln) {
		this.Done = bln;

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

	/**
	 * Método para definir descrição da pergunta
	 *
	 * @param string descirção da pergunta recebido como parametro
	 * @throws QuestionException
	 */
	@Override
	public void setQuestion_description(String string) throws QuestionException {
		this.Question_description = string;

	}

	/**
	 * Método para definir o metadata de uma pergunta
	 *
	 * @param iqm metadata de uma pergunta recebida como parametro
	 */
	@Override
	public void setQuestion_metadata(IQuestionMetadata iqm) {
		this.Question_metadata = iqm;

	}

	/**
	 * Método para definir titulo
	 *
	 * @param string titulo recebido por parâmetro
	 * @throws QuestionException
	 */
	@Override
	public void setTitle(String string) throws QuestionException {
		this.Title = string;

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

}
