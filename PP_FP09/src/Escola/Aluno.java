package Escola;

import Escola.Enums.Tipo;
import QuatroPatas.Data;
import java.util.Arrays;
import java.util.Objects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class Aluno extends Pessoa {

    private static final int MAX_DISCIPLINAS = 10;
    /**
     * Data da Matricula do {@link Aluno aluno}
     */
    private Data dataMatricula;
    /**
     * Tipo de {@link Aluno aluno}
     */
    private Tipo tipo;

    /**
     * Disciplinas em que o aluno esta inscrito
     */
    private Disciplina[] disciplinas;

    /**
     * Numero de inscricaos em cada disciplina. No maximo 10.
     */
    private int numeroIncricoes;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Aluno aluno}
     *
     * @param dataMatricula Data da Matricula do {@link Aluno aluno}
     * @param tipo Tipo de {@link Aluno aluno}
     * @param id Identificador do {@link Aluno aluno}
     * @param nome Nome do {@link Aluno aluno}
     * @param morada Morada do {@link Aluno aluno}
     * @param nif Numero Identificador Fiscal do {@link Aluno aluno}
     * @param telefone Telefone do {@link Aluno aluno}
     * @param curso Curso que o {@link Aluno aluno} frequenta
     */
    public Aluno(Data dataMatricula, Tipo tipo, String id, String nome, String morada, int nif, int telefone, Curso curso) {
        super(id, nome, morada, nif, telefone);
        this.dataMatricula = dataMatricula;
        this.tipo = tipo;
    }

    /**
     * Permite obter o valor da data de matricula do {@link Aluno aluno}
     *
     * @return data de matricula do {@link Aluno aluno}
     */
    public Data getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Data dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    /**
     * Permite obter o tipo de {@link Aluno aluno}
     *
     * @return tipo de {@link Aluno aluno}
     */
    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumeroIncricoes() {
        return numeroIncricoes;
    }

    public void setNumeroIncricoes(int numeroIncricoes) {
        this.numeroIncricoes = numeroIncricoes;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        if (disciplinas.length <= MAX_DISCIPLINAS) {
            this.disciplinas = disciplinas;
        } else {
            System.out.println("Erro");
        }
    }

    public int getNumeroDisciplinas() {
        int numeroDisciplinas = 0;
        if (this.disciplinas == null) {
            return numeroDisciplinas = 0;
        }
        for (int i = 0; i < this.disciplinas.length; ++i) {
            if (this.disciplinas[i] != null) {
                numeroDisciplinas++;
            }
        }
        return numeroDisciplinas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.dataMatricula);
        hash = 41 * hash + Objects.hashCode(this.tipo);
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
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.dataMatricula, other.dataMatricula)) {
            return false;
        }
        return this.tipo == other.tipo;
    }

    @Override
    double numHoras() {
        double horas = 0.0;
        for (int i = 0; i < this.getNumeroIncricoes(); i++) {
            horas += this.getDisciplinas()[i].getHorasSemanais();
        }
        return horas;
    }

    @Override
    public String toString() {
        return "Aluno{" + "dataMatricula=" + dataMatricula + ", tipo=" + tipo + ", disciplinas=" + Arrays.toString(disciplinas) + ", numeroIncricoes=" + numeroIncricoes + "horas = " + numHoras() + '}';
    }
}
