
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
public class FestivalMusica extends Evento implements Serializable{
    private int tamanhoRecinto;
    private int capacidade;

    /**
     * Método contrutor que permite instanciar um {@link FestivalMusica festival de música}
     * @param tamanhoRecinto Tamanho do recinto do {@link FestivalMusica festival de música}
     * @param capacidade Capacidade máxima de pessoas no {@link FestivalMusica festival de música}
     * @param nome Nome do {@link FestivalMusica festival de música}
     * @param descricao Descricao do {@link FestivalMusica festival de música}
     * @param distrito Distrito do {@link FestivalMusica festival de música}
     * @param concelho Concelho do {@link FestivalMusica festival de música}
     * @param dataInicio Data de inicio do {@link FestivalMusica festival de música}
     * @param dataFim Data de fim do {{@link FestivalMusica festival de música}
     * @param lang Lingua usada nas coordenadas do {@link FestivalMusica festival de música}
     * @param precoPessoa Preco pro pessoa do {@link FestivalMusica festival de música}
     * @throws IOException
     * @throws CoordinatesNotFound 
     */
    public FestivalMusica(int tamanhoRecinto, int capacidade, String nome, String descricao, String distrito, String concelho, Calendar dataInicio, Calendar dataFim, Language lang, float precoPessoa) throws IOException, CoordinatesNotFound {
        super(nome, descricao, distrito, concelho, dataInicio, dataFim, lang, precoPessoa);
        this.tamanhoRecinto = tamanhoRecinto;
        this.capacidade = capacidade;
    }

    public int getTamanhoRecinto() {
        return tamanhoRecinto;
    }

    public void setTamanhoRecinto(int tamanhoRecinto) {
        this.tamanhoRecinto = tamanhoRecinto;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.tamanhoRecinto) ^ (Double.doubleToLongBits(this.tamanhoRecinto) >>> 32));
        hash = 97 * hash + this.capacidade;
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
        final FestivalMusica other = (FestivalMusica) obj;
        if (Double.doubleToLongBits(this.tamanhoRecinto) != Double.doubleToLongBits(other.tamanhoRecinto)) {
            return false;
        }
        return this.capacidade == other.capacidade;
    }

    @Override
    public String toString() {
        return "FestivalMusica{" + "tamanhoRecinto=" + tamanhoRecinto + ", capacidade=" + capacidade + '}';
    }
    
    @Override
    public double calcularOrcamento() {
       return this.getPrecoPessoa() * super.calcularDias();
    }

 
}
