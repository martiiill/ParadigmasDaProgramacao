
package Escola;

import java.util.Objects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 * @LEI - PP
 * @author Ana A. Martins
 */
public class Curso {
    private String id;
    private String nome;
    private Disciplina[] disciplinas;

    /**
     * 
     * @param id
     * @param nome
     * @param disciplinas 
     */
    public Curso(String id, String nome, Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
        this.id = id;
        this.nome = nome;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    /**
     * 
     * @param disci
     * @return 
     */
    private boolean compararDisciplinas(Disciplina disci){
        for(int i = 0; i < this.disciplinas.length; i++){
            if(this.disciplinas[i] != null && this.disciplinas[i].equals(disci)){
                return false; // é possivel adicionar
            } else {
                return true; // nao e possivel adicionar
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nome);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nome=" + nome + '}';
    } 
}


