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

import Resources.Collection.Storable;
import Resources.Exceptions.FileHandlingException;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável que representa o armazenamento e carregamento de dados.
 */
public class Store implements Storable, Serializable {

    private String path;

    public Store(String path) {
        this.path = path;
    }
    
    public Store() {
        this.path = "fic.txt";
    
    }
    
    /**
     * Método que permite carregar um objecto em ficheiro
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
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    /**
     * Método para definir o {@link Store#path caminho} para o ficheiro
     * @param string {@link Store#path Caminho} para o ficheiro.
     */
    @Override
    public void setPath(String string) {
        this.path = string;
    }

    /**
     * Método que retorna o {@link Store#path caminho} para o ficheiro.
     * @return {@link Store#path Caminho} para o ficheiro.
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Método que permite armazenar um objecto em ficheiro.
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