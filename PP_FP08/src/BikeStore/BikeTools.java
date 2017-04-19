
package BikeStore;

/**
/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 * @author Ana Martins
 */
public class BikeTools {
    /**
     * Identificador do utensilio.
     */
    private int id;
    /**
     * Nome do utensilio.
     */
    private String name;
    /**
     * Descricao do utensilio.
     */
    private String description;

    /**
     * Metodo construtor que permite criar uma instancia de {@link BikeTools 
     * utensilio}.
     * @param id Identificador do utensilio.
     * @param name Nome do utensilio.
     * @param description Descricao do utensilio.
     */
    public BikeTools(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * Retorna o {@link BikeTools#id} do utensilio.
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o {@link#name} do utensilio.
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna a {@link BikeTools#description} do utensilio.
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
        return "BikeTools{" + "id=" + id + ", name=" + name + ", description=" + description + '}';
    }
}
