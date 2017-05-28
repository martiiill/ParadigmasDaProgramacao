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

import Resources.Exceptions.ObjectException;
import Resources.GameAnimationContract;
import Resources.GameCollisionRectangleContract;
import Resources.GameObjectContract;
import java.io.Serializable;

/**
 * Classe responsável por representar a estrutura de um objeto num dado cenário.
 */
public class GameObject implements GameObjectContract, Serializable {

    /**
     * O {@link GameObject#name nome} do {@link GameObject objeto}.
     */
    private String name;
    /**
     * A posição no eixo dos {@link GameObject#x x} do
     * {@link GameObject objeto}.
     */
    private int x;
    /**
     * A posição no eixo dos {@link GameObject#y y} do
     * {@link GameObject objeto}.
     */
    private int y;
    /**
     * A {@link GameObject#width largura} do {@link GameObject objeto}.
     */
    private int width;
    /**
     * A {@link GameObject#height altura} do {@link GameObject objeto}.
     */
    private int height;
    /**
     * Valor booleano sinalizando se possui/não possui
     * {@link GameObject#collision colisão}.
     */
    private boolean collision;
    /**
     * Valor booleano sinalizando que está/não está
     * {@link GameObject#collide em colisão}.
     */
    private boolean collide;
    /**
     * Configurações associadas à {@link GameObject#colliding colisão}.
     */
    private CollisionArea colliding;
    /**
     * Uma {@link Animation animação} associado ao {@link GameObject objeto}.
     */
    private Animation animation;

    /**
     * Método que permite criar uma instância de {@link GameObject objeto}, com
     * animacao.
     *
     * @param name O {@link GameObject#name nome} do {@link GameObject objeto}.
     * @param x A posição no eixo dos {@link GameObject#x xx} do
     * {@link GameObject objeto}.
     * @param y A posição no eixo dos {@link GameObject#y yy} do
     * {@link GameObject objeto}.
     * @param width A {@link GameObject#width largura} do
     * {@link GameObject objeto}.
     * @param height A {@link GameObject#height altura} do
     * {@link GameObject objeto}.
     * @param collision Valor booleano sinalizando se possui/não possui
     * {@link GameObject#collision colisão}.
     * @param collide Valor booleano sinalizando que está/não está
     * {@link GameObject#collide em colisão}.
     * @param colliding Configurações associadas à
     * {@link GameObject#colliding colisão}.
     * @param animation Uma {@link Animation animação} associado ao 
     * {@link GameObject objeto}.
     */
    public GameObject(String name, int x, int y, int width, int height,
            boolean collision, boolean collide, CollisionArea colliding,
            Animation animation) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.collision = collision;
        this.collide = collide;
        this.colliding = colliding;
        this.animation = animation;
    }

    /**
     * Método que permite criar uma instância de {@link GameObject objeto}, sem
     * animacao.
     *
     * @param name O {@link GameObject#name nome} do {@link GameObject objeto}.
     * @param x A posição no eixo dos {@link GameObject#x xx} do
     * {@link GameObject objeto}.
     * @param y A posição no eixo dos {@link GameObject#y yy} do
     * {@link GameObject objeto}.
     * @param width A {@link GameObject#width largura} do
     * {@link GameObject objeto}.
     * @param height A {@link GameObject#height altura} do
     * {@link GameObject objeto}.
     * @param collision Valor booleano sinalizando se possui/não possui
     * {@link GameObject#collision colisão}.
     * @param collide Valor booleano sinalizando que está/não está
     * {@link GameObject#collide em colisão}.
     * @param colliding Configurações associadas à
     * {@link GameObject#colliding colisão}.
     */
    public GameObject(String name, int x, int y, int width, int height,
            boolean collision, boolean collide, CollisionArea colliding) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.collision = collision;
        this.collide = collide;
        this.colliding = colliding;
    }
    
    /**
     * Método que permite criar uma instância de {@link GameObject objeto} vazio.
     */
    public GameObject(){}

    /**
     * Método responsável por verificar se o objeto possui/não possui
     * {@link GameObject#collision colisão}.
     *
     * @return Valor booleano sinalizando se possui/não possui
     * {@link GameObject#collision colisão}.
     */
    @Override
    public boolean hasCollision() {
        return collision;
    }

    /**
     * Método responsável por definir se o objeto possui/não possui
     * {@link GameObject#collision colisão} (true/false significa que o
     * {@link GameObject objeto} terá/não terá {@link GameObject#collision
     * colisão}, respectivamente)
     *
     * @param bln Valor booleano sinalizando se possui/não possui
     * {@link GameObject#collision colisão}
     */
    @Override
    public void setCollision(boolean bln) {
        this.collision = bln;
    }

    /**
     * Método responsável por definir uma {@link Animation animação} associado
     * ao {@link GameObject objeto}.
     *
     * @param gac Uma {@link Animation animação} associado ao
     * {@link GameObject objeto}.
     * @throws ObjectException Exceção que representa a existência de erro
     * relacionado com a {@link Animation animação} associada ao
     * {@link GameObject objeto}.
     */
    @Override
    public void setAnimation(GameAnimationContract gac) throws ObjectException {
        if (gac == null) {
            throw new ObjectException("O objeto é nulo");
        } else {
            this.animation = (Animation) gac;
        }
    }

    /**
     * Método responsável por retornar uma {@link Animation animação} associada
     * ao {@link GameObject objeto}.
     *
     * @return Uma {@link Animation animação} associado ao {@link GameObject
     * objeto}.
     * @throws ObjectException Exceção que representa a existência de erro
     * relacionado com a {@link Animation animação} associada ao
     * {@link GameObject objeto}.
     */
    @Override
    public GameAnimationContract getAnimation() throws ObjectException {
        if (animation == null) {
            throw new ObjectException("O objeto é nulo");
        } else {
            return animation;
        }
    }

    /**
     * Método responsável por retornar a {@link GameObject#width largura} do
     * {@link GameObject objeto}.
     *
     * @return A {@link GameObject#width largura} do {@link GameObject objeto}.
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Método responsável por definir a {@link GameObject#width largura} do
     * {@link GameObject objeto}.
     *
     * @param i A {@link GameObject#width largura} do {@link GameObject objeto}.
     */
    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    /**
     * Método responsável por retornar a {@link GameObject#height altura} do
     * {@link GameObject objeto}.
     *
     * @return A {@link GameObject#height altura} do {@link GameObject objeto}.
     */
    @Override
    public int getHeigth() {
        return height;
    }

    /**
     * Método responsável por definir a {@link GameObject#height altura} do
     * {@link GameObject objeto}.
     *
     * @param i A {@link GameObject#height altura} do {@link GameObject objeto}.
     */
    @Override
    public void setHeigth(int i) {
        this.height = i;
    }

    /**
     * Método responsável por retornar a posição no eixo dos
     * {@link GameObject#x xx} do {@link GameObject objeto}.
     *
     * @return A posição no eixo dos {@link GameObject#x xx} do
     * {@link GameObject objeto}.
     */
    @Override
    public int getX() {
        return x;
    }

    /**
     * Método responsável por definir a posição no eixo dos
     * {@link GameObject#x xx} do {@link GameObject objeto}.
     *
     * @param i A posição no eixo dos {@link GameObject#x xx} do
     * {@link GameObject objeto}.
     */
    @Override
    public void setX(int i) {
        this.x = i;
    }

    /**
     * Método responsável por retornar a posição no eixo dos
     * {@link GameObject#y yy} do {@link GameObject objeto}.
     *
     * @return A posição no eixo dos {@link GameObject#y yy} do
     * {@link GameObject objeto}.
     */
    @Override
    public int getY() {
        return y;
    }

    /**
     * Método responsável por definir a posição no eixo dos
     * {@link GameObject#y yy} do {@link GameObject objeto}.
     *
     * @param i A posição no eixo dos {@link GameObject#y yy} do
     * {@link GameObject objeto}.
     */
    @Override
    public void setY(int i) {
        this.y = i;
    }

    /**
     * Método responsável por definir as configurações da
     * {@link GameObject#colliding colisão} do {@link GameObject objeto}.
     *
     * @param gcrc Configurações associadas à
     * {@link GameObject#colliding colisão}.
     */
    @Override
    public void setCollision(GameCollisionRectangleContract gcrc) {
        this.colliding = (CollisionArea) gcrc;
    }

    /**
     * Método responsável por retornar as configurações da
     * {@link GameObject#colliding colisão} do {@link GameObject objeto}.
     *
     * @return Configurações associadas à {@link GameObject#colliding colisão}.
     */
    @Override
    public GameCollisionRectangleContract getCollision() {
        return colliding;
    }

    /**
     * Método responsável por indicar que o {@link GameObject objeto} está
     * {@link GameObject#collide em colisão}
     *
     * @param bln Valor booleano sinalizando que está/não está
     * {@link GameObject#collide em colisão}.
     */
    @Override
    public void setIsColliding(boolean bln) {
        this.collide = bln;
    }

    /**
     * Método responsável por retornar se o {@link GameObject objeto} está
     * {@link GameObject#collide em colisão}.
     *
     * @return Valor booleano sinalizando que está/não está
     * {@link GameObject#collide em colisão}.
     */
    @Override
    public boolean getIsColliding() {
        return collide;
    }

    /**
     * Método responsável por retornar o {@link GameObject#name nome} do
     * {@link GameObject objeto}.
     *
     * @return O {@link GameObject#name nome} do {@link GameObject objeto}.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Método responsável por definir o {@link GameObject#name nome} do
     * {@link GameObject objeto}.
     *
     * @param string O {@link GameObject#name nome} do
     * {@link GameObject objeto}.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método que permite obter a representação textual do
     * {@link GameObject objeto}.
     *
     * @return Representação textual do {@link GameObject objeto}.
     */
    @Override
    public String toString() {
        return "Game Object\nName: " + name + "\nX: " + x + "\nY: " + y
                + "\nWidth: " + width + "\nHeight: " + height + "\nCollision: "
                + collision + "\nCollide: " + collide + "\nColliding: "
                + colliding + "\nAnimation: " + animation;
    }

    public void GameObjectDescription() {
        System.out.println(toString());
    }
}
