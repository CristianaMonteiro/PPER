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
public class IQuestionMetadata implements interfaces.models.IQuestionMetadata {

    private long Timestamp_start;
    private long Timestamp_finish;

    @Override
    public long getTimestamp_start() {
        return this.Timestamp_start;

    }

    @Override
    public void setTimestamp_start(long l) {
        this.Timestamp_start = l;

    }

    @Override
    public long getTimestamp_finish() {
        return this.Timestamp_finish;

    }

    @Override
    public void setTimestamp_finish(long l) {
        this.Timestamp_finish = l;

    }

}
