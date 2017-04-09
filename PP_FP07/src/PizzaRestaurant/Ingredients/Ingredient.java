
package PizzaRestaurant.Ingredients;

import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class Ingredient {
    /**
     * Identificador do ingrediente.
     */
    private int id;
    /**
     * Nome do ingrediente.
     */
    private String name;
    /**
     * Unidade de medida do ingrediente.
     */
    private IngredientMeasureUnits measureUnit;
    /**
     * Calorias do ingrediente.
     */
    private float calories;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Ingredient 
     * ingradiente}
     * @param id Identificador do ingrediente.
     * @param name Nome do ingrediente.
     * @param measureUnit Unidade de medida do ingrediente.
     * @param calories Calorias do ingrediente.
     */
    public Ingredient(int id, String name, IngredientMeasureUnits measureUnit, float calories) {
        this.id = id;
        this.name = name;
        this.measureUnit = measureUnit;
        this.calories = calories;
    }

    /**
     * Retorna a {@link Ingredient#measureUnit} do ingrediente.
     * @return 
     */
    public IngredientMeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(IngredientMeasureUnits measureUnit) {
        this.measureUnit = measureUnit;
    }

    /**
     * Retorna o {@link Ingredient#id} do ingrediente.
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o {@link Ingredient#name} do ingrediente.
     * @return 
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna as {@link Ingredient#calories} do ingrediente.
     * @return 
     */
    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    } 
}
