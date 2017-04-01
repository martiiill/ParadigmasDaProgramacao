/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses.Enums;

public enum GenderType {
    MASCULINO, FEMININO, INDEFINIDO;
    
     public static String GenderTypeToString(GenderType gender) {
        switch (gender) {
            case MASCULINO:
                return "Genero: Masculino";
            case FEMININO:
                return "Genero: Feminino";
            case INDEFINIDO:
                return "Genero: Indefinido";
            default:
                return "Genero: Indefinido";
        }
    }   
}