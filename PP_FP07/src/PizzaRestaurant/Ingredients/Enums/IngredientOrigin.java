package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public enum IngredientOrigin {

    NACIONAL, IMPORTADO;

    public static String IngredientOriginToString(IngredientOrigin io) {
        switch (io) {
            case NACIONAL:
                return "Origem nacional.";
            case IMPORTADO:
                return "Origram importada.";

            default:
                return "Origem importada.";
        }
    }
}
