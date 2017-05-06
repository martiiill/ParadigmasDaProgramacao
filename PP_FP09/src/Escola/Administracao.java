package Escola;

import Escola.Enums.AreaAdmin;
import Escola.Enums.Habilitacoes;
import QuatroPatas.Data;
import java.util.Objects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class Administracao extends Pessoa {
    /**
     * Habilitacoes Literarias do {@link Administracao administrativo}
     */
    private Habilitacoes habilitacoesLiterarias;
    /**
     * Area para a qual o {@link Administracao administrativo} se encontra
     * associado
     */
    private AreaAdmin area;
    /**
     * Data de contratacao do {@link Administracao administrativo}
     */
    private Data dataContratacao;
    /**
     * Percentagem do contrato do {@link Administracao administrativo}
     */
    private double percentagemContrato;
    /**
     * Data de fim de contrato do {@link Administracao administrativo}
     */
    private Data dataFimContrato;

    /**
     * Metodo construtor que permite instanciar um
     * {@link Administracao administrativo}
     *
     * @param habilitacoesLiterarias Habilitacoes Literarias do
     * {@link Administracao administrativo}
     * @param area Area para a qual o {@link Administracao administrativo} se
     * encontra associado
     * @param dataContratacao Data de contratacao do
     * {@link Administracao administrativo}
     * @param percentagemContrato Percentagem do contrato do
     * {@link Administracao administrativo}
     * @param dataFimContrato Data de fim de contrato do
     * {@link Administracao administrativo}
     * @param id Identificador do {@link Administracao administrativo}
     * @param nome Nome do {@link Administracao administrativo}
     * @param morada Morada do {@link Administracao administrativo}
     * @param nif Numero de Identificador Fiscal do
     * {@link Administracao administrativo}
     * @param telefone Telefone do {@link Administracao administrativo}
     */
    public Administracao(Habilitacoes habilitacoesLiterarias, AreaAdmin area, Data dataContratacao, double percentagemContrato, Data dataFimContrato, String id, String nome, String morada, int nif, int telefone) {
        super(id, nome, morada, nif, telefone);
        this.habilitacoesLiterarias = habilitacoesLiterarias;
        this.area = area;
        this.dataContratacao = dataContratacao;
        this.percentagemContrato = percentagemContrato;
        this.dataFimContrato = dataFimContrato;
    }

    /**
     * Permite obter qual o grau de habilitacoes que o
     * {@link Administracao administrativo} tem
     *
     * @return habilitacoes literarias do {@link Administracao administrativo}
     */
    public Habilitacoes getHabilitacoesLiterarias() {
        return habilitacoesLiterarias;
    }

    public void setHabilitacoesLiterarias(Habilitacoes habilitacoesLiterarias) {
        this.habilitacoesLiterarias = habilitacoesLiterarias;
    }

    /**
     * Permite obter qual a area para a qual o
     * {@link Administracao administrativo} foi contratado
     *
     * @return
     */
    public AreaAdmin getArea() {
        return area;
    }

    public void setArea(AreaAdmin area) {
        this.area = area;
    }

    /**
     * Permite obter a data de qual o {@link Administracao administrativo} foi
     * contratado
     *
     * @return data de contratacao do {@link Administracao administrativo}
     */
    public Data getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Data dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    /**
     * Permite obter o valor da percentagem do contrato do
     * {@link Administracao administrativo}
     *
     * @return percentagem do contrato do {@link Administracao administrativo}
     */
    public double getPercentagemContrato() {
        return percentagemContrato;
    }

    public void setPercentagemContrato(double percentagemContrato) {
        this.percentagemContrato = percentagemContrato;
    }

    /**
     * Permite obter a data de fim de contrato do
     * {@link Administracao administrativo}
     *
     * @return data de fim de contrato do {@link Administracao administrativo}
     */
    public Data getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(Data dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    @Override
    public String toString() {
        return super.toString() + "Administracao{" + "habilitacoesLiterarias=" + habilitacoesLiterarias + ", area=" + area + ", dataContratacao=" + dataContratacao + ", percentagemContrato=" + percentagemContrato + ", dataFimContrato=" + dataFimContrato + "horas=" + numHoras() + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.habilitacoesLiterarias);
        hash = 37 * hash + Objects.hashCode(this.area);
        hash = 37 * hash + Objects.hashCode(this.dataContratacao);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.percentagemContrato) ^ (Double.doubleToLongBits(this.percentagemContrato) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.dataFimContrato);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administracao other = (Administracao) obj;
        if (this.habilitacoesLiterarias != other.habilitacoesLiterarias) {
            return false;
        }
        if (this.area != other.area) {
            return false;
        }
        if (!Objects.equals(this.dataContratacao, other.dataContratacao)) {
            return false;
        }
        if (Double.doubleToLongBits(this.percentagemContrato) != Double.doubleToLongBits(other.percentagemContrato)) {
            return false;
        }
        return Objects.equals(this.dataFimContrato, other.dataFimContrato);
    }

    @Override
    double numHoras() {
        return (this.getPercentagemContrato() * 40) / 100;
    }
}
