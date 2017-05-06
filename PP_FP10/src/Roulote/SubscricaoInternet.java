
package Roulote;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public interface SubscricaoInternet{
    
    /**
     * Metodo que permite adicionar uma nova subscricao 
     * @param subscricao subscricao que quer adicionar
     */
    public void AddSubscricao(Subscricao subscricao);
    /**
     * Método que permite obter o numero total de subscricoes efetuadas
     * @return numero de subscricoes efetuadas
     */
    public double getTotalSubscricoes();
    /**
     * Método que permite obter o valor total, em mb, do trafego usado nas 
     * subscricoes
     * @return valor do trafego usado nas subscricoes
     */
    public double getTotalTrafego();
}
