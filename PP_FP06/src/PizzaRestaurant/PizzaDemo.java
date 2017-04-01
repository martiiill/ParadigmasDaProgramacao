package PizzaRestaurant;

import PizzaRestaurant.Enums.IngredientUnit;
import PizzaRestaurant.Enums.PizzaSize;

public class PizzaDemo {

    public static void main(String[] args) {

        PizzaIngredients[] i = {
            new PizzaIngredients(0, "Queijo", IngredientUnit.GRAMAS, 100, 234),
            new PizzaIngredients(1, "Vinho do Porto", IngredientUnit.LITROS, 200, 212),
            new PizzaIngredients(2, "Linguica", IngredientUnit.GRAMAS, 400, 100)
        };

        PizzaIngredients[] i_2 = {
            new PizzaIngredients(0, "Tomate", IngredientUnit.GRAMAS, 70, 23),
            new PizzaIngredients(1, "Queijo", IngredientUnit.GRAMAS, 100, 33),
            new PizzaIngredients(2, "Caracois", IngredientUnit.UNIDADES, 320, 100),
            new PizzaIngredients(3, "Cerveja", IngredientUnit.LITROS, 400, 1)
        };

        Pizza p = new Pizza(0, "Pizza do Porto", "Contém o melhor produto do Porto, o seu vinho", 12, PizzaSize.BIG);
        p.setIngredients(i);

        Pizza p2 = new Pizza(1, "Pizza Algarvia", "Diretamente do famoso ALLgarve", 19, PizzaSize.KING);
        p2.setIngredients(i_2);

        System.out.println("Pizza " + p.getId());
        System.out.println("Name : " + p.getName());
        System.out.println("Description: " + p.getDescription());
        System.out.println("Price: " + p.getPrice());
        System.out.println(PizzaSize.PizzaSizeToString(p.getSize()));
        
        //p.removeIngredient(2);
        
        for (int j = 0; j < p.getNumberIngredients(); j++) {
            System.out.println("Id: " + p.getIngredients()[j].getId());
            System.out.println("Name: " + p.getIngredients()[j].getName());
            System.out.println(IngredientUnit.IngredientUnitToString(p.getIngredients()[j].getUnit()));
            System.out.println("Calories: " + p.getIngredients()[j].getCalories());
            System.out.println("Quantity: " + p.getIngredients()[j].getQuantity());
        }

        System.out.println("Number of Ingredients: " + p.getNumberIngredients());

        p.editQuantityPizzaIngredients(0, 0, 4444);
        System.out.println("Ingredient 0 - Pizza 0 quantity after edit: " + p.getIngredients()[0].getQuantity());
       
        p.numberCaloriesPizza(0);

        System.out.println("Pizza " + p2.getId());
        System.out.println("Name : " + p2.getName());
        System.out.println("Description: " + p2.getDescription());
        System.out.println("Price: " + p2.getPrice());
        System.out.println(PizzaSize.PizzaSizeToString(p.getSize()));

        for (int j = 0; j < p2.getNumberIngredients(); j++) {
            System.out.println("Id: " + p2.getIngredients()[j].getId());
            System.out.println("Name: " + p2.getIngredients()[j].getName());
            System.out.println(IngredientUnit.IngredientUnitToString(p2.getIngredients()[j].getUnit()));
            System.out.println("Calories: " + p2.getIngredients()[j].getCalories());

        }
        System.out.println("Number of Ingredients: " + p2.getNumberIngredients());
    }
}
