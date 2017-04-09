
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;
import PizzaRestaurant.Ingredients.Enums.MeatType;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Meat extends Topping{
    private MeatType typeMeat;

    
    /**
     * Metodo construtor para a criacao de uma instancia de {@link Meat meat}
     * @param typeMeat Tipo de carne
     * @param origin {@link IngredientOrigin Origem} da carne
     * @param id Identificacao de um {@link Ingredient ingrediente}
     * @param name Nome do {@link Ingredient ingrediente}
     * @param measureUnit {@link IngredientMeasureUnits Unidade} de medida do
     * {@link Ingredient ingrediente}
     * @param calories Calorias do {@link Ingredient ingrediente}
     */
    public Meat(MeatType typeMeat, IngredientOrigin origin, int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        super(origin, id, name, measureUnit, calories);
        this.typeMeat = typeMeat;
    }

    /**
     * Retorna o {@link Meat#typeMeat} da {@link Meat carne}
     * @return 
     */
    public MeatType getTypeMeat() {
        return typeMeat;
    }

    public void setTypeMeat(MeatType typeMeat) {
        this.typeMeat = typeMeat;
    }  
}
