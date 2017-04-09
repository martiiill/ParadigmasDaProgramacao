
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum IngredientMeasureUnits {
    GRAMAS, LITROS, UNIDADES;
    
    public static String IngredientMeasureUnitsToString(IngredientMeasureUnits i){
        switch(i){
            case GRAMAS:
                return "A unidade de medida sao gramas.";
                
            case LITROS:
                return "A unidade de medida sao litros.";
                
            case UNIDADES:
                return "A unidade de media sao unidades.";
                
            default:
                return "A unidade de medida sao as gramas.";
        }
    }
}
