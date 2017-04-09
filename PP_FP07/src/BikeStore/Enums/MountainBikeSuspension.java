
package BikeStore.Enums;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao
 * PP - Paradigmas da Programacao
 * @author Ana Martins
 */
public enum MountainBikeSuspension {
    SIMPLES, DUPLA, SEM;
    
    public static String MountainBikeSuspensionToString(MountainBikeSuspension m){
        switch(m){
            case SIMPLES:
                 return "A bicicleta tem suspensao simples.";         
                
            case DUPLA:
               return"A bicicleta tem suspensao dupla.";
            
            case SEM: 
                return"A bicicleta nao tem suspensao.";
          
            default:
                return "A bicicleta nao tem suspensao.";             
        }
    }  
}
