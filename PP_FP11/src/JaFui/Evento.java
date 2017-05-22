
package JaFui;

import ContainerOfObjects.Comparator;
import Enumerations.Language;
import Exceptions.CoordinatesNotFound;
import geocoderapi.CalculateCoordinates;
import geocoderapi.Coordinate;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public abstract class Evento implements Serializable, Comparator {

    private String nome;
    private String descricao;
    private String distrito;
    private String concelho;
    private Calendar dataInicio;
    private Calendar dataFim;
    private String local;
    private Language lang; //por causa do GeoCoderApi
    private float precoPessoa;

    /**
     * Método construtor que permite instanciar um {@link Evento evento}
     * @param nome Nome do {@link Evento evento}
     * @param descricao Descricao do {@link Evento evento}
     * @param distrito Distrito do {@link Evento evento}
     * @param concelho Concelho do {@link Evento evento}
     * @param dataInicio Data de inicio do {@link Evento evento}
     * @param dataFim Data de fim do {@link Evento evento}
     * @param lang Lingua usada nas coordenadas do {@link Evento evento}
     * @param precoPessoa Preco pro pessoa do {@link Evento evento}
     * @throws IOException
     * @throws CoordinatesNotFound 
     */
    public Evento(String nome, String descricao, String distrito, String concelho, Calendar dataInicio, Calendar dataFim,Language lang, float precoPessoa) throws IOException, CoordinatesNotFound {
        this.nome = nome;
        this.descricao = descricao;
        this.distrito = distrito;
        this.concelho = concelho;
        /**
         * Compara se a dataFim é maior ou igual que a dataInicio.
         * Se a dataFim for superior á dataInicio retorna 1. Se for inferior retorna -1.
         * Se forem iguais retorna 0.
         */
        if (dataFim.compareTo(dataInicio) > 0) {
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
        } else {
            System.out.println("Datas inválidas.");
        }
        setLocal(concelho, distrito, lang);
        this.lang = lang;
        this.precoPessoa = precoPessoa;
    }
    
    public String getLocal() {
        return local;
    }

    /**
     * Método que permite obter as coordenadas do local onde o {@link Evento evento} 
     * acontece.
     * @param concelho Concelho onde o {@link Evento evento} é realizado
     * @param distrito Distrito onde o {@link Evento evento} é realizado
     * @param lang Lingua que pretenede que as coordenadas do {@link Evento evento} sejam devolvidas
     * @throws IOException
     * @throws CoordinatesNotFound 
     */
    private void setLocal(String concelho, String distrito, Language lang) throws IOException, CoordinatesNotFound {
        Coordinate coordenadas = CalculateCoordinates.getCoordinate(concelho + distrito, lang);
        this.local = "Latitude: " + coordenadas.getLatitude() + "\nLongitude: " + coordenadas.getLongitude();
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }

    public float getPrecoPessoa() {
        return precoPessoa;
    }

    public void setPrecoPessoa(float precoPessoa) {
        this.precoPessoa = precoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getConcelho() {
        return concelho;
    }

    public void setConcelho(String concelho) {
        this.concelho = concelho;
    }

    /**
     * Metodo que permite mostrar a data de inicio num formato legível
     * @return data de inicio do {@link Evento evento}
     */
    public String getDataInicio() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        return dateFormat.format(this.dataInicio.getTime());
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        return dateFormat.format(this.dataFim.getTime());
    }

    public void setDataFim(Calendar dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.descricao);
        hash = 79 * hash + Objects.hashCode(this.distrito);
        hash = 79 * hash + Objects.hashCode(this.concelho);
        hash = 79 * hash + Objects.hashCode(this.dataInicio);
        hash = 79 * hash + Objects.hashCode(this.dataFim);
        hash = 79 * hash + Objects.hashCode(this.local);
        hash = 79 * hash + Objects.hashCode(this.lang);
        hash = 79 * hash + Float.floatToIntBits(this.precoPessoa);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.distrito, other.distrito)) {
            return false;
        }
        if (!Objects.equals(this.concelho, other.concelho)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (!Objects.equals(this.local, other.local)) {
            return false;
        }
        return this.lang == other.lang;
    }

    /**
     * Método que permite obter a representação textual de um {@link Evento evento}
     * @return representação textual de um {@link Evento evento}
     */
    @Override
    public String toString() {
        return "Evento{" + "nome=" + nome + ", descricao=" + descricao + ", distrito=" + distrito + ", concelho=" + concelho + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", local=" + local + ", lang=" + lang + ", precoPessoa=" + precoPessoa + '}';
    }

    /**
     * Metodo que permite calcular o duracao em dias de um evento
     * @return o numero de dias
     */
    public int calcularDias() {
        long dias = (long) (this.dataFim.getTimeInMillis() - this.dataInicio.getTimeInMillis()) / 86400000;
        return (int) (dias + 1);
    }

    /**
     * Método que permite calcular o orcamento em funcao do tipo de evento.
     * @return o valor do orcamento
     */
    public abstract double calcularOrcamento();
    
    /**
     * Metodo que permite comaparar cenas
     * @param obj
     * @return 
     */
    @Override
    public int compareTo(Comparator obj){
        if(obj instanceof Evento){
            return ((Evento)obj).calcularDias() - calcularDias(); //ordena de forma descrescente
        } else {
            return 99999999;
        }
    }
}
