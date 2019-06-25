package models;

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
public class IQuestionNumeric implements interfaces.models.IQuestionNumeric {

    private double Correct_anwser;
    private double User_answer;

    @Override
    public double getCorrect_anwser() {
        return this.Correct_anwser;

    }

    @Override
    public void setCorrect_anwser(double d) {
        this.Correct_anwser = d;

    }

    @Override
    public double getUser_answer() {
        return this.User_answer;

    }

    @Override
    public void setUser_answer(double d) {
        this.User_answer = d;

    }

}
