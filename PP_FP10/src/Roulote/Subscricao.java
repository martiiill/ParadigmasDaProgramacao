package Roulote;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class Subscricao implements SubscricaoInternet{

    /**
     * Valor que a empresa cobra por hora por cada {@link Subscricao subscricao}
     */
    private static final int EUROS = 2;
    private static final int MB = 100;

    /**
     * Numero de {@link Subscricao subscricoes} que existem
     */
    private int numSubscricoes;

    public int getNumSubscricoes() {
        return numSubscricoes;
    }

    public void setNumSubscricoes(int numSubscricoes) {
        this.numSubscricoes = numSubscricoes;
    }

    @Override
    public void AddSubscricao(Subscricao subscricao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTotalSubscricoes() {
        return this.getNumSubscricoes();
    }

    @Override
    public double getTotalTrafego() {
        return (EUROS * MB) / this.getNumSubscricoes();
    }

    
}
