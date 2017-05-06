
package JaFui;

import Enumerations.Language;
import Exceptions.CoordinatesNotFound;
import Roulote.Produto;
import Roulote.Roulote;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class FeiraGastronomica extends Evento implements Serializable {

    /**
     * Numero de restaunrantes presentes na {@link FeiraGastronomica Feira Gastronomica}
     */
    private int numeroRestaurantes;

    /**
     * Método construtor que permite criar uma instancia de {@link FeiraGastronomica Feira Gastronomica}
     * @param numeroRestaurantes Numero de restaurantes presentes na {@link FeiraGastronomica Feira Gastronomica}
     * @param nome Nome do {@link FeiraGastronomica Feira Gastronomica}
     * @param descricao Descricao do {@link FeiraGastronomica Feira Gastronomica}
     * @param distrito Distrito do {@link FeiraGastronomica Feira Gastronomica}
     * @param concelho Concelho do {@link FeiraGastronomica Feira Gastronomica}
     * @param dataInicio Data de inicio do {@link FeiraGastronomica Feira Gastronomica}
     * @param dataFim Data de fim do {@link FeiraGastronomica Feira Gastronomica}
     * @param lang Lingua usada nas coordenadas do {@link FeiraGastronomica Feira Gastronomica}
     * @param precoPessoa Preco pro pessoa do {@link FeiraGastronomica Feira Gastronomica}
     * @throws IOException
     * @throws CoordinatesNotFound 
     */
    public FeiraGastronomica(int numeroRestaurantes, String nome, String descricao, String distrito, String concelho, Calendar dataInicio, Calendar dataFim, Language lang, float precoPessoa) throws IOException, CoordinatesNotFound {
        super(nome, descricao, distrito, concelho, dataInicio, dataFim, lang, precoPessoa);
        this.numeroRestaurantes = numeroRestaurantes;
    }

    public int getNumeroRestaurantes() {
        return numeroRestaurantes;
    }

    public void setNumeroRestaurantes(int numeroRestaurantes) {
        this.numeroRestaurantes = numeroRestaurantes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numeroRestaurantes;
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
        final FeiraGastronomica other = (FeiraGastronomica) obj;
        return this.numeroRestaurantes == other.numeroRestaurantes;
    }

    /**
     * Método que permite obter a representação textual da {@link FeiraGastronomica Feira Gastronomica}
     * @return representação textual da {@link FeiraGastronomica Feira Gastronomica}
     */
    @Override
    public String toString() {
        return "FeiraGastronomica{" + "numeroRestaurantes=" + numeroRestaurantes + '}';
    }

    /**
     * Método que permite calcular o orcamento utilizado na realização da 
     * {@link FeiraGastronomica Feira Gastronomica}
     * @return valor do orcamento, em euros
     */
    @Override
    public double calcularOrcamento() {
        return super.calcularDias() * super.getPrecoPessoa();
    }


}
