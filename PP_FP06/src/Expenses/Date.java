
package Expenses;
/**
 * <h1> P.Porto - ESTG </h1>
 * <h2> Feito por: Ana A. Martins </h2>
 */
public class Date {
    private int day;
    private int month;
    private int year;

    /**
     * Método construtor que permite criar uma instancia de Date.
     * @param day dia
     * @param month mes 
     * @param year ano
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
