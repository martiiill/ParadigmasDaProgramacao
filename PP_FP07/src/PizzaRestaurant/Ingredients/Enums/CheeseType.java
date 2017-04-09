
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum CheeseType {
    Mozzarela, Serra, Liminano;
    
    public static String CheeseTypeToString(CheeseType c){
        switch(c){
            case Mozzarela:
                return "Mozzarela";
                
            case Serra:
                return "Serra";
                
            case Liminano:
                return "Limiano";
                
            default:
                return "Serra";
        }
    }  
}