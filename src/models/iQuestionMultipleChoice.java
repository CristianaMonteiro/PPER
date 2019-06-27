/*
 *
 */
package models;

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
public class iQuestionMultipleChoice implements interfaces.models.IQuestionMultipleChoice {

	private String Correct_answer;
	private String[] Options;
	private String User_answer;

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
	 * Método que retorna as opções de resposta
	 *
	 * @return opções de resposta
	 */
	@Override
	public String[] getOptions() {

		return this.Options;
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
	public void setQuestion_metadata(iQuestionMetadata metadata) {
		super.setQuestion_metadata(metadata);
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
	 * Método que define o utilizador da resposta
	 *
	 * @param string utilizador da resposta como parametro
	 */
	@Override
	public void setUser_answer(String string) {
		this.User_answer = string;

	}
}
