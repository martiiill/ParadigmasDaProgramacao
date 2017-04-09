
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;
import PizzaRestaurant.Ingredients.Enums.VegetableType;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Vegetable extends Topping{
    
    private VegetableType typeVegetable;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Vegetable vegetal}
     * @param typeVegetable Tipo de vegetal
     * @param origin {@link IngredientOrigin Origem} da carne
     * @param id Identificacao de um {@link Ingredient ingrediente}
     * @param name Nome do {@link Ingredient ingrediente}
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Calorias do {@link Ingredient ingrediente}
     */
    public Vegetable(VegetableType typeVegetable, IngredientOrigin origin, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.typeVegetable = typeVegetable;
    }

    /**
     * Retorna o {@link Vegetable#typeVegetable}.
     * @return 
     */
    public VegetableType getTypeVegetable() {
        return typeVegetable;
    }

    public void setTypeVegetable(VegetableType typeVegetable) {
        this.typeVegetable = typeVegetable;
    } 
}
