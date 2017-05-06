
package Escola.Enums;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 * @LEI - PP
 * @author Ana A. Martins
 */
public enum Habilitacoes {
    Licenciatura, Mestrado, Doutoramento;
    
    public static String HabilitacoesToString(Habilitacoes h){
        switch(h){
            case Licenciatura:
                return "Licenciatura";
            case Mestrado:
                return "Mestrado";
                
            case Doutoramento:
                return "Doutoramento";
                
            default:
                return "Licenciatura";
        }
    }
    
}
