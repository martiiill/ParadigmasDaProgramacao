package PizzaRestaurant;

import PizzaRestaurant.Enums.PizzaSize;
import PizzaRestaurant.Ingredients.Base;
import PizzaRestaurant.Ingredients.Cheese;
import PizzaRestaurant.Ingredients.Enums.CheeseType;
import PizzaRestaurant.Ingredients.Enums.IngredientMeasureUnits;
import PizzaRestaurant.Ingredients.Enums.IngredientOrigin;
import PizzaRestaurant.Ingredients.Enums.MeatType;
import PizzaRestaurant.Ingredients.Enums.PizzaBase;
import PizzaRestaurant.Ingredients.Enums.SeaFoodType;
import PizzaRestaurant.Ingredients.Enums.VegetableType;
import PizzaRestaurant.Ingredients.Meat;
import PizzaRestaurant.Ingredients.SeaFood;
import PizzaRestaurant.Ingredients.Topping;
import PizzaRestaurant.Ingredients.Vegetable;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class PizzaDemo {

    public static void main(String[] args) {

        Base b = new Base(PizzaBase.ALTA, "Pizza base alta", 0, "Ingrediente do tipo base", IngredientMeasureUnits.GRAMAS, 500);
        Base b2 = new Base(PizzaBase.ALTA, "Pizza base alta", 1, "Ingrediente do tipo base 2", IngredientMeasureUnits.GRAMAS, 500);

        Topping t = new Topping(IngredientOrigin.NACIONAL, 0, "Ingrediente do tipo  de Topping", IngredientMeasureUnits.GRAMAS, 400);

        Meat m = new Meat(MeatType.SALAME, IngredientOrigin.NACIONAL, 0, "Salame", IngredientMeasureUnits.GRAMAS, 204);

        Cheese c = new Cheese(CheeseType.Mozzarela, IngredientOrigin.NACIONAL, 0, "Name", IngredientMeasureUnits.GRAMAS, 100);

        Vegetable v = new Vegetable(VegetableType.TOMATE, IngredientOrigin.NACIONAL, 0, "Name", IngredientMeasureUnits.GRAMAS, 60);

        SeaFood s = new SeaFood(SeaFoodType.Camarao, IngredientOrigin.NACIONAL, 0, "Name", IngredientMeasureUnits.GRAMAS, 100);

        PizzaIngredients p
                = new PizzaIngredients(b, 2);
          //  new PizzaIngredients(t, 3),
        // new PizzaIngredients(i, 1)

        PizzaIngredients p2 = new PizzaIngredients(t, 2);
        PizzaIngredients p3 = new PizzaIngredients(m, 2);

        //Pizza pz = new Pizza(0, "Pizza 1", "Descricao", 20, PizzaSize.media, p);
        Pizza pz = new Pizza(0, "Pizza 1", "Descricao", 20, PizzaSize.media);
        pz.addIngredients(p);
        pz.addIngredients(p2);
        pz.addIngredients(p3);
        //pz.addTopping(p3);

        pz.printPizzaDetails(pz);          
        pz.classifyTypePizza(p3);
    }
}
