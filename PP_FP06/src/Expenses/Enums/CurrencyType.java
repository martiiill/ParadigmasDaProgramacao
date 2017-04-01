/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses.Enums;

public enum CurrencyType {

    EUROS, DOLAR;

    public static String CurrencyTypeToString(CurrencyType moeda) {
        switch (moeda) {
            case EUROS:
                return "euros";
            case DOLAR:
                return "dolares.";
            default:
                return "euros.";
        }
    }
}