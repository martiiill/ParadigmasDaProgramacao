package Roulote;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class Bebida extends Produto {

    /**
     * Valor da percentagem de alcool na {@link Bebida bebida}
     */
    private float percentagemAlcool;
    /**
     * Tamanho da {@link Bebida bebida}
     */
    private int tamanho;

    /**
     * Método construtor que permite instanciar uma {@link Bebida bebida}
     *
     * @param percentagemAlcool Percentagem de alcool de
     * uma{@link Bebida bebida}
     * @param tamanho Tamanho da {@link Bebida bebida}
     * @param nome Nome da {@link Bebida bebida}
     * @param preco Preco da {@link Bebida bebida}
     */
    public Bebida(float percentagemAlcool, int tamanho, String nome, float preco) {
        super(nome, preco);
        this.percentagemAlcool = percentagemAlcool;
        this.tamanho = tamanho;
    }

    public float getPercentagemAlcool() {
        return percentagemAlcool;
    }

    public void setPercentagemAlcool(float percentagemAlcool) {
        this.percentagemAlcool = percentagemAlcool;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Float.floatToIntBits(this.percentagemAlcool);
        hash = 83 * hash + this.tamanho;
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
        final Bebida other = (Bebida) obj;
        if (Float.floatToIntBits(this.percentagemAlcool) != Float.floatToIntBits(other.percentagemAlcool)) {
            return false;
        }
        return this.tamanho == other.tamanho;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Bebida{" + "percentagemAlcool=" + percentagemAlcool + ", tamanho=" + tamanho + '}';
    }

    @Override
    public float getPrecoProduto(Produto produto) {
        return (produto.getPreco() * IVA) / 100 + (produto.getPreco());
    }

    @Override
    public float getPrecoProdutos(Produto[] produtos) {
        for (int i = 0; i < produtos.length; ++i) {
            produtos[i].setPreco((produtos[i].getPreco() * IVA) / 100 + produtos[i].getPreco());
            return produtos[i].getPreco();
        }
        return 0;
    }
}
