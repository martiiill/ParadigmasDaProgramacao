
package Roulote;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public interface Roulote{
    /**
     * Valor do iva utilizado no calculodo preco
     */
    static final int IVA = 23;

    /**
     * Método que permite obter o valor do preco de um produto especifico
     * @param produto produto da qual pretende obter a informação
     * @return preco do produto
     */
    public float getPrecoProduto(Produto produto);

    /**
     * Método que permite obter o valor dos preços a partir de uma colecao de 
     * produtos
     * @param produtos Colecao de produtos da qual pretende obter os precos
     * @return precos dos produtos 
     */
    public float getPrecoProdutos(Produto[] produtos);
}