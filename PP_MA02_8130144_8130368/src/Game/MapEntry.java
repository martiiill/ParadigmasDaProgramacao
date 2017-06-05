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

import Resources.Collection.MapEntryContract;
import Resources.Exceptions.FileHandlingException;
import java.io.Serializable;

/**
 * Classe que representa uma estrutura que associa uma chave a um valor.
 */
public class MapEntry implements MapEntryContract, Serializable{
    /**
     * A {@link MapEntry#key chave}.
     */
    private Object key;
    /**
     * O {@link MapEntry#value valor}.
     */
    private Object value;

    /**
     * Método construtor que permite instacniar uma {@link MapEntry 
     * entrada no mapa}
     * @param key A {@link MapEntry#key chave}.
     * @param value O {@link MapEntry#value valor}.
     */
    public MapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
 
    /**
     * Método construtor vazio que permite instanciar uma 
     * {@link MapEntry entrada no mapa}.
     */
     public MapEntry() {}
     
     /**
     * Método que permite gravar num ficheiro uma {@link MapEntry 
     * entrada no mapa}.
     * @param me A {@link MapEntry entrada no mapa} a gravar.
     * @throws FileHandlingException Excecao lançada caso ocorra algum erro.
     */
     public void save(MapEntry me) throws FileHandlingException{
         Store s  = new Store();
         s.saveToFile(me, "fic.txt");
     }

     /**
      * Método que permite definir uma {@link MapEntry#key chave}.
      * @param o Objeto que representa a {@link MapEntry#key chave}.
      */
    @Override
    public void setKey(Object o) {
        this.key = (String) o;
    }

    /**
     * Método que permite definir o valor associado a uma 
     * {@link MapEntry#key chave}.
     * @param o Objeto que representa o {@link MapEntry#value valor}.
     */
    @Override
    public void setValue(Object o) {
       this.value = (Animation) o;
    }

    /**
     * Método que permite retornar o valor da {@link MapEntry#key chave}.
     * @return A {@link MapEntry#key chave}.
     */
    @Override
    public Object getKey() {
        return key;
    }

    /**
     * Método que permite retornar o objeto associado à 
     * {@link MapEntry#key chave}.
     * @return O objeto associado à {@link MapEntry#key chave}.
     */
    @Override
    public Object getValue() {
        return value;
    }

    /**
     * Método que permite obter a representação textual da estrutura.
     * @return representação textual da estrutura.
     */
    @Override
    public String toString() {
        return "MapEntry: " + "key=" + key + ", value=" + value + '}';
    }
    
    /**
     * Método que permite mostrar a representação textual da estrutura.
     */
    public void MapEntryDescription(){
        System.out.println(toString());
    }
}