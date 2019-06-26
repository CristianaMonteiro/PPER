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
public class IQuestionMultipleChoice implements interfaces.models.IQuestionMultipleChoice {

	private String Correct_answer;
	private String[] Options;
	private String User_answer;

	@Override
	public void answer(String answer) {
		this.User_answer = answer;
	}

	@Override
	public boolean evaluateAnswer() {
		return this.evaluateAnswer();
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

	@Override
	public float getMark() {
		return this.getMark();
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

	@Override
	public String getQuestion_description() {
		return this.getQuestion_description();
	}

	@Override
	public IQuestionMetadata getQuestion_metadata() {
		return this.getQuestion_metadata();
	}

	@Override
	public String getTitle() {
		return this.getTitle();
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

	@Override
	public boolean isDone() {
//		return this.isDone();
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

	@Override
	public void setDone(boolean status) {
		this.setDone(status);

	}

	@Override
	public void setMark(float mark) {
		this.setMark(mark);
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

	@Override
	public void setQuestion_description(String description) throws QuestionException {
		this.setQuestion_description(description);
	}

	@Override
	public void setQuestion_metadata(IQuestionMetadata metadata) {
		this.setQuestion_metadata(metadata);
	}

	@Override
	public void setTitle(String title) throws QuestionException {
		this.setTitle(title);
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
