package Expenses;

import exchange.CurrencyRates;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the expense structure
 * </p>
 */
public class Expense {

    /**
     * Número de identificação da despesa({@link Expenses})
     */
    protected int number;
    /**
     * Tipo da despesa ({@link Expenses})
     */
    protected String type;
    /**
     * Valor da despesa ({@link Expenses})
     */
    protected float value;
    /**
     * Data da despesa ({@link Expenses})
     */
    protected GregorianCalendar data;
    /**
     * Tipo do valor ({@link Expenses
     */
    protected String currency;

    /**
     * Método construtor para a criação de uma instância de @Expenses, tendo por
     * base quase todos os atributos de despesa ({@link Expenses})
     *
     * @param tempNumber Número da despesa ({@link Expenses})
     * @param tempType Tipo da despesa ({@link Expenses})
     * @param tempValue Valor em euros da despesa realizada ({@link Expenses})
     * @param tempDate Data ({@link Expenses}) da despesa realizada
     * ({@link Expenses})
     */
    Expense(int tempNumber, String tempType, float tempValue, GregorianCalendar tempDate) {
        if (tempNumber < 0) {
            System.out.println("O número de despesa não pode ser nulo.");
        } else {
            number = tempNumber;
        }
        switch (tempType) {
            case "Automóvel":
                type = tempType;
                break;
            case "Alimentar":
                type = tempType;
                break;
            default:
                type = "Outro";
        }
        if (tempValue < 0.0f) {
            System.out.println("O valor da despesa tem que ser positivo.");
        } else {
            value = tempValue;
        }
        if (tempDate.get(Calendar.DAY_OF_WEEK) <= 0 || tempDate.get(Calendar.DAY_OF_WEEK) > 31 || tempDate.get(Calendar.MONTH)<= 0 ||  tempDate.get(Calendar.MONTH) > 12 ||  tempDate.get(Calendar.YEAR) > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            data = tempDate;
        }

    }

    /**
     * Método construtor para a criação de uma instância de @Expenses, tendo por
     * base todos os atributos de despesa ({@link Expenses})
     *
     * @param tempNumber Número da despesa ({@link Expenses})
     * @param tempType Tipo da despesa ({@link Expenses})
     * @param tempValue Valor da despesa realizada ({@link Expenses})
     * @param tempDate Data ({@link Expenses}) da despesa realizada
     * @param currencyType Moeda da valor da despesa({@link Expenses)
     * ({@link Expenses})
     */
    Expense(int tempNumber, String tempType, float tempValue, GregorianCalendar tempDate, String currencyType) {
        if (tempNumber < 0) {
            System.out.println("O número de despesa não pode ser nulo.");
        } else {
            number = tempNumber;
        }
        switch (tempType) {
            case "Automóvel":
                type = tempType;
                break;
            case "Alimentar":
                type = tempType;
                break;
            default:
                type = "Outro";
        }

        if (tempDate.get(Calendar.DAY_OF_WEEK) <= 0 || tempDate.get(Calendar.DAY_OF_WEEK) > 31 || tempDate.get(Calendar.MONTH)<= 0 ||  tempDate.get(Calendar.MONTH) > 12 ||  tempDate.get(Calendar.YEAR) > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            data = tempDate;
        }

        switch (currencyType) {
            case "Euro":
                currency = currencyType;
                value = tempValue;
                break;
            case "Dolar":
                value = tempValue * CurrencyRates.DolarToEuro;
                currency = "Euro";
                break;
            case "Iene":
                value = tempValue * CurrencyRates.IeneToEuro;
                currency = "Euro";
                break;
            case "GBP":
                value = tempValue * CurrencyRates.GBPToEuro;
                currency = "Euro";
                break;
            default:
                currency = "Euro";
        }
        if (tempValue < 0.0f) {
            System.out.println("O valor da despesa tem que ser positivo.");
        } else {
            value = tempValue;
        }
    }
}
