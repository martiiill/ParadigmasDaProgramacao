
package PizzaRestaurant;

import PizzaRestaurant.Enums.IngredientUnit;

/**
 * <h1> P.Porto - ESTG </h1>
 * <h2> Feito por: Ana A. Martins </h2>
*/
public class PizzaIngredients {
    private int id;
    private String name;
    private IngredientUnit unit;
    private int calories;
    private int quantity;

    /**
     * Metodo construtor que permite criar uma instancia de <b>Ingrediente</b>
     * @param id identificador do <b>Ingrediente</b>
     * @param name Nome do <b>Ingrediente</b>
     * @param unit Unidades de medida do <b>Ingrediente</b>
     * @param calories Calorias do <b>Ingrediente</b>
     */
    public PizzaIngredients(int id, String name, IngredientUnit unit, int calories, int quantity) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.calories = calories;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IngredientUnit getUnit() {
        return unit;
    }

    public void setUnit(IngredientUnit unit) {
        this.unit = unit;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
}
