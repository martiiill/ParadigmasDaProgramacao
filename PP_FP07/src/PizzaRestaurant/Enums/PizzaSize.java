package PizzaRestaurant.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public enum PizzaSize {

    pequena, media, grande, extra_grande;

    public static String PizzaSizeToString(PizzaSize p) {
        switch (p) {
            case pequena:
                return "Pizza pequena";
            case media:
                return "Pizza media";
            case grande:
                return "Pizza grande";
            case extra_grande:
                return "Pizza Extra Grande";

            default:
                return "Pizza media";
        }
    }

}
