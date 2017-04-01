package Expenses;

import Expenses.Enums.CurrencyType;
import Expenses.Enums.ExpenseType;

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
    private int number;
    /**
     * Tipo da despesa ({@link Expenses})
     */
    private ExpenseType type;
    /**
     * Valor da despesa ({@link Expenses})
     */
    private float value;
    /**
     * Data da despesa ({@link Expenses})
     */
    private Date data;
    /**
     * Tipo do valor ({@link Expenses
     */
    private CurrencyType currency;

    /**
     * Descricao da depesa
     */
    private String description;

    /**
     * Método contrutor que permite criar uma instância de uma despesa.
     *
     * @param number numero da despesa
     * @param type tipo de despesa
     * @param value valor da despesa
     * @param date data da despesa
     * @param currency tipo de moeda da despesa
     * @param description descricao da despesa
     */
    public Expense(int number, ExpenseType type, float value, Date date, CurrencyType currency, String description) {
        if (number < 0) {
            System.out.println("O número de despesa não pode ser nulo.");
        } else {
            this.number = number;
        }
        this.type = type;

        if (date.getDay() <= 0 || date.getDay() > 31 || date.getMonth() <= 0 || date.getMonth() > 12 || date.getYear() > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            this.data = date;
        }

        this.currency = currency;

        if (value < 0) {
            System.out.println("O valor da despesa tem que ser positivo.");
        } else {
            this.value = value;
        }

        if (description.isEmpty() == true) {
            System.out.println("A despesa tem que ter uma descricao");
        } else {
            this.description = description;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            System.out.println("O número de despesa não pode ser nulo.");
        } else {
            this.number = number;
        }
    }

    public ExpenseType getType() {
        return type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        if (value < 0) {
            System.out.println("O valor da despesa tem que ser positivo.");
        } else {
            this.value = value;
        }
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data.getDay() <= 0 || data.getDay() > 31 || data.getMonth() <= 0 || data.getMonth() > 12 || data.getYear() > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            this.data = data;
        }
    }

    public CurrencyType getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyType currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.isEmpty() == true) {
            System.out.println("A despesa tem que ter uma descricao");
        } else {
            this.description = description;
        }
    }
}