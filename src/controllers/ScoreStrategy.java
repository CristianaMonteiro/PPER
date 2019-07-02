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
 * Autor: Cristiana Ferreira Monteiro Número Mecanográfico: 8150489
 * <p>
 */
public class ScoreStrategy implements interfaces.controller.IScoreStrategy {

    private String calculateScore;

    /**
     * @param iQuestions
     * @return
     */
    @Override
    public String CalculateScore(interfaces.models.IQuestion[] iQuestions) {

        float totalMarks = 0;
        float correctMarks = 0;

        for (int i = 0; i < iQuestions.length; i++) {
            float mark = iQuestions[i].getMark();
            totalMarks += mark;

            if (iQuestions[i].evaluateAnswer()) {
                correctMarks += mark;
            }
        }

        //converte para um sistema de 100% (percentagem)
        double percentagemFinal = correctMarks * 100 / totalMarks;

        if (percentagemFinal < 50) {
            return "Não Satisfaz";
        } else if (percentagemFinal < 70) {
            return "Satisfaz";
        } else if (percentagemFinal < 90) {
            return "Satisfaz Bastante";
        } else {
            return "Excelente";
        }

    }

}
