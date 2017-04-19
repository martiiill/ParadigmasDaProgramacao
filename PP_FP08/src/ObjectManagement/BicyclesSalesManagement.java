package ObjectManagement;

import BikeStore.Bicycle;
import BikeStore.SaleDate;
import java.util.Objects;

/**
 * P.Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class BicyclesSalesManagement extends ContainerOfObjects {

    private int saleID;
    private SaleDate date;
    private double total;

    /**
     * Metodo construtor que permite criar uma instancia de {@link BicyclesSalesManagement
     * bicycleSalesManagement}
     *
     * @param objects objetos do tipo bicicletas
     * @param saleID identificador da venda
     * @param date data da venda
     */
    public BicyclesSalesManagement(Bicycle[] objects, int saleID, SaleDate date) {
        super(objects);
        this.saleID = saleID;
        this.date = date;
    }

    /**
     * Metodo que permite criar uma instancia de {@link BicyclesSalesManagement
     * bicycleSalesManagement}
     *
     * @param maxSize Tamanho maximo do vetor pretendido
     * @param saleID Identificador da venda
     * @param date Data da venda
     */
    public BicyclesSalesManagement(int maxSize, int saleID, SaleDate date) {
        super(maxSize);
        this.saleID = saleID;
        this.date = date;
    }

    /**
     * Metodo que permite criar uma instancia de {@link BicyclesSalesManagement
     * bicycleSalesManagement}
     *
     * @param saleID Identificado da venda
     * @param date Data da venda
     */
    public BicyclesSalesManagement(int saleID, SaleDate date) {
        this.saleID = saleID;
        this.date = date;
    }

    /**
     * Retorna o {@link BicyclesSalesManagement#saleID}.
     *
     * @return
     */
    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        if (saleID < 0) {
            System.out.println("O identificador não pode ser negativo.");
        } else {
            this.saleID = saleID;
        }
    }

    /**
     * Retorna a {@link BicyclesSalesManagement#date}.
     *
     * @return
     */
    public SaleDate getDate() {
        return date;
    }

    public void setDate(SaleDate date) {
        this.date = date;
    }

    /**
     * Retorna o {@link BicyclesSalesManagement#total}.
     *
     * @return
     */
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Metodo responsavel por inserir uma {@link Bicycle bicicle} na colecao de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param bike {@link Bicycle bicicle} a inserir no vetor
     * @return valor booleano que representa o sucesso/insucesso da operacao
     */
    public boolean addBicycle(Bicycle bike) {
        return super.addObject(bike);
    }

 
    /**
     * Metodo responsavel por remover uma uma {@link Bicycle bicicle} na colecao de
     * {@link ContainerOfObjects#objects objectos} 
     * @param position posicao do objeto que quer remover
     * @return valor booleano que representa o sucesso/insucesso da operacao
     */
    public boolean removeBicycle(int position) {
        return super.removeObject(position);
    }

    /**
     * Metodo responsavel por encontrar uma bicicleta
     *
     * @param b bicicleta que quero encontrar
     * @return posicao do objeto
     */
    public int findBicycle(Bicycle b) {
        return super.findObject(b);
    }

    /**
     * Metodo que tem como objetivo de ir buscar todas as bicicletas existentes
     *
     * @return vetor com as bicicletas
     */
    public Bicycle[] getAllBicycles() {
        return (Bicycle[]) super.getObjects();
    }

    public String calculateTotal() {
        double tot = 0;
        String t;
        for (int i = 0; i < getNumberOfObjects(); i++) {
            tot= tot + getAllBicycles()[i].getPrice();
        }
        t = "Total= " + tot;
        return t;
    }

    /**
     * Metodo que permite imprimir todos os dados de
     * {@link BicyclesSalesManagement}
     *
     * @return String com os dados
     */
    @Override
    public String toString() {
        return super.toString() + "BicyclesSalesManagement{" + "saleID=" + saleID + ", date=" + date + "," + calculateTotal() + "}";
    }

    /**
     * Metodo que permite igualar um objeto com o meu objeto, dizendo se eles
     * sao iguais ou nao
     *
     * @param obj objeto que quero comparar
     * @return valor booleano que representa o sucesso/insucesso da operacao
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BicyclesSalesManagement other = (BicyclesSalesManagement) obj;
        if (this.saleID != other.saleID) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return Double.doubleToLongBits(this.total) == Double.doubleToLongBits(other.total);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.saleID;
        hash = 97 * hash + Objects.hashCode(this.date);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        return hash;
    }
}
