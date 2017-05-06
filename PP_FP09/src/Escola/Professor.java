package Escola;

import Escola.Enums.Area;
import Escola.Enums.Habilitacoes;
import QuatroPatas.Data;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class Professor extends Pessoa {
    
    private static final int MAX_DISCIPLINAS = 5;
    /**
     * Habilitacoes do {@link Professor professor}
     */
    private Habilitacoes habilitacoesLiterarias;
    /**
     * Area Cientifica do {@link Professor professor}
     */
    private Area areaCientifica;
    /**
     * Data de Contratacao do {@link Professor professor}
     */
    private Data dataContratacao;
    /**
     * Data de Fim do Contrato do {@link Professor professor}
     */
    private Data dataFimContrato;
    /**
     * Numero de disciplinas que o {@link Professor professor} leciona
     */
    private int numberDisciplinas = 0 ;

    /**
     * Horas lecionadas
     */
    private int horasLecionadas;

    /**
     * Método construtor que permite instanciar um {@link Professor professor}
     *
     * @param habilitacoesLiterarias Habilitacoes literarias de um
     * {@link Professor professor}
     * @param areaCientifica Area cientifica de um {@link Professor professor}
     * @param dataContratacao Data da contratacao do {@link Professor professor}
     * @param dataFimContrato Data de fim do contrato do
     * {@link Professor professor}
     * @param id Identificador do {@link Professor professor}
     * @param nome Nome do {@link Professor professor}
     * @param morada Morada do {@link Professor professor}
     * @param nif Numero de Identificacao Fiscal do {@link Professor professor}
     * @param telefone Telefone do {@link Professor professor}
     */
    public Professor(Habilitacoes habilitacoesLiterarias, Area areaCientifica, Data dataContratacao, Data dataFimContrato, String id, String nome, String morada, int nif, int telefone) {
        super(id, nome, morada, nif, telefone);
        this.habilitacoesLiterarias = habilitacoesLiterarias;
        this.areaCientifica = areaCientifica;
        this.dataContratacao = dataContratacao;
        this.dataFimContrato = dataFimContrato;
    }

    /**
     * Permite obter as habilitacoes literarias do {@link Professor professor}
     *
     * @return habilitacoes do {@link Professor professor}
     */
    public Habilitacoes getHabilitacoesLiterarias() {
        return habilitacoesLiterarias;
    }

    public void setHabilitacoesLiterarias(Habilitacoes habilitacoesLiterarias) {
        this.habilitacoesLiterarias = habilitacoesLiterarias;
    }

    public Area getAreaCientifica() {
        return areaCientifica;
    }

    public void setAreaCientifica(Area areaCientifica) {
        this.areaCientifica = areaCientifica;
    }

    public Data getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Data dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Data getDataFimContrato() {
        return dataFimContrato;
    }

    public void setDataFimContrato(Data dataFimContrato) {
        this.dataFimContrato = dataFimContrato;
    }

    public int getNumberDisciplinas() {
        return numberDisciplinas;
    }

    public void setNumberDisciplinas(int numberDisciplinas) {
        this.numberDisciplinas = numberDisciplinas;
    }

    public int getHorasLecionadas() {
        return horasLecionadas;
    }

    public void setHorasLecionadas(int horasLecionadas) {
        this.horasLecionadas = horasLecionadas;
    }
   
    @Override
    double numHoras() {
        return this.getHorasLecionadas();
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" + "habilitacoesLiterarias=" + habilitacoesLiterarias + ", areaCientifica=" + areaCientifica + ", dataContratacao=" + dataContratacao + ", dataFimContrato=" + dataFimContrato + "horas= " + numHoras() + '}';
    }
}
