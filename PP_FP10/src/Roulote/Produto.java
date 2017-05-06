
package Roulote;

import java.util.Objects;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public abstract class Produto implements Roulote{
    /**
     * Nome do {@link Produto produto}
     */
    private String nome;
    /**
     * Preco do {@link Produto produto}
     */
    private float preco;

    /**
     * Método constutor que permite criar uma instancia de {@link Produto produto}
     * @param nome Nome do {@link Produto produto}
     * @param preco Preco do {@link Produto produto}
     */
    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Float.floatToIntBits(this.preco);
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
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Float.floatToIntBits(this.preco) == Float.floatToIntBits(other.preco);
    }

    /**
     * Método que permite obter a representação textual do {@link Produto produto}.
     * @return representação textual 
     */
    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", preco=" + preco + '}';
    }
}
