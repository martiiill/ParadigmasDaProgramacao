
package JaFui;

import Enumerations.Language;
import Exceptions.CoordinatesNotFound;
import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class ExposicaoArte extends Evento implements Serializable {

    /**
     * Artistas que estão na {@link ExposicaoArte esposição de arte}
     */
    private String[] artistas;

    /**
     * Método que permite criar uma instancia de {@link ExposicaoArte exposicao de arte}
     * @param artistas Colecao de artistas que estão na {@link ExposicaoArte esposição de arte}
     * @param nome Nome do {@link ExposicaoArte esposição de arte}
     * @param descricao Descricao do {@link ExposicaoArte esposição de arte}
     * @param distrito Distrito do {@link ExposicaoArte esposição de arte}
     * @param concelho Concelho do {@link ExposicaoArte esposição de arte}
     * @param dataInicio Data de inicio do {@link ExposicaoArte esposição de arte}
     * @param dataFim Data de fim do {@link ExposicaoArte esposição de arte}
     * @param lang Lingua usada nas coordenadas do {@link ExposicaoArte esposição de arte}
     * @param precoPessoa Preco pro pessoa do {@link ExposicaoArte esposição de arte}
     * @throws IOException
     * @throws CoordinatesNotFound 
     */
    public ExposicaoArte(String[] artistas, String nome, String descricao, String distrito, String concelho, Calendar dataInicio, Calendar dataFim, Language lang, float precoPessoa) throws IOException, CoordinatesNotFound {
        super(nome, descricao, distrito, concelho, dataInicio, dataFim, lang, precoPessoa);
        this.artistas = artistas;
    }

    public String[] getArtistas() {
        return artistas;
    }

    public void setArtistas(String[] artistas) {
        this.artistas = artistas;
    }

    /**
     * Método que permite obter o numero de domingos entre a data de inicio e a 
     * data de fim
     * @return numero de domingos
     */
    private int calcularDomingos() {
        int domingos = 0;
        Calendar c = Calendar.getInstance();

        while (getDataFim().compareTo(getDataInicio()) < 1) {
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                domingos++;
                c.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
        return domingos;
    }

    /**
     * Método que permite calcular o valor do orcamento que foi necessário para
     * a realização da {@link ExposicaoArte esposição de arte}
     * @return valor do orcamento gasto, em euros
     */
    @Override
    public double calcularOrcamento() {
        double percentagem = (super.getPrecoPessoa() * 30) / 100;
        double domingos = (calcularDomingos() * 30) / 100;
        return (super.calcularDias() * super.getPrecoPessoa()) + domingos;
    }

}
