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

import Game.Management.MapManagement;
import Resources.Enums.PlayerMovementDirection;
import Resources.Exceptions.DuplicateEntryException;
import Resources.Exceptions.KeyNotFoundException;
import Resources.GameAnimationContract;
import Resources.GamePlayerContract;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que representa a estrutura do jogador.
 */
public class Player extends GameObject implements GamePlayerContract,
        Serializable {

    /**
     * Se o {@link Player jogador} pode ultrapassar os limites do cenário
     */
    private boolean mapLimits;
    /**
     *
     */
    private MapManagement map;

    /**
     * Método construtor que permite instanciar um {@link Player jogador} com
     * animacoes.
     *
     * @param mapLimits
     * @param name
     * @param x
     * @param y
     * @param width
     * @param height
     * @param collision
     * @param collide
     * @param colliding
     * @param animation
     */
    public Player(boolean mapLimits,
            String name, int x, int y, int width, int height, boolean collision,
            boolean collide, CollisionArea colliding, Animation animation) {
        super(name, x, y, width, height, collision, collide, colliding,
                animation);
        this.mapLimits = mapLimits;
        this.map = new MapManagement();
    }

   /**
    * 
    * @param mapLimits
    * @param name
    * @param x
    * @param y
    * @param width
    * @param height
    * @param collision
    * @param collide
    * @param colliding 
    */ 
    public Player(boolean mapLimits, String name, int x, int y, int width, 
            int height, boolean collision, boolean collide, 
            CollisionArea colliding) {
        super(name, x, y, width, height, collision, collide, colliding);
        this.mapLimits = mapLimits;
        this.map = new MapManagement();
    }

    /**
     * Método responsável por definir se o jogador pode ultrapassar os limites
     * do cenário
     *
     * @param bln Valor booleano que sinaliza que um jogador pode/não pode
     * ultrapassar os limites do cenário
     */
    @Override
    public void setMapLimits(boolean bln) {
        this.mapLimits = bln;
    }

    /**
     * Método responsável por retornar se o jogador pode ultrapassar os limites
     * do cenário
     *
     * @return Valor booleano que sinaliza que um jogador pode/não pode
     * ultrapassar os limites do cenário
     */
    @Override
    public boolean getMapLimits() {
        return this.mapLimits;
    }

    /**
     * Método responsável por adicionar uma animação associada um movimento do
     * jogador. A associação deverá ser realizada através da classe de
     * mapeamento: {@link MapManagement mapeamento}.
     *
     * @param pmd
     * @param gac
     */
    @Override
    public void addAnimation(PlayerMovementDirection pmd,
            GameAnimationContract gac) {
        try {
            this.map.addEntry(pmd, gac);
        } catch (DuplicateEntryException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }

    /**
     * Método que permite obter a descrição textual de um
     * {@link Player jogador}.
     *
     * @return Descrição textual do {@link Player jogador}.
     */
    @Override
    public String toString() {
        return "Player{" + "mapLimits=" + mapLimits + ", map=" + map + '}';
    }

    /**
     * Método responsável por imprimir uma descrição textual do
     * {@link Player jogador} e a sua posição em termos de coordenadas (X, Y).
     */
    @Override
    public void playerDescription() {
        System.out.println(toString());
    }

    /**
     * Método que retorna uma animação tendo por base um movimento do
     * {@link Player jogador}.
     *
     * @param pmd {@link PlayerMovementDirection Movimento} do
     * {@link Player jogador}.
     * @return Animação associada ao {@link PlayerMovementDirection Movimento}.
     */
    @Override
    public GameAnimationContract getAnimation(PlayerMovementDirection pmd) {
        try {
            return (GameAnimationContract) map.getByKey(pmd);
        } catch (KeyNotFoundException ex) {
            ex.toString();
            return null;
        }
    }
}
