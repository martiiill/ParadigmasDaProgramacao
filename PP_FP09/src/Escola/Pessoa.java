
package Escola;

import java.util.Objects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 * @LEI - PP
 * @author Ana A. Martins
 */
abstract class Pessoa {
    /**
     * Identificador da {@link Pessoa pessoa}
     */
    private String id;
    /**
     * Nome da {@link Pessoa pessoa}
     */
    private String nome;
    /**
     * Morada da {@link Pessoa pessoa}
     */
    private String morada;
    /**
     * Numero de Identificação Fiscal da {@link Pessoa pessoa}
     */
    private int nif;
    /**
     * Telefone da {@link Pessoa pessoa}
     */
    private int telefone;

    /**
     * Método construtor que permite criar uma instância de {@link Pessoa pessoa}
     * @param id Identificador da {@link Pessoa pessoa}
     * @param nome Nome da {@link Pessoa pessoa}
     * @param morada Morada da {@link Pessoa pessoa}
     * @param nif Número de Identificação Fiscal da {@link Pessoa pessoa}
     * @param telefone Telefone da {@link Pessoa pessoa}
     */
    public Pessoa(String id, String nome, String morada, int nif, int telefone) {
        this.id = id;
        this.nome = nome;
        this.morada = morada;
        this.nif = nif;
        this.telefone = telefone;
    }

    /**
     * Permite obter o valor do identificador da {@link Pessoa pessoa}
     * @return identificador da {@link Pessoa pessoa}
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Permite obter o valor do nome da {@link Pessoa pessoa}
     * @return nome da {@link Pessoa pessoa}
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Permite obter o valor da morada da {@link Pessoa pessoa}
     * @return morada da {@link Pessoa pessoa}
     */
    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Permite obter o valor do Número Identificador Fiscal da {@link Pessoa pessoa}
     * @return número identificador fiscal da {@link Pessoa pessoa}
     */
    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {      
        this.nif = nif;
    }

    /**
     * Permite obter o valor do telefone da {@link Pessoa pessoa}
     * @return telefone da {@link Pessoa pessoa}
     */
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    abstract double numHoras();

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.morada);
        hash = 89 * hash + this.nif;
        hash = 89 * hash + this.telefone;
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.morada, other.morada)) {
            return false;
        }
        if (this.nif != other.nif) {
            return false;
        }
        return this.telefone == other.telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + ", morada=" + morada + ", nif=" + nif + ", telefone=" + telefone + '}';
    }
}
