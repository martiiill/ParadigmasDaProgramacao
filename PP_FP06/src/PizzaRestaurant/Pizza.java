package PizzaRestaurant;

import PizzaRestaurant.Enums.PizzaSize;

/**
 * <h1> P.Porto - ESTG </h1>
 * <h2> Feito por: Ana A. Martins </h2>
 */
public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private float price;
    private PizzaSize size;
    private int numberIngredients;
    private PizzaIngredients[] ingredients;

    /**
     * Método construtor que permite criar uma instancia de <b>Pizza</b>
     *
     * @param id identificacao de uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descricao da <b>Pizza</b>
     * @param price Preco da <b>Pizza</b>
     * @param size Tamanho da <b>Pizza</b>
     */
    public Pizza(int id, String name, String description, float price, PizzaSize size) {
        ingredients = new PizzaIngredients[MAX_INGREDIENTS];

        numberIngredients = 0;
        if (id < 0) {
            System.out.println("O id tem que ser positivo.");
            this.id = 999;
        } else {
            this.id = id;
        }
        if (name.isEmpty() == true) {
            System.out.println("A pizza tem que ter um nome");
            this.name = "Pizza default";
        } else {
            this.name = name;
        }
        if (description.isEmpty() == true) {
            System.out.println("A pizza tem quer ter uma descricao");
            this.description = "Description default";
        } else {
            this.description = description;
        }
        if (price < 0) {
            System.out.println("O preco da pizza tem que ser positivo.");
            this.price = 10;
        } else {
            this.price = price;
        }
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("O id tem que ser positivo.");
            this.id = 999;
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() == true) {
            System.out.println("A pizza tem que ter um nome");
            this.name = "Pizza default";
        } else {
            this.name = name;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty() == true) {
            System.out.println("A pizza tem quer ter uma descricao");
            this.description = description;
        } else {
            this.description = description;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            System.out.println("O preco da pizza tem que ser positivo.");
            this.price = 10;
        } else {
            this.price = price;
        }
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public PizzaIngredients[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(PizzaIngredients[] ingredients) {
        int i;
        this.ingredients = new PizzaIngredients[MAX_INGREDIENTS];
        for (i = 0; i < MAX_INGREDIENTS && i < ingredients.length; i++) {
            this.ingredients[i] = ingredients[i];
        }
        numberIngredients = i;
    }

    public int getNumberIngredients() {
        return numberIngredients;
    }

    public void editQuantityPizzaIngredients(int idIngrediente, int idPizza, int quantityIngredient) {
        for (int i = 0; i < numberIngredients; i++) {
            if (this.getId() == idPizza) {
                if (this.getIngredients()[idPizza].getId() == idIngrediente) {
                    this.getIngredients()[idPizza].setQuantity(quantityIngredient);
                } else {
                    System.out.println("Nao existe nenhu");
                }
            } else {
                System.out.println("Nao existe nenhum ingrediente com esse id.");
            }
        }
    }

    public boolean removeIngredient(int idIngredient) {
        for (int i = 0; i < numberIngredients; i++) {
            if (ingredients[i].getId() == idIngredient) {
                while (i < numberIngredients - 1) {
                    ingredients[i] = ingredients[i + 1];
                    i++;
                }
                numberIngredients--;
                return true;
            }
        }
        return false;
    }

    public void numberCaloriesPizza(int idPizza) {
        int totalCalories = 0, i = 0;
        for (i = 0; i < numberIngredients; i++) {
            if (this.getId() == idPizza) {
                totalCalories = totalCalories + this.getIngredients()[i].getCalories();
            } else {
                System.out.println("Nao existe nenhuma pizza com esse identificador.");
            }
        }
        System.out.println("Pizza " + idPizza + " = " + totalCalories + " calories");
    }
}
