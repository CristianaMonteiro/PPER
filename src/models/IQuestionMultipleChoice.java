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
public class IQuestionMultipleChoice implements interfaces.models.IQuestionMultipleChoice {

    private String[] Options;
    private String Correct_answer;
    private String User_answer;

    @Override
    public String[] getOptions() {
        return this.Options;

    }

    @Override
    public void setOptions(String[] strings) {
        this.Options = strings;

    }

    @Override
    public String getCorrect_answer() {
        return this.Correct_answer;

    }

    @Override
    public void setCorrect_answer(String string) {
        this.Correct_answer = string;

    }

    @Override
    public String getUser_answer() {
        return this.User_answer;

    }

    @Override
    public void setUser_answer(String string) {
        this.User_answer = string;

    }
}
