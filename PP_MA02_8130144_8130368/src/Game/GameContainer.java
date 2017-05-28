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

import Game.Management.ListManagement;
import Resources.Exceptions.DuplicateLevelsId;
import Resources.GameContainerContract;
import Resources.GameLevelContract;
import java.io.Serializable;

/**
 * Classe responsável por definir o conteúdo de um jogo, organizado em diversos
 * níveis. Só pode ser criada uma instância desta classe.
 */
public class GameContainer implements GameContainerContract, Serializable {

    private String name;
    private boolean debugMode;
    private ListManagement list;

    /**
     * Método construtor que permite criar uma instância. Tem de ser privado, se
     * não as outras classes podem criar uma instância desta classe.
     *
     * @param name O {@link GameContainer#name nome} do jogo.
     * @param debugMode O {@link GameContainer#debugMode modo de depuração}.
     */
    public GameContainer(String name, boolean debugMode) {
        this.name = name;
        this.debugMode = debugMode;
        this.list = new ListManagement();
    }

    /**
     * Este método permite obter uma só instância desta classe.
     *
     * @return instância desta classe.
     */
//    public static GameContainer getInstance() {
//        return containerInstance;
//    }
//    
//     private static final GameContainer containerInstance
//            = new GameContainer(getInstance().name, getInstance().debugMode, getInstance().level);
//
    /**
     * Método responsável por adicionar um novo {@link Level nível}.
     *
     * @param glc Representa o {@link Level nível} para adicionar ao jogo.
     * @return Valor booleano que sinaliza o sucesso/insucesso da operação.
     * @throws DuplicateLevelsId Exceção que representa a existência de dois
     * níveis com o mesmo idenficador.
     */
    @Override
    public boolean addNewLevel(GameLevelContract glc) throws DuplicateLevelsId {

        if (this.list.hasObject(glc) == true) {
            throw new DuplicateLevelsId("Já existe um nível igual.");
        } else {
            this.list.addObject(glc);
            return false;
        }
    }

    /**
     * Método responsável por eliminar um {@link Level nível}.
     *
     * @param glc {@link Level Nível} a remover.
     * @return Valor booleano que sinaliza o sucesso/insucesso da operação.
     */
    @Override
    public boolean removeLevel(GameLevelContract glc
    ) {
        int position = this.list.findObject(glc);
        if (position != -1) {
            this.list.addObject(glc);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método responsável por retornar um {@link Level nível} tendo por base num
     * índice.
     *
     * @param i Índice da coleção em que se pretende obter o
     * {@link Level nível}.
     * @return O {@link Level nível} no índice especificado
     */
    @Override
    public GameLevelContract getLevel(int i) {
        return (GameLevelContract) this.list.getObject(i);
    }

    /**
     * Método responsável por retornar o número de {@link Level níveis}.
     *
     * @return Número de {@link Level níveis}.
     */
    @Override
    public int getSize() {
        return this.list.getNumberOfObjects();
    }

    /**
     * Método responsável por retornar a configuração do
     * {@link GameContainer#debugMode modo de depuração}.
     *
     * @return Valor booleano sinalizando a utilização/não utilização do método
     * de {@link GameContainer#debugMode modo de depuração}.
     */
    @Override
    public boolean getDebugMode() {
        return debugMode;
    }

    /**
     * Método responsável por definir o modo de execução do jogo (true/false
     * significa que o jogo será/não será executado em
     * {@link GameContainer#debugMode modo de depuração}, respetivamente).
     *
     * @param bln Valor booleano sinalizando a utilização/não utilização do
     * {@link GameContainer#debugMode modo de depuração}.
     */
    @Override
    public void setDebugMode(boolean bln) {
        this.debugMode = bln;
    }

    /**
     * Método responsável por definir o {@link GameContainer#name nome} do jogo.
     *
     * @param string O {@link GameContainer#name nome} do jogo.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método responsável por retornar o {@link GameContainer#name nome} do
     * jogo.
     *
     * @return O {@link GameContainer#name nome} do jogo.
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GameContainer{" + "name=" + name + ", debugMode=" + debugMode + ", list=" + list + '}';
    }

    

    public void gameContainerDescription() {
        System.out.println(toString());
    }
}
