
package Roulote;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class Sandwich extends Produto{
    /**
     * Numero de ingredientes {@link Sandwich sandwich}
     */
    private int numIngredientes;

    /**
     * Método construtor que permite criar uma instancia de {@link Sandwich sandwich}
     * @param numIngredientes Numero de ingredientes de uma {@link Sandwich sandwich}
     * @param nome Nome da {@link Sandwich sandwich}
     * @param preco Preco da {@link Sandwich sandwich}
     */
    public Sandwich(int numIngredientes, String nome, float preco) {
        super(nome, preco);
        this.numIngredientes = numIngredientes;
    }

    public int getNumIngredientes() {
        return numIngredientes;
    }

    public void setNumIngredientes(int numIngredientes) {
        this.numIngredientes = numIngredientes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.numIngredientes;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sandwich other = (Sandwich) obj;
        return this.numIngredientes == other.numIngredientes;
    }

    @Override
    public String toString() {
        return "Sandwich{" + "numIngredientes=" + numIngredientes + '}';
    }

    @Override
    public float getPrecoProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getPrecoProdutos(Produto[] produtos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
