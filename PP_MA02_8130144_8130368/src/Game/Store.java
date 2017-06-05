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
import Resources.Collection.Storable;
import Resources.Exceptions.FileHandlingException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável que representa o armazenamento e carregamento de dados.
 */
public class Store implements Storable, Serializable {

    /**
     * Caminho do ficheiro para guardar os dados em relação ao jogo.
     */
    private String path;

    /**
     * Caminho do ficheiro para guardar os dados em relaçãos ás colisões.
     */
    private String path_2;

    /**
     * Método construtor que permite instanciar um {@link Store armazenamento de
     * dados}.
     *
     * @param path Caminho do ficheiro para guardar os dados.
     * @param path_2 Caminho do ficheiro para guardar os dados do mapa de colisoes.
     */
    public Store(String path, String path_2) {
        this.path = path;
        this.path_2 = path_2;
    }

    /**
     * Método construtor que permite instanciar um {@link Store armazenamento de
     * dados}.
     */
    public Store() {
        this.path = "fic.txt";
        this.path_2 = "collisionData.txt";
    }

    /**
     * Método que permite carregar um objecto em ficheiro
     *
     * @param string nome do ficheiro de destino
     * @return Valor booleano sinalizando o sucesso/insucesso da operação
     * @throws FileHandlingException Exceção que representa problemas no acesso
     * e leitura em ficheiro
     */
    @Override
    public GameObject loadFromFile(String string) throws FileHandlingException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(string);
            Object o = null;
            try (ObjectInputStream oIn = new ObjectInputStream(fileIn)) {
                try {
                    o = oIn.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
                System.out.println("Objeto lido do ficheiro " + string);
            }
            return (GameObject) o;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        return null;
    }

    /**
     * Método que permite carregar um objecto em ficheiro
     *
     * @param string nome do ficheiro de destino
     * @return Valor booleano sinalizando o sucesso/insucesso da operação
     * @throws FileHandlingException Exceção que representa problemas no acesso
     * e leitura em ficheiro
     */
    public ListManagement loadFromFileCA(String string) throws FileHandlingException {
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(string);
            Object o = null;
            try (ObjectInputStream oIn = new ObjectInputStream(fileIn)) {
                try {
                    o = oIn.readObject();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE,
                            null, ex);
                }
                System.out.println("Objeto lido do ficheiro " + string);
            }
            return  (ListManagement) o;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fileIn.close();
            } catch (IOException ex) {
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE,
                        null, ex);
            }
        }
        return null;
    }

    /**
     * Método para definir o {@link Store#path caminho} para o ficheiro.
     *
     * @param string {@link Store#path Caminho} para o ficheiro.
     */
    @Override
    public void setPath(String string) {
        this.path = string;
    }

    /**
     * Método que retorna o {@link Store#path caminho} para o ficheiro.
     *
     * @return {@link Store#path Caminho} para o ficheiro.
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Método que retorna o {@link Store#path caminho} para o ficheiro de
     * colisões.
     *
     * @return {@link Store#path_2 Caminho} para o ficheiro de colisões.
     */
    public String getPath_2() {
        return path_2;
    }

    /**
     * Método para definir o {@link Store#path_2 caminho} para o ficheiro de
     * colisões.
     *
     * @param path_2 {@link Store#path_2 Caminho} para o ficheiro de colisões.
     */
    public void setPath_2(String path_2) {
        this.path_2 = path_2;
    }

    /**
     * Método que permite armazenar um objecto em ficheiro.
     *
     * @param o Objeto a armazenar em ficheiro.
     * @param string Nome do ficheiro de destino.
     * @return Valor booleano sinalizando o sucesso/insucesso da operação.
     * @throws FileHandlingException Exceção que representa problemas no acesso
     * e escrita em ficheiro.
     */
    @Override
    public boolean saveToFile(java.lang.Object o, String string) throws
            FileHandlingException {
        try {
            FileOutputStream fileOut = new FileOutputStream(string);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(o);
            objectOut.close();
            System.out.println("Objeto escrito!");
            return true;
        } catch (IOException ex) {
            ex.toString();
        }
        return false;
    }
}
