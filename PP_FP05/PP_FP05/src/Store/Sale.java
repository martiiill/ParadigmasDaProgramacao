package Store;
import Cd.Cd;
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
public class Sale {
    
    /**
     * Identificador da venda
     */
    protected int saleId;
    
    /**
     * Dia, mes  e ano da venda
     */
    protected int day, month, year;
    
    /**
     * Colecao de cds que comprou
     */
    protected Cd[] cds;
    
    /**
     * Preco total da compra, de acordo com os cds que comprou
     */
    protected float totalPrice;

    /**
     * Método construtor que permite criar uma instancia de uma venda
     * @param tempSaleId
     * @param tempDay
     * @param tempMonth
     * @param tempYear
     * @param tempCds 
     */
    public Sale(int tempSaleId, int tempDay, int tempMonth, int tempYear, Cd[] tempCds) {
        if(tempSaleId <= 0){
            System.out.println("O identificador tem que ser positivo e nao nulo.");
        } else {
             saleId = tempSaleId;
        }
       
        if(tempDay <= 0 || tempDay > 31){
            System.out.println("O dia tem que ser entre 1 e 31.");
        } else {
             day = tempDay;
        }
       
        if(tempMonth <= 0 || tempMonth > 12){
            System.out.println("O mes tem que ser entre 1 e 12.");
        } else {
             month = tempMonth;
        }
       
        year = tempYear;
        cds = tempCds;    
    }  
}