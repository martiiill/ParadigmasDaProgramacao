
package Expenses.Enums;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the user structure
 * </p>
 */
public enum ExpenseType {
    AUTOMOVEL, ALIMENTAR, OUTRO;
    
     public static String ExpenseTypeToString(ExpenseType tipo) {
        switch (tipo) {
            case AUTOMOVEL:
                return "A despesa e do tipo automóvel.";
            case ALIMENTAR:
                return "A despesa é do tipo alimentar.";
            case OUTRO:
                return "A depesa é do tipo outro.";

            default:
                return "A despesa é do tipo outro";
        }
    }  
}
