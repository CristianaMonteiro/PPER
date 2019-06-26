/*
 *
 */
package controllers;

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
import interfaces.controller.IScoreStrategy;
import interfaces.controller.ITestStatistics;
import interfaces.exceptions.TestException;
import interfaces.models.IQuestion;

public class ITest implements interfaces.controller.ITest {

	/**
	 * Variável para countar espaços ocupados
	 */
	private static int count = 0;

	/**
	 * Tamanho máximo para instanciar o array
	 */
	private static final int MAX_SIZE = 100;

	private boolean Complete;
	private IQuestion[] IQuestion;
	private boolean loadFromJSONFile;
	private int numberQuestions;
	private boolean Question;
	private boolean removeQuestion;
	private boolean saveTestResults;

	private String Score;

	private IScoreStrategy ScoreStrategy;

	private ITestStatistics TestStatistics;

	/**
	 * Método que adiciona uma pergunta ao array de perguntas
	 *
	 * @param iq pergunta
	 * @return verdadeiro ou falso
	 * @throws TestException
	 */
	@Override
	public boolean addQuestion(IQuestion iq) throws TestException {
		this.IQuestion[count] = iq;
		count++;

		// Verifica se as perguntas são iguais
		return this.IQuestion[count - 1].equals(iq);
	}

	/**
	 *
	 * @return
	 */
	// <h3>DUVIDAS</h3> -> how to calculate score
	@Override
	public String calculateScore() {
		return this.Score;
	}

	/**
	 * Método que retorna a pergunta na posição i passada po parametro
	 *
	 * @param i posição da pergunta no array
	 * @return pergunta
	 * @throws TestException
	 */
	@Override
	public IQuestion getQuestion(int i) throws TestException {
		return this.IQuestion[i];
	}

	/**
	 * Método que retorna a estratégia da pontuação
	 *
	 * @return estratégia da pontuação
	 */
	@Override
	public IScoreStrategy getScoreStrategy() {
		return this.ScoreStrategy;
	}

	/**
	 * Método que retorna a estatistica do teste
	 *
	 * @return estatistica do teste
	 */
	@Override
	public ITestStatistics getTestStatistics() {
		return this.TestStatistics;

	}

	/**
	 *
	 * @return
	 */
	// <h3>DUVIDAS</h3>
	@Override
	public boolean isComplete() {
		return this.Complete;
	}

	/**
	 *
	 * @param string
	 * @return
	 * @throws TestException
	 */
	// <h3>DUVIDAS</h3> --> se e para ler como objeto ou nao
	@Override
	public boolean loadFromJSONFile(String string) throws TestException {

	}

	/**
	 * Método que retorna o numero de perguntas
	 *
	 * @return numero da perguntas existente no teste
	 */
	// <h3>DUVIDAS</h3> -> confirmar
	@Override
	public int numberQuestions() {
		return count;
	}

	/**
	 * Método que remove a pergunta
	 *
	 * @param i
	 * @return remoção
	 */
	@Override
	public boolean removeQuestion(int i) {
		// Start for in i position
		for (int j = i; j < ITest.count - 1; j++) {
			// Change IQuestion in I position to the next
			this.IQuestion[j] = this.IQuestion[j + 1];
		}

		// Put last position in null
		this.IQuestion[ITest.count - 1] = null;

		if (this.IQuestion[ITest.count - 1] == null) {
			// Decrement count
			ITest.count--;

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método para remover uma pergunta do teste
	 *
	 * @param iq pergunta a remover
	 * @return <CODE>true</CODE> se a pergunta for removida com sucesso
	 *         <CODE>false</CODE> se ocorrer algum erro ou se a pergunta não for
	 *         removida
	 */
	@Override
	public boolean removeQuestion(IQuestion iq) {
		for (int i = 0; i < ITest.count - 1; i++) {
			// Verify if is equals
			if (this.IQuestion[i].equals(iq)) {
				// EQUALS = TRUE -> change this positio for the next position
				this.IQuestion[i] = this.IQuestion[i + 1];
			}
		}

		// Put last position in null
		this.IQuestion[ITest.count - 1] = null;

		if (this.IQuestion[ITest.count - 1] == null) {
			// Decrement count
			ITest.count--;

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Método que guarda os resultados do teste
	 *
	 * @param string
	 * @return resultados do teste
	 * @throws TestException
	 */
	// <h3>DUVIDAS</h3>
	@Override
	public boolean saveTestResults(String string) throws TestException {

	}

	/**
	 * Método para definir a estratégia de pontuação
	 *
	 * @param iss estratégia de pontuação
	 */
	@Override
	public void setScoreStrategy(IScoreStrategy iss) {
		this.ScoreStrategy = iss;
	}

}
