/*
 *
 */
package models;

import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

/**
 * <h3>ESTG - Escola Superior de Tecnologia e Gestão <br>
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
public class IQuestionMultipleChoice extends IQuestion implements interfaces.models.IQuestionMultipleChoice {

	private String Correct_answer;
	private String[] Options;
	private String User_answer;

	/**
	 * Metodo que retorna
	 *
	 * @param o é a pergunta
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public String getAnswer() {
		return super.getAnswer();
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public int getId() {
		return super.getId();
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public boolean isEvaluateAnswer() {
		return super.isEvaluateAnswer();
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/**
	 * Metodo que retorna
	 *
	 * @param answer
	 */
	@Override
	public void answer(String answer) {
		this.User_answer = answer;
	}

	/**
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public boolean evaluateAnswer() {
		return this.User_answer.equals(this.Correct_answer);
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
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public float getMark() {
		return super.getMark();
	}

	/**
	 * Metodo que define
	 *
	 * @param mark
	 */
	@Override
	public void setMark(float mark) {
		super.setMark(mark);
	}

	/**
	 * Método que retorna as opções de resposta
	 *
	 * @return opções de resposta
	 */
	@Override
	public String[] getOptions() {

		return this.Options;
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
	 * Metodo que define
	 *
	 * @param description
	 * @throws QuestionException
	 */
	@Override
	public void setQuestion_description(String description) throws QuestionException {
		super.setQuestion_description(description);
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
	 * Metodo que retorna
	 *
	 * @return
	 */
	@Override
	public IQuestionMetadata getQuestion_metadata() {
		return super.getQuestion_metadata();
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
	 * Metodo que define
	 *
	 * @param metadata
	 */
	@Override
	public void setQuestion_metadata(IQuestionMetadata metadata) {
		super.setQuestion_metadata(metadata);
	}

	/**
	 * Metodo que retona
	 *
	 * @return
	 */
	@Override
	public String getTitle() {
		return super.getTitle();
	}

	/**
	 * Método para definir as opções de resposta
	 *
	 * @param strings opções de resposta como parametro
	 */
	@Override
	public void setOptions(String[] strings) {
		this.Options = strings;
	}

	/**
	 * Metodo que define
	 *
	 * @param title
	 * @throws QuestionException
	 */
	@Override
	public void setTitle(String title) throws QuestionException {
		super.setTitle(title);
	}

	@Override
	public boolean isDone() {
		return super.isDone();
	}

	/**
	 * Metodo que define
	 *
	 * @param status
	 */
	@Override
	public void setDone(boolean status) {
		super.setDone(status);

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
