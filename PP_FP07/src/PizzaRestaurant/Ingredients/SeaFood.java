
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;
import PizzaRestaurant.Ingredients.Enums.SeaFoodType;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class SeaFood extends Topping{
    
    SeaFoodType typeSeaFood;

    /**
     * Metodo construtor que permite criar uma instancia de {@link SeaFood frutos do mar}
     * @param typeSeaFood Tipo de {@link SeaFood frutos de mar}
     * @param origin {@link IngredientOrigin Origem} da carne
     * @param id Identificacao de um {@link Ingredient ingrediente}
     * @param name Nome do {@link Ingredient ingrediente}
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Calorias do {@link Ingredient ingrediente}
     */
    public SeaFood(SeaFoodType typeSeaFood, IngredientOrigin origin, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.typeSeaFood = typeSeaFood;
    }

    /**
     * Retorna o {@link SeaFood#typeSeaFood}.
     * @return 
     */
    public SeaFoodType getTypeSeaFood() {
        return typeSeaFood;
    }

    public void setTypeSeaFood(SeaFoodType typeSeaFood) {
        this.typeSeaFood = typeSeaFood;
    }
    
    
}
