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
import Resources.Collection.ListManagementContract;
import Resources.GameObjectContract;
import Resources.GameScenarioContract;
import java.io.Serializable;

/**
 * Classe responsável por representar a estrutura do cenário.
 */
public class Scenario implements GameScenarioContract, Serializable {

    /**
     * O identificador do {@link Scenario cenário}.
     */
    private int id;
    /**
     * O Nome do {@link Scenario cenário}.
     */
    private String name;
    /**
     * A Largura do {@link Scenario cenário}.
     */
    private int width;
    /**
     * A Altura do {@link Scenario cenário}.
     */
    private int height;
    /**
     * O caminho para a imagem de fundo do {@link Scenario cenário}.
     */
    private String backgroundImage;
    /**
     * O caminho para a musica de fundo do {@link Scenario cenário}.
     */
    private String backgroundMusic;

    private ListManagement list;

    /**
     * Método constutor que permite instancia um {@link Scenario cenário}.
     *
     * @param id O identificador do {@link Scenario cenário}.
     * @param name O Nome do {@link Scenario cenário}.
     * @param width A Largura do {@link Scenario cenário}.
     * @param height A Altura do {@link Scenario cenário}.
     * @param backgroundImage O caminho para a imagem de fundo do
     * {@link Scenario cenário}.
     */
    public Scenario(int id, String name, int width, int height,
            String backgroundImage) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.backgroundImage = backgroundImage;
        this.backgroundMusic = "C:\\Users\\anaal\\Desktop\\PP_MA02_8130144_8130368\\music\\music.ogg";
        this.list = new ListManagement();
    }

    /**
     * Método responsável retornar o {@link Scenario#name nome} do
     * {@link Scenario cenário}.
     *
     * @return O {@link Scenario#name nome} do {@link Scenario cenário}.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Método responsável definir {@link Scenario#name nome} do
     * {@link Scenario cenário}.
     *
     * @param string O {@link Scenario#name nome} do {@link Scenario cenário}.
     */
    @Override
    public void setName(String string) {
        this.name = string;
    }

    /**
     * Método responsável definir a {@link Scenario#width largura} do
     * {@link Scenario cenário}.
     *
     * @param i A {@link Scenario#width largura} do {@link Scenario cenário}.
     */
    @Override
    public void setWidth(int i) {
        this.width = i;
    }

    /**
     * Método responsável retornar a {@link Scenario#width largura} do
     * {@link Scenario cenário}.
     *
     * @return A {@link Scenario#width largura} do {@link Scenario cenário}.
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Método responsável definir a {@link Scenario#height altura} do
     * {@link Scenario cenário}.
     *
     * @param i A {@link Scenario#height altura} do {@link Scenario cenário}.
     */
    @Override
    public void setHeigth(int i) {
        this.height = i;
    }

    /**
     * Método responsável retornar a {@link Scenario#height altura} do
     * {@link Scenario cenário}.
     *
     * @return A {@link Scenario#height altura} do {@link Scenario cenário}.
     */
    @Override
    public int getHeigth() {
        return height;
    }

    /**
     * Método responsável definir o {@link Scenario#id identificador} do
     * {@link Scenario cenário}.
     *
     * @param i O {@link Scenario#id identificador} do {@link Scenario cenário}.
     */
    @Override
    public void setID(int i) {
        this.id = i;
    }

    /**
     * Método responsável retornar o {@link Scenario#id identificador} do
     * {@link Scenario cenário}.
     *
     * @return O {@link Scenario#id identificador} do {@link Scenario cenário}.
     */
    @Override
    public int getID() {
        return id;
    }

    /**
     * Método responsável definir a {@link Scenario#backgroundImage imagem de
     * fundo} do {@link Scenario cenário}.
     *
     * @param string O caminho para a {@link Scenario#backgroundImage imagem de
     * fundo} do {@link Scenario cenário}.
     */
    @Override
    public void setBackgroundImage(String string) {
        this.backgroundImage = string;
    }

    /**
     * Método responsável retornar a {@link Scenario#backgroundImage imagem de
     * fundo} do {@link Scenario cenário}.
     *
     * @return O caminho para a {@link Scenario#backgroundImage imagem de fundo}
     * do {@link Scenario cenário}.
     */
    @Override
    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    /**
     * Método responsável definir a {@link Scenario#backgroundMusic música} do
     * {@link Scenario cenário}.
     *
     * @param string O caminho para a {@link Scenario#backgroundMusic música} do
     * {@link Scenario cenário}.
     */
    @Override
    public void setBackgroundMusic(String string) {
        this.backgroundMusic = string;
    }

    /**
     * Método responsável retornar a {@link Scenario#backgroundMusic música} do
     * {@link Scenario cenário}.
     *
     * @return caminho para a {@link Scenario#backgroundMusic música} do
     * {@link Scenario cenário}.
     */
    @Override
    public String getBackgroundMusic() {
        return this.backgroundMusic;
    }

    /**
     * Método responsável adicionar um {@link GameObject objeto} ao
     * {@link Scenario cenário}
     *
     * @param goc O {@link Object objeto}.
     * @return Valor que sinaliza o sucesso/insucesso da operação
     */
    @Override
    public boolean addGameObject(GameObjectContract goc) {
        if (this.list.hasObject(goc) == false) {
            return this.list.addObject(goc);
        } else {
            return false;
        }
    }

    /**
     * Método responsável retornar um {@link GameObject objeto} do
     * {@link Scenario cenário} tendo por base o seu índice na coleção.
     *
     * @param i O seu índice na coleção.
     * @return O {@link GameObject objeto} na coleção
     */
    @Override
    public GameObjectContract getGameObject(int i) {
        return (GameObjectContract) this.list.getObject(i);
    }

    /**
     * Método responsável por definir o mapa de colisões para um dado
     * {@link Scenario cenário}.
     *
     * @return Uma coleção de elementos do tipo {@link CollisionArea} que
     * representa a área de colisão de cada {@link GameObject objeto} do
     * {@link Scenario cenário}. REVERRRRRR
     */
    @Override
    public ListManagementContract colisionMapping() {
        CollisionArea ca = new CollisionArea();
        ListManagement m = new ListManagement(this.getNumberOfObjects());
        for (int i = 0; i < this.list.getNumberOfObjects(); i++) {
            ca = (CollisionArea) this.list.getObject(i);
            m.addObject(ca);
        }
        return m;
    }

    /**
     * Método responsável por retornar o número de {@link GameObject objetos} no
     * {@link Scenario cenário}.
     *
     * @return Número de {@link GameObject objetos} no {@link Scenario cenário}.
     */
    @Override
    public int getNumberOfObjects() {
        return this.list.getNumberOfObjects();
    }

    /**
     * Método que permite obter a representação textual de
     * {@link Scenario cenário}.
     *
     * @return Representação textual de {@link Scenario cenário}.
     */
    @Override
    public String toString() {
        return "Scenario{" + "id=" + id + ", name=" + name + ", width="
                + width + ", height=" + height + ", backgroundImage="
                + backgroundImage + ", backgroundMusic=" + backgroundMusic
                + ", list=" + list + '}';
    }

    /**
     * Método que permite mostrar a descricao de um {@link Scenario cenário}.
     */
    public void scenarioDescription() {
        System.out.println(toString());
    }
}
