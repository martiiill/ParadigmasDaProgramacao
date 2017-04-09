
package PizzaRestaurant.Ingredients.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public enum PizzaBase {
   ALTA, FINA;
   
   public static String PizzaBaseToString(PizzaBase pb){
       switch(pb){
           case ALTA:
               return "Massa alta.";
               
           case FINA:
               return "Massa fina.";
               
           default:
               return "Massa fina.";
       }
   }   
}