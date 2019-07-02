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
public class QuestionMetadata implements interfaces.models.IQuestionMetadata {

    private long timestampStart;
    private long timestampFinish;

    /**
     * Método que obtém um timestamp marcando o início da resposta da pergunta
     *
     * @return um timestamp marcando o início da resposta da pergunta
     */
    @Override
    public long getTimestamp_start() {
        return this.timestampStart;

    }

    /**
     * Método que define o início da resposta da pergunta
     *
     * @param timestampStart um timestamp marcando o início da resposta da
     * pergunta
     */
    @Override
    public void setTimestamp_start(long timestampStart) {
        this.timestampStart = timestampStart;

    }

    /**
     * Método que obtém um timestamp marcando no final da resposta da pergunta
     *
     * @return um timestamp marcando o final da resposta da pergunta
     */
    @Override
    public long getTimestamp_finish() {
        return this.timestampFinish;

    }

    /**
     * Método que define o término da resposta da pergunta
     *
     * @param timestampFinish um timestamp marcando o final da resposta da
     * pergunta
     */
    @Override
    public void setTimestamp_finish(long timestampFinish) {
        this.timestampFinish = timestampFinish;

    }

}
