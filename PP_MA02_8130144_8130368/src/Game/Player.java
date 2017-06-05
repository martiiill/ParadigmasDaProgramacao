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
import Resources.Exceptions.FileHandlingException;
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
     * {@link MapManagement}
     */
    private MapManagement map;

    /**
     * Método construtor que permite instanciar um {@link Player jogador}.
     *
     * @param mapLimits Se o {@link Player jogador} pode ultrapassar os limites.
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
    public Player(boolean mapLimits, String name, int x, int y, int width,
            int height, boolean collision, boolean collide,
            CollisionArea colliding, Animation animation) {
        super(name, x, y, width, height, collision, collide, colliding);
        this.map = new MapManagement();
        this.mapLimits = mapLimits;
    }

    /**
     * Método construtor que permite instanciar um {@link Player jogador}.
     *
     * @param mapLimits Se o {@link Player jogador} pode ultrapassar os limites.
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
    public Player(boolean mapLimits, String name, int x, int y, int width,
            int height, boolean collision, boolean collide,
            CollisionArea colliding) {
        super(name, x, y, width, height, collision, collide, colliding);
        this.mapLimits = mapLimits;
        this.map = new MapManagement();
    }

    /**
     * Método construtor que permite instanciar um {@link Player jogador}.
     */
    public Player() {
        this.map = new MapManagement();
    }
    
    /**
     * Método que permite gravar num ficheiro um {@link Player jogador}.
     * @param p O {@link Player jogador} a gravar.
     * @throws FileHandlingException Excecao lançada caso ocorra algum erro.
     */
    public void save (Player p ) throws FileHandlingException{
        Store s = new Store();
        s.saveToFile(p, "fic.txt");
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
     * @param pmd {@link PlayerMovementDirection movimento} do jogador
     * @param gac {@link Animation animação} a associar
     */
    @Override
    public void addAnimation(PlayerMovementDirection pmd,
            GameAnimationContract gac) {
        try {
            this.map.addEntry(pmd, gac);
        } catch (DuplicateEntryException ex){
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE,null, ex);
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
        return "Player: " + "mapLimits=" + mapLimits + ", map=" + map + '}';
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
            return (GameAnimationContract) this.map.getByKey(pmd);
        } catch (KeyNotFoundException ex) {
            ex.toString();
            return null;
        }
    }
}
