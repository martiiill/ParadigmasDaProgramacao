
package PizzaRestaurant.Enums;

/**
 * <h1> P.Porto - ESTG </h1>
 * <h2> Feito por: Ana A. Martins </h2>
*/
public enum PizzaSize {
    SMALL, MEDIUM,BIG,KING;
    
    public static String PizzaSizeToString(PizzaSize size){
        switch(size){
            case SMALL:
                return "The pizza is small.";
            case MEDIUM:
                return "The pizza is medium.";
            case  BIG:
                return "The pizza is big.";
            case KING:
                return "The pizza is king size.";
            default:
                return "The pizza is medium.";
        }
    }    
}
