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

import Resources.Exceptions.FileHandlingException;
import Resources.GameLevelContract;
import Resources.GamePlayerContract;
import Resources.GameScenarioContract;
import java.io.Serializable;

/**
 * Classe responsável por definir a estrutura de um nível associado a um jogo. 
 */
public class Level implements GameLevelContract, Serializable{
    /**
     * {@link Player Jogador} do {@link Level nível}.
     */
    private Player player;
    /**
     * O {@link Level#id identificador} do {@link Level nível}. 
     */
    private int id;
    /**
     * Estrutura do {@link Scenario cenário} do {@link Level nível}. 
     */
    private Scenario scenario;
    /**
     * Valor booleano sinalizando a utilização/não utilização do método de 
     * depuração.
     */
    private boolean debug; 

    /**
     * Método construtor que permite criar uma instância de {@link Level nível}.
     * @param player {@link Player Jogador} do {@link Level nível}.
     * @param id O {@link Level#id identificador} do {@link Level nível}. 
     * @param scenario Estrutura do {@link Scenario cenário} do {@link Level 
     * nível}. 
     * @param debug Valor booleano sinalizando a utilização/não utilização 
     * do método de depuração.
     */
    public Level(Player player, int id, Scenario scenario,boolean debug) {
        this.player = player;
        this.id = id;
        this.scenario = scenario;
        this.debug = debug;
    }
    
     /**
     * Método que permite gravar num ficheiro um {@link Level nível}.
     * @param l O {@link Level nível} a gravar.
     * @throws FileHandlingException Excecao lançada caso ocorra algum erro.
     */
    public void save (Level l) throws FileHandlingException{
        Store s = new Store();
        s.saveToFile(l, "fic.txt");
    }
    
    /**
     * Método construtor que permite criar uma instância de {@link Level nível}.
     */
    public Level(){}

    /**
     * Método responsável por definir um {@link Scenario cenário} num 
     * determinado {@link Level nível}.
     * @param gsc Estrutura do {@link Scenario cenário}.
     */
    @Override
    public void setScenario(GameScenarioContract gsc) {
       this.scenario = (Scenario) gsc;
    }

    /**
     * Método responsável por retornar um {@link Scenario cenário} de um 
     * determinado {@link Level nível}.
     * @return Estrutura do {@link Scenario cenário}.
     */
    @Override
    public GameScenarioContract getScenario() {
        return this.scenario;
    }

    /**
     * Método responsável por definir um {@link Player jogador} num determinado 
     * {@link Level nível}.
     * @param gpc O {@link Player jogador}.
     */
    @Override
    public void setPlayer(GamePlayerContract gpc) {
        this.player = (Player) gpc;
    }

    /**
     * Método responsável por retornar um {@link Player jogador} de um 
     * determinado {@link Level nível}.
     * @return O {@link Player jogador}.
     */
    @Override
    public GamePlayerContract getPlayer() {
        return this.player;
    }

    /**
     * Método responsável por definir o {@link Level#debug modo de execução} 
     * do {@link Level nível}. 
     * (true/false significa que o jogo será/não será executado em modo de 
     * depuração, respectivamente).
     * @param bln Valor booleano sinalizando a utilização/não utilização 
     * do método de depuração.
     */
    @Override
    public void setDebug(boolean bln) {
       this.debug = bln;
    }

    /**
     * Método responsável por retornar a configuração 
     * {@link Level#debug modo de depuração} do {@link Level nível}. 
     * @return Valor booleano sinalizando a utilização/não utilização 
     * do método de depuração.
     */
    @Override
    public boolean getDebug() {
        return debug;
    }

    /**
     * Método responsável por definir o {@link Level#id identificador} do 
     * {@link Level nível}. 
     * @param i O {@link Level#id identificador} do {@link Level nível}. 
     */
    @Override
    public void setId(int i) {
        this.id = i;
    }

    /**
     * Método responsável por retornar o {@link Level#id identificador} do 
     * {@link Level nível}. 
     * @return O {@link Level#id identificador} do {@link Level nível}. 
     */
    @Override
    public int getId() {
       return this.id;
    }

    /**
     * Método que permite obter a representação textual de um 
     * {@link Level nível}. 
     * @return Representação textual de um {@link Level nível}. 
     */
    @Override
    public String toString() {
        return "\nLevel\n" + "Player: "+ player + "\n" + "Id: " + id + "\n" + 
                scenario + "\n" + "DebugMode: " + debug + "\n";
    }

    /**
     * Método responsável por imprimir uma descrição textual do nivel
     */
    @Override
    public void levelDescription() {
        System.out.println(toString());
    }
}
