
package Escola.Enums;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 * @LEI - PP
 * @author Ana A. Martins
 */
public enum Area {
    Informatica, Biomedicina;
    
    public static String AreaToString (Area a){
        switch (a){
            case Informatica:
                return "Informatica";
                
            case Biomedicina:
                return "Biomedicina";
                
            default:
                return "Informatica";
        }
    }
}
