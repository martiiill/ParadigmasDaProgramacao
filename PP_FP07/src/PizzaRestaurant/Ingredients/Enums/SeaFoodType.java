
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum SeaFoodType {
    Camarao, Lagosta, Robalo;
    
    public static String SeaFoodTypeToString(SeaFoodType s){
        switch(s){
            case Camarao:
                return "Camarao";
                
            case Lagosta:
                return "Lagosta";
                
            case Robalo:
                return "Robalo";
                
            default:
                return "Camarao";
        }
    }
}
