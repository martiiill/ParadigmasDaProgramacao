package PizzaRestaurant;

import PizzaRestaurant.Enums.PizzaSize;
import PizzaRestaurant.Ingredients.Base;
import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Meat;
import PizzaRestaurant.Ingredients.SeaFood;
import PizzaRestaurant.Ingredients.Topping;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class Pizza {

    private static final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private float price;
    private PizzaSize size;
    private PizzaIngredients[] ingredients;
    private int numberOfIngredients;
    private int numberOfIngredientsBase;

    /**
     * Metodo construtor que permite criar uma instancia de {@link Pizza pizza}
     *
     * @param id Identificador da {@link Pizza pizza}
     * @param name Nome da {@link Pizza pizza}
     * @param description Descricao da {@link Pizza pizza}
     * @param price Preco da {@link Pizza pizza}
     * @param size Tamanho da {@link Pizza pizza}
     * @param ingredients Ingredientes da {@link Pizza pizza}
     */
    public Pizza(int id, String name, String description, float price, PizzaSize size, PizzaIngredients[] ingredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.ingredients = ingredients;
        numberOfIngredients = 0;
        numberOfIngredientsBase = 0;
    }

    /**
     * Metodo que permite criar uma instancia de {@link Pizza pizza} sem ingredientes associados.
     * @param id Identificador da {@link Pizza pizza}
     * @param name Nome da {@link Pizza pizza}
     * @param description Descricao da {@link Pizza pizza}
     * @param price Preco da {@link Pizza pizza}
     * @param size Tamanho da {@link Pizza pizza}
     */
    public Pizza(int id, String name, String description, float price, PizzaSize size) {
        ingredients = new PizzaIngredients[MAX_INGREDIENTS];
        numberOfIngredients = 0;
        numberOfIngredientsBase = 0;
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;

    }

    /**
     * Retorna o {@link Pizza#id} da {@link Pizza pizza}
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o {@link Pizza#name} da {@link Pizza pizza}
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna o {@link Pizza#description} da {@link Pizza pizza}
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retorna o {@link Pizza#price} da {@link Pizza pizza}
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Retorna o {@link Pizza#size} da {@link Pizza pizza}
     *
     * @return
     */
    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    /**
     * Retorna os {@link Pizza#ingredients} da {@link Pizza pizza}
     *
     * @return
     */
    public PizzaIngredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(PizzaIngredients[] ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * Retorna o {@link Pizza#numberOfIngredients} da {@link Pizza pizza}
     *
     * @return
     */
    public int getNumberOfIngredients() {
        return numberOfIngredients;
    }

    /**
     * Metodo que permite apenas inserir ingredientes do tipo Topping quando a
     * pizza já tem ingredientes do tipo Base.
     * @param i Ingrediente a adicionar
     * @return 
     */
    public boolean addIngredients(PizzaIngredients i) {
        if (i.getIngredient() instanceof Topping & numberOfIngredientsBase != 0) {
            if (numberOfIngredients <= MAX_INGREDIENTS) {
                this.ingredients[numberOfIngredients] = i;
                numberOfIngredients++;
                return true;
            } else {
                return false;
            }
        } else if (i.getIngredient() instanceof Base && numberOfIngredientsBase == 0) {
            if (numberOfIngredients <= MAX_INGREDIENTS) {
                this.ingredients[numberOfIngredients] = i;
                numberOfIngredients++;
                numberOfIngredientsBase++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    public void classifyTypePizza(PizzaIngredients i){
        if(i.getIngredient() instanceof Meat){
            System.out.println("Pizza de Carne");
        } else if(i.getIngredient() instanceof SeaFood){
            System.out.println("Pizza do Mar.");   
        } else {
            System.out.println("Pizza Vegetariana.");
        }
    }
    
    public void printPizzaDetails(Pizza p){
        System.out.println("Pizza number " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Price: " + p.getPrice());
        System.out.println(PizzaSize.PizzaSizeToString(p.getSize()));
        System.out.println("Ingredients");
        for(int i = 0; i< p.getNumberOfIngredients(); i++){
            System.out.println("Id: " + p.getIngredients()[i].getIngredient().getId());
            System.out.println("Name: " + p.getIngredients()[i].getIngredient().getName());
            System.out.println("Calories: " + p.getIngredients()[i].getIngredient().getCalories());
            System.out.println(IngredientMeasureUnits.IngredientMeasureUnitsToString(p.getIngredients()[i].getIngredient().getMeasureUnit()));
            System.out.println("Quantity: " + p.getIngredients()[i].getQuantity());
        }   
    }
}
