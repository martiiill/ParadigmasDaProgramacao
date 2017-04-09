
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.CheeseType;
import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Cheese extends Topping{
    
    private CheeseType typeCheese;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Cheese queijo}
     * @param typeCheese Tipo de {@link Cheese queijo}
     * @param origin {@link IngredientOrigin Origem} da carne
     * @param id Identificacao de um {@link Ingredient ingrediente}
     * @param name Nome do {@link Ingredient ingrediente}
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Calorias do {@link Ingredient ingrediente}
     */
    public Cheese(CheeseType typeCheese, IngredientOrigin origin, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.typeCheese = typeCheese;
    }

    /**
     * Retorna o {@link Cheese#typeCheese}.
     * @return 
     */
    public CheeseType getTypeCheese() {
        return typeCheese;
    }

    public void setTypeCheese(CheeseType typeCheese) {
        this.typeCheese = typeCheese;
    }  
}
