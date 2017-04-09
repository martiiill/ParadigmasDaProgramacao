
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum MeatType {
    PORCO, VACA, SALAME;
    
    public static String MeatTypeToString(MeatType m){
        switch(m){
            case PORCO:
                return "Carne de porco.";
                
            case VACA:
                return "Carne de vaca.";
                
            case SALAME:
                return "Salame";
                
            default:
                return "Carne de vaca.";
        }
    }
}
