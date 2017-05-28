/**
 * Nome: Joana Machado Baptista
 * Número: 8130144
 * Turma: 3
 * 
 * Nome: Ana Alice Gonçalves Martins
 * Número: 8130368
 * Turma: 3
 */

package Game;

import Resources.GameCollisionRectangleContract;
import java.io.Serializable;

/**
 * Classe responsável por definir o encapsulamento das propriedades de um 
 * retângulo que define a área de colisão.
 */
public class CollisionArea implements GameCollisionRectangleContract,
        Serializable {
    /**
     * Valor do eixo dos xx da {@link CollisionArea àrea de colisão}.
     */
    private int x;
    /**
     * Valor do eixo dos yy da {@link CollisionArea àrea de colisão}.
     */
    private int y;
    /**
     * Largura da {@link CollisionArea àrea de colisão}.
     */
    private int widht;
    /**
     * Altura da {@link CollisionArea àrea de colisão}.
     */
    private int height;
    /**
     * Raio de alcance da {@link CollisionArea àrea de colisão}.
     */
    private int radius;
    /**
     * Preenchimento do eixo dos xx da {@link CollisionArea àrea de colisão}.
     */
    private float paddingX;
    /**
     * Preenchimento do exio dos yy da {@link CollisionArea àrea de colisão}.
     */
    private float paddingY;

    /**
     * Método construtor que permite instanciar uma {@link CollisionRectangle 
     * àrea de colisão}.
     * @param x Valor do eixo dos xx da {@link CollisionRectangle àrea de 
     * colisão}.
     * @param y Valor do eixo dos yy da {@link CollisionRectangle àrea de
     * colisão}.
     * @param widht Largura da {@link CollisionRectangle àrea de colisão}.
     * @param height Altura da {@link CollisionRectangle àrea de colisão}.
     * @param radius Raio de alcance da {@link CollisionRectangle àrea de 
     * colisão}.
     * @param paddingX Preenchimento do eixo dos xx da {@link CollisionRectangle 
     * àrea de colisão}.
     * @param paddingY Preenchimento do exio dos yy da {@link CollisionRectangle 
     * àrea de colisão}.
     */
    public CollisionArea(int x, int y, int widht, int height, int radius, 
            float paddingX, float paddingY) {
        this.x = x;
        this.y = y;
        this.widht = widht;
        this.height = height;
        this.radius = radius;
        this.paddingX = paddingX;
        this.paddingY = paddingY;
    }
    
    /**
     * Método construtor que permite instanciar uma 
     * {@link CollisionArea àrea de colisão}.
     */
    public CollisionArea() {}

    /**
     * Método responsável por retornar o valor para o eixo do
     * {@link CollisionArea#x X}.
     * @return O valor para o eixo do {@link CollisionArea#x X}
     */
    @Override
    public int getX() {
       return x;
    }

    /**
     * Método responsável por definir o valor para o eixo do 
     * {@link CollisionArea#x X}.
     * @param i O valor para o eixo do {@link CollisionArea#x X}.
     */
    @Override
    public void setX(int i) {
      this.x = i;
    }

    /**
     * Método responsável por retornar o valor para o eixo do
     * {@link CollisionArea#y Y}.
     * @return O valor para o eixo do {@link CollisionArea#y Y}.
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     *     /**
     * Método responsável por definir o valor para o eixo do 
     * {@link CollisionArea#y Y}.
     * @param i O valor para o eixo do {@link CollisionArea#y Y}.
     */
    @Override
    public void setY(int i) {
        this.y = i;
    }

    /**
     * Método responsável por retornar a {@link CollisionArea#widht largura}
     * do retângulo.
     * @return A {@link CollisionArea#widht largura} do retângulo
     */
    @Override
    public int getWidth() {
       return widht;
    }

    /**
     * Método responsável por definir a {@link CollisionArea#widht largura}
     * do retângulo.
     * @param i A {@link CollisionArea#widht largura} do retângulo.
     */
    @Override
    public void setWidth(int i) {
      this.widht = i;
    }

    /**
     * Método responsável por retornar a {@link CollisionArea#height altura} 
     * do retângulo.
     * @return A {@link CollisionArea#height altura} do retângulo.
     */
    @Override
    public int getHeigth() {
     return height;
    }

    /**
     * Método responsável por definir a {@link CollisionArea#height altura}
     * do retângulo.
     * @param i A {@link CollisionArea#height altura} do retângulo.
     */
    @Override
    public void setHeigth(int i) {
       this.height = i;
    }

    /**
     * Método responsável por definir o {@link CollisionArea#radius alcance} 
     * do retângulo.
     * @param i O {@link CollisionArea#radius alcance} do retângulo.
     */
    @Override
    public void setRadius(int i) {
        this.radius = i;
    }

    /**
     * Método responsável por retornar a {@link CollisionArea#radius alcance}
     * do retângulo
     * @return A {@link CollisionArea#radius alcance} do retângulo.
     */
    @Override
    public float getRadius() {
       return radius;
    }

    /**
     * Método responsável por definir o 
     * {@link CollisionArea#paddingX preenchimento} do retângulo no eixo do X.
     * @param f O {@link CollisionArea#paddingX preenchimento}
     * do retângulo no eixo do X.
     */
    @Override
    public void setPaddingX(float f) {
       this.paddingX = f;
    }

    /**
     * Método responsável por retornar o 
     * {@link CollisionArea#paddingX preenchimento} do retângulo no eixo do X.
     * @return O {@link CollisionArea#paddingX preenchimento}
     * do retângulo no eixo do X.
     */
    @Override
    public float getPaddingX() {
     return paddingX;
    }

    /**
     * Método responsável por definir o 
     * {@link CollisionArea#paddingY preenchimento} do retângulo no eixo do Y.
     * @param f O {@link CollisionArea#paddingY preenchimento}
     * do retângulo no eixo do Y.
     */
    @Override
    public void setPaddingY(float f) {
        this.paddingY = f;
    }

    /**
     * Método responsável por retornar o 
     * {@link CollisionArea#paddingY preenchimento} do retângulo no eixo do Y.
     * @return O {@link CollisionArea#paddingY preenchimento}
     * do retângulo no eixo do Y.
     */
    @Override
    public float getPaddingY() {
     return paddingY;
    }

    /**
     * Método que permite obter a representação textual de uma 
     * {@link CollisionArea àrea de colisão}.
     * @return representação textual da {@link CollisionArea àrea de colisão}.
     */
    @Override
    public String toString() {
        return "Collision Area\nX: " + x + "\nY: " + y + "\nWidth: " + widht + 
                "\nHeight: " + height + "\nRadius: " + radius + "\nPadding X: " 
                + paddingX + "\nPaddging Y: " + paddingY + "\n"; 
    }
    
    /**
     * Método que mostra a descricao de uma 
     * {@link CollisionArea àrea de colisão}.
     */
    public void collissionAreaDescription(){
        System.out.println(toString());
    }
}