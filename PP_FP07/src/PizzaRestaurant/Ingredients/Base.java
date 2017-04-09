
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.PizzaBase;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Base extends Ingredient{
    /**
     * Tipo de {@link Base base} usado
     */
    private PizzaBase typeBase;
    /**
     * Descricao da {@link Base base}
     */
    private String description;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Base base}.
     * @param typeBase Tipo de {@link Base base} usado.
     * @param description Descricao da {@link Base base}.
     * @param id Identificador do {@link Ingredient ingrediente}.
     * @param name Nome do {@link Ingredient ingrediente}.
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Calorias do {@link Ingredient ingrediente}.
     */
    public Base(PizzaBase typeBase, String description, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(id, name, measureUnit, calories);
        measureUnit = IngredientMeasureUnits.GRAMAS;
        this.typeBase = typeBase;
        this.description = description;
    }

    /**
     * Retorna o {@link Base#type} usado na {@link Base base}
     * @return 
     */
    public PizzaBase getType() {
        return typeBase;
    }

    public void setType(PizzaBase typeBase) {
        this.typeBase = typeBase;
    }

    /**
     * Retorna a {@link Base#description} da {@link Base base}.
     * @return 
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 
}
