package BikeStore;

/**
 * P.Porto - Escola Superior de Tecnologia e Gestao 
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class SaleDate {

    private int day;
    private int month;
    private int year;

    /**
     * Metodo construtor que permite criar uma instancia de
     * {@link SaleDate data}.
     *
     * @param day Dia da {@link SaleDate data}
     * @param month Mes da {@link SaleDate data}
     * @param year Ano da {@link SaleDate data}
     */
    public SaleDate(int day, int month, int year) {
        if (day > 31 && day <= 0) {
            System.out.println("O dia tem que ter um valor entre 1 e 31.");
        } else {
            this.day = day;
        }
        if (month > 12 && month <= 0) {
            System.out.println("O mes tem que ter um valor entre 1 e 12.");
        } else {
            this.month = month;
        }
        if (year < 1950 && year > 2017) {
            System.out.println("O ano tem que ter um valor entre 1950 e 2017");
        } else {
            this.year = year;
        }
    }

    /**
     * Retorna o {@link SaleDate#day dia} da {@link SaleDate data}.
     *
     * @return
     */
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 31 && day <= 0) {
            System.out.println("O dia tem que ter um valor entre 1 e 31.");
        } else {
            this.day = day;
        }
    }

    /**
     * Retorna o {@link SaleDate#month mes } da {@link SaleDate data}
     *
     * @return
     */
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12 && month <= 0) {
            System.out.println("O mes tem que ter um valor entre 1 e 12.");
        } else {
            this.month = month;
        }
    }

    /**
     * Retorna o {@link SaleDate#year ano} da {@link SaleDate data}
     *
     * @return
     */
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1950 && year > 2017) {
            System.out.println("O ano tem que ter um valor entre 1950 e 2017");
        } else {
            this.year = year;
        }
    }

    /**
     * Metodo que permite imprimir todos os dados referentes a
     * {@link SaleDate data}
     *
     * @return String com os dados de {@link SaleDate data}
     */
    @Override
    public String toString() {
        return "SaleDate{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }


    /**
     * Metodo que permite comparar dois objetos e verifica se eles sao iguais
     * @param obj objeto que quero comparar
     * @return valor que representa o sucesso/insucesso da operacao
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SaleDate other = (SaleDate) obj;
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        return this.year == other.year;
    } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.day;
        hash = 97 * hash + this.month;
        hash = 97 * hash + this.year;
        return hash;
    }
}
