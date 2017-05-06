package Escola;

import java.util.Arrays;
import java.util.Objects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class Disciplina{

    /**
     * Identificador da {@link Disciplina disciplina}
     */
    private String idD;
    /**
     * Nome da {@link Disciplina disciplina}
     */
    private String nomeD;

    private int horasSemanais;

    private int numeroProfessores;

    private Professor[] professores;

    public Disciplina(String idD, String nomeD, int horasSemanais) {
        this.idD = idD;
        this.nomeD = nomeD;
        this.horasSemanais = horasSemanais;
    }

    public String getIdD() {
        return idD;
    }

    public void setIdD(String idD) {
        this.idD = idD;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public int getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(int horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    public int getNumeroProfessores() {
        return numeroProfessores;
    }

    public void setNumeroProfessores(int numeroProfessores) {
        this.numeroProfessores = numeroProfessores;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.idD);
        hash = 59 * hash + Objects.hashCode(this.nomeD);
        hash = 59 * hash + this.horasSemanais;
        hash = 59 * hash + this.numeroProfessores;
        hash = 59 * hash + Arrays.deepHashCode(this.professores);
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
        final Disciplina other = (Disciplina) obj;
        if (!Objects.equals(this.idD, other.idD)) {
            return false;
        }
        if (!Objects.equals(this.nomeD, other.nomeD)) {
            return false;
        }
        if (this.horasSemanais != other.horasSemanais) {
            return false;
        }
        if (this.numeroProfessores != other.numeroProfessores) {
            return false;
        }
        return Arrays.deepEquals(this.professores, other.professores);
    }
}
