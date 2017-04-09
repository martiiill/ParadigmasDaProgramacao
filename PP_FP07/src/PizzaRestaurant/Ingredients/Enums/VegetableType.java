
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum VegetableType {
    TOMATE, CEBOLA, COGUMELOS;
    
    public static String VegetableTypeToString(VegetableType v){
        switch(v){
            case TOMATE:
                return "Tomate.";
            case CEBOLA:
                return "Cebola.";
                
            case COGUMELOS:
                return "Cogumelos.";
                
            default:
                return "Tomate.";
        }
    }
}
