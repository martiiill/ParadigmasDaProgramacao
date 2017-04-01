
package PizzaRestaurant.Enums;

/**
 * <h1> P.Porto - ESTG </h1>
 * <h2> Feito por: Ana A. Martins </h2>
*/
public enum IngredientUnit {

    GRAMAS, LITROS, UNIDADES;

    public static String IngredientUnitToString(IngredientUnit unit) {
        switch (unit) {
            case GRAMAS:
                return "The ingredient unit is gramas.";
            case LITROS:
                return "The ingredient unit is litros.";
            case UNIDADES:
                return "The ingredient unit is unidades.";
            default:
                return "The ingredient unit is unidades.";
        }
    }
}
