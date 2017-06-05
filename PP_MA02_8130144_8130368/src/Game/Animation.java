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
import Resources.Exceptions.FileHandlingException;
import Resources.GameAnimationContract;
import java.io.File;
import java.io.Serializable;
import java.nio.file.InvalidPathException;

/**
 * Classe responsável por definir o encapsulamento do conteúdo de uma animação.
 * Uma animação caracteriza-se pela apresentação de um conjunto de (imagens)
 * sprites tendo por base um intervalo de tempo específico. No entanto, também
 * poderá ser definida apenas uma imagem para caracterização de um
 * {@link Object objeto}.
 */
public class Animation implements GameAnimationContract, Serializable {

    /**
     * Caminho da {@link Animation imagem da animação}.
     */
    private String imagePath;
    /**
     * Duraçao da {@link Animation imagem da animação}.
     */
    private int duration;
    /**
     * Altura da {@link Animation imagem da animação}.
     */
    private int height;
    /**
     * Largura da {@link Animation imagem da animação}.
     */
    private int width;

    /**
     * {@link ListManagement lista} de objetos que a
     * {@link Animation imagem da animação} tem.
     */
    private ListManagement man;

    /**
     * Método construtor que permite criar uma instância de {@link Animation
     * imagem da animação}.
     * @param duration Duraçao da {@link Animation imagem da animação}.
     * @param height Altura da {@link Animation imagem da animação}.
     * @param width Largura da {@link Animation imagem da animação}.
     * @param imagePath Caminho da {@link Animation imagem da animação}.
     * @throws Resources.Exceptions.FileHandlingException Excecao caso ocorra
     * algum erro.
     */
    public Animation(int duration, int height, int width, String imagePath) throws FileHandlingException {
        this.imagePath = imagePath;
        this.duration = duration;
        this.height = height;
        this.width = width;
        this.man = new ListManagement();   
    }
    
    /**
     * Método que permite gravar num ficheiro uma {@link Animation
     * imagem da animação}.
     * @param a A {@link Animation imagem da animação} a gravar.
     * @throws FileHandlingException Excecao lançada caso ocorra algum erro.
     */
    public void save (Animation a) throws FileHandlingException{
          Store s = new Store();
           s.saveToFile(a, "fic.txt");
    }

    /**
     * Método constutor vazio que permite instanciar uma
     * {@link Animation imagem da animação}.
     */
    public Animation() {
        this.man = new ListManagement();
    }

    /**
     * Método responsável por ler um conjunto de imagens a partir de uma pasta.
     * Deverá armazenar o nome de cada imagem (verificando que a imagem tem a
     * extensão PNG). A lista de nomes das imagens deverá ser armazenado numa
     * ListaManagement.
     *
     * @throws InvalidPathException Erro que sinaliza que uma determinada pasta
     * ou caminho não existe.
     */
    @Override
    public void loadImagesFromFolder() throws InvalidPathException {
      
       File folder = new File("Moodle2017PP\\assets\\PlayerAnimation");
       String pasta = folder + "\\up";
       File folder2 = new File(pasta);
       File[] listOfFiles = folder2.listFiles(); 

        for (File listOfFile_ : listOfFiles) {
            String s = listOfFile_.getPath();
            this.man.addObject(s);
        }
    }

    /**
     * Método responsável por definir a escala da {@link Animation
     * imagem da animação}
     *
     * @param i {@link Animation#width Largura} da {@link Animation
     * imagem da animação}
     * @param i1 {@link Animation#height Altura} da {@link Animation
     * imagem da animação}
     */
    @Override
    public void setScale(int i, int i1) {
        this.width = i;
        this.height = i1;
    }

    /**
     * Método responsável por retornar a escola definida da {@link Animation
     * imagem da animação}
     *
     * @param wi {@link Animation#width Largura} da {@link Animation
     * imagem da animação}
     * @param hei {@link Animation#height Altura} da {@link Animation
     * imagem da animação}
     */
    public void getScale(int wi, int hei) {
        setScale(wi, hei);
    }

    /**
     * Método responsável por retornar a {@link Animation#width largura} da
     * {@link Animation imagem da animação}
     *
     * @return {@link Animation#width Largura} da {@link Animation imagem
     * da animação}
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * Método responsável por retornar a {@link Animation#height altura} da
     * {@link Animation imagem da animação}
     *
     * @return {@link Animation#height Altura} da {@link Animation imagem
     * da animação}
     */
    @Override
    public int getHeigth() {
        return height;
    }

    /**
     * Método responsável por definir o {@link Animation#imagePath caminho} para
     * a {@link Animation imagem da animação}
     *
     * @param string {@link Animation#imagePath Caminho} para a {@link Animation
     * imagem da animação}
     */
    @Override
    public void setImagePath(String string) {
        this.imagePath = string;
    }

    /**
     * Método responsável por retornar o {@link Animation#imagePath caminho}
     * para a {@link Animation imagem da animação}
     *
     * @return {@link Animation#imagePath Caminho} para a {@link Animation
     * imagem da animação}
     */
    @Override
    public String getImagePath() {
        return imagePath;
    }

    /**
     * Método responsável por definir a {@link Animation#duration duração} em
     * milisegundos em que cada {@link Animation imagem da animação} é
     * atualizado.
     *
     * @param i {@link Animation#duration Duração}, em milisegundos.
     */
    @Override
    public void setAvgDuration(int i) {
        this.duration = i;
    }

    /**
     * Método responsável por retornar a {@link Animation#duration duração} em
     * milissegundos em que cada {@link Animation imagem da animação} é
     * atualizado.
     *
     * @return {@link Animation#duration Duração}, em milisegundos.
     */
    @Override
    public int getAvgDuration() {
        return this.duration;
    }

    /**
     * Método responsável por retornar a {@link Animation#height altura} da
     * {@link Animation imagem da animação}.
     *
     * @param height {@link Animation#height altura} que quer atribuir.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Método que permite mostrar a representação textual da
     * {@link Animation animação}.
     *
     * @return representação textual da {@link Animation animação}.
     */
    @Override
    public String toString() {
        return "Animation\nImage Path: " + imagePath + "\nDuration: " + duration
                + " milliseconds" + "\nHeight: " + height + "\nWidth: " + width
                + "\n";
    }

    /**
     * Método que permite obter a descrição de uma {@link Animation animação}.
     */
    public void AnimationDescription() {
        System.out.println(toString());
    }
}
