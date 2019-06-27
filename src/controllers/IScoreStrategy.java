package controllers;

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
 * Autor: Cristiana Ferreira Monteiro
 * Número Mecanográfico: 8150489
 * <p>
 */
import models.IQuestion;

public class IScoreStrategy implements interfaces.controller.IScoreStrategy {

    private String CalculateScore;

    /**
     * @param iQuestions
     * @return
     */
    @Override
    public String CalculateScore(interfaces.models.IQuestion[] iQuestions) {
        return null;
    }

    /**
     *
     * @param iqs
     * @return
     */
    public String CalculateScore(IQuestion[] iqs) {
        return "teste";

    }

}
