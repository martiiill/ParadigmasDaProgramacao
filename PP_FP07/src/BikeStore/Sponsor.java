
package BikeStore;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 * @author Ana Martins
 */
public class Sponsor {
    /**
     * Numero maximo de patrocionadores.
     */
    private final int SPONSOR_SIZE=10;
    /**
     * Identificador do patrocionador.
     */
    private int id;
    /**
     * Nome do patrocionador.
     */
    private String name;
    /**
     * Descricao do patrocionador.
     */
    private String description;

    /**
     * Metodo que permite a criacao de uma instancia de {@link Sponsor 
     * patrocinador}.
     * @param id Identificador de patrocionador.
     * @param name Nome do patrocionador.
     * @param description Descricao do patrocionador.
     */
    public Sponsor(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Retorna o {@link Sponsor#id} do patrocionador.
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o {@link Sponsor#name} do patrocionador.
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna a {@link Sponsor#description} do patrocionador.
     * @return 
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Sponsor{" + "SPONSOR_SIZE=" + SPONSOR_SIZE + ", id=" + id + ", name=" + name + ", description=" + description + '}';
    }  
}