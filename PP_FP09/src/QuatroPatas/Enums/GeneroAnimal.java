/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuatroPatas.Enums;

/**
 *
 * @author anaal
 */
public enum GeneroAnimal {
    Feminino, Masculino;
    
    public static String GeneroAnimalToString(GeneroAnimal g){
        switch(g){
            case Feminino:
                return "Genero Feminino";
                
            case Masculino:
                return "Genero Masculino";
                
            default:
                return "Genero Indefinido";
        }
    }
}
