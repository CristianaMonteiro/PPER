package src.controllers;

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
import interfaces.models.IQuestion;

public class ITestStatistics implements interfaces.controller.ITestStatistics {

	private double meanTimePerAnswer;
	private double standardDeviationTimePerAnsewer;
	private double correctAnswerPecentage;
	private double incorrectAnswerPecentage;
	private int correctAnswer;
	private int incorrectAnswer;
	private IQuestion[] incorrectAnswers;
	private IQuestion[] correctAnswers;


	@Override
	public double meanTimePerAnswer() {

	}

	@Override
	public double standardDeviationTimePerAnsewer() {

	}

	@Override
	public double correctAnswerPecentage() {

	}

	@Override
	public double incorrectAnswerPecentage() {

	}

	@Override
	public int correctAnswer() {

	}

	@Override
	public int incorrectAnswer() {

	}

	@Override
	public IQuestion[] incorrectAnswers() {

	}

	@Override
	public IQuestion[] correctAnswers() {
		return null;

	}

}
