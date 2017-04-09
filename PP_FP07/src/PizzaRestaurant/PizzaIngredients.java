
package PizzaRestaurant;

import PizzaRestaurant.Ingredients.Ingredient;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class PizzaIngredients {
    
    private Ingredient ingredient;
    private float quantity;

    /**
     * Metodo construtor que permite criar uma instancia de {@link PizzaIngredients
     * ingredientes da pizza}
     * @param ingredient {@link Ingredient ingrediente} da {@link PizzaIngredients}
     * @param quantity Quantidade do {@link PizzaIngredients ingrediente da pizza}
     */
    public PizzaIngredients(Ingredient ingredient, float quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    /**
     * Retorna o {@link PizzaIngredients#ingredient}
     * @return 
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Retorna a {@link PizzaIngredients#quantity}
     * @return 
     */
    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }  
}
