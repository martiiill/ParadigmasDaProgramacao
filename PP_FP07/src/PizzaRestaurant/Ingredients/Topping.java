
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Topping extends Ingredient{
    
    /**
     * Origem da cobertura
     */
    private IngredientOrigin origin;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Topping cobertura}
     * @param origin Origem da {@link Topping cobertura}
     * @param id Identificador do {@link Ingredient ingrediente}
     * @param name Nome do {@link Ingredient ingrediente}
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Numero de calorias associado a um {@link Ingredient ingrediente}
     */
    public Topping(IngredientOrigin origin, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(id, name, measureUnit, calories);
        this.origin = origin;
    }

    /**
     * Retorna a {@link Topping#origin} da cobertura.
     * @return 
     */
    public IngredientOrigin getOrigin() {
        return origin;
    }

    public void setOrigin(IngredientOrigin origin) {
        this.origin = origin;
    }
}
