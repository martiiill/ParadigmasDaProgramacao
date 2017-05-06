
package Escola.Enums;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 * @LEI - PP
 * @author Ana A. Martins
 */
public enum Tipo {
    Trabalhador, Nao_Trabalhador;
    
    public static String TipoToString(Tipo t){
        switch(t){
            case Trabalhador:
                return "Trabalhor Estudante";
                
            case Nao_Trabalhador:
                return "Estudante";
                
            default:
                return "Estudante";
            
        }
    }
}
