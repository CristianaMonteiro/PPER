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
import interfaces.exceptions.QuestionException;
import interfaces.models.IQuestionMetadata;

public class IQuestion implements interfaces.models.IQuestion {

    private int id;
    private static int count = 0;
    private String Title;
    private String Question_description;
    private IQuestionMetadata Question_metadata;
    private boolean Done;
    private String answer;
    private boolean evaluateAnswer;
    private float Mark;

    //Construtor por defeito q incremente o count e associa esse count ao ID
    {
        this.id = IQuestion.count++;
    }

    /**
     * Método para retornar o titulo
     *
     * @return
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     *
     * @param string
     * @throws QuestionException
     */
    public void setTitle(String string) throws QuestionException {
        this.Title = string;

    }

    /**
     *
     * @return
     */
    public String getQuestion_description() {
        return this.Question_description;

    }

    /**
     *
     * @param string
     * @throws QuestionException
     */
    public void setQuestion_description(String string) throws QuestionException {
        this.Question_description = string;

    }

    /**
     *
     * @return
     */
    public IQuestionMetadata getQuestion_metadata() {
        return this.Question_metadata;

    }

    /**
     *
     * @param iqm
     */
    public void setQuestion_metadata(IQuestionMetadata iqm) {
        this.Question_metadata = iqm;

    }

    /**
     *
     * @return
     */
    public boolean isDone() {
        return this.Done;

    }

    /**
     *
     * @param bln
     */
    public void setDone(boolean bln) {
        this.Done = bln;

    }

    /**
     *
     * @param string
     */
    @Override
    public void answer(String string) {
        this.answer = string;

    }

    /**
     *
     * @return
     */
    @Override
    public boolean evaluateAnswer() {

    }

    /**
     *
     * @param f
     */
    @Override
    public void setMark(float f) {
        this.Mark = f;

    }

    /**
     *
     * @return
     */
    @Override
    public float getMark() {
        return this.Mark;

    }

}
