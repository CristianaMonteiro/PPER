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
     * Método para retornar a data e hora de inicio da resposta
     *
     * @return data e hora de inicio da resposta
     */
    @Override
    public long getTimestamp_start() {
        return this.timestampStart;

    }

    /**
     * Método para definir a data e hora de inicio da resposta
     *
     * @param timestampStart data e hora de inicio da resposta como parametro
     */
    @Override
    public void setTimestamp_start(long timestampStart) {
        this.timestampStart = timestampStart;

    }

    /**
     * Método para retornar data e hora de fim da resposta
     *
     * @return data e hora de fim da resposta
     */
    @Override
    public long getTimestamp_finish() {
        return this.timestampFinish;

    }

    /**
     * Método para definir a data e hora de fim da resposta
     *
     * @param timestampFinish data e hora de fim da resposta como parametro
     */
    @Override
    public void setTimestamp_finish(long timestampFinish) {
        this.timestampFinish = timestampFinish;

    }

}
