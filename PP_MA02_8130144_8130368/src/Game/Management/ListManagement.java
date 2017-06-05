/**
 * Nome: Joana Machado Baptista
 * Número: 8130144
 * Turma: 3
 *
 * Nome: Ana Alice Gonçalves Martins
 * Número: 8130368
 * Turma: 3
 */
package Game.Management;

import Game.Comparator.Comparator;
import Game.Store;
import Resources.Collection.ListManagementContract;
import Resources.Exceptions.FileHandlingException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Classe que representa um gestor de objetos.
 */
public class ListManagement implements Comparator, ListManagementContract,
        Serializable {

    /**
     * {@link ListManagement#numberOfObjects
     * Numero de bjectos} do {@link ListManagement gestor} de objetos.
     */
    private int numberOfObjects;
    /**
     * {@link ListManagement#objects Objetos} do {@link ListManagement gestor}.
     */
    private Object[] objects;

    /**
     * Método que permite instanciar uma lista.
     * @param numberOfObjects {@link ListManagement#numberOfObjects
     * numero de objectos} do {@link ListManagement gestor}.
     * @param objects {@link ListManagement#objects Objetos} do 
     * {@link ListManagement gestor}.
     */
    public ListManagement(int numberOfObjects, Object[] objects) {
        this.numberOfObjects = numberOfObjects;
        this.objects = objects;
    }
    
    /**
     * Método que permite instanciar um {@link ListManagement gestor}
     * tendo em conta um tamanho.
     * @param size Tamanho que pretende dar. 
     */
    public ListManagement(int size) {
        this.objects = new Object[size];
    }

    /**
     * Método construtor que permite instanciar um {@link ListManagement gestor}
     * tendo por base um conjunto de objetos.
     * @param objects{@link ListManagement#objects Objetos} do 
     * {@link ListManagement gestor}.
     */
    public ListManagement(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Método construtor que permite instanciar um {@link ListManagement gestor}
     * tendo por base o seu tamanho por defeito.
     */
    public ListManagement() {
        this.objects = new Object[DEFAULT_SIZE];
    }
    
       /**
     * Método que permite gravar num ficheiro um 
     * {@link ListManagement gestor de objetos}.
     * @param s O {@link ListManagement gestor de objetos} a gravar.
     * @param st Ficheiro onde quer guardar.
     * @throws FileHandlingException Excecao lançada caso ocorra algum erro.
     */
    public void save(ListManagement s, String st) throws FileHandlingException{
        Store ss = new Store();
        ss.saveToFile(s, st);
    }

    /**
     * Método responsável por retornar a
     * {@link ListManagement#numberOfObjects número de objetos} 
     * no {@link ListManagement gestor de objetos}.
     * imagem da animação}
     * @return {@link ListManagement#numberOfObjects Número de objetos}.
     */
    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Método responsável por definir o 
     * {@link ListManagement#numberOfObjects número de objetos} no 
     * {@link ListManagement gestor de objetos}.
     * @param numberOfObjects {@link ListManagement#numberOfObjects 
     * Número de objetos}.
     */
    public void setNumberOfObjects(int numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
    }

    /**
     * Método responsável por retornar os
     * {@link ListManagement#objects objetos} 
     * no {@link ListManagement gestor de objetos}.
     * imagem da animação}
     * @return {@link ListManagement#objects Objetos}.
     */
    public Object[] getObjects() {
        return objects;
    }

    /**
     * Método responsável por definir o 
     * {@link ListManagement#objects objetos} no 
     * {@link ListManagement gestor de objetos}.
     * @param objects {@link ListManagement#objects Objetos}.
     */
    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Método responsável por encontrar um {@link ListManagement#objects objeto}
     * no {@link ListManagement gestor de objetos}.
     *
     * @param o objeto a procurar no {@link ListManagement gestor de objetos}.
     * @return o indice do objeto no vetor. No caso do elemento não existir,
     * deverá ser retornado o valor -1
     */
    @Override
    public int findObject(Object o) {
        for (int i = 0; i < this.numberOfObjects; i++) {
            if (this.numberOfObjects != 0 && this.objects[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método responsável por inserir um {@link ListManagement#objects objeto} 
     * do {@link ListManagement gestor de objetos}.
     *
     * @param o objeto a inserir no {@link ListManagement gestor de objetos}.
     * @return Valor que sinaliza o sucesso/insucesso da operação
     */
    @Override
    public boolean addObject(Object o) {
        if (numberOfObjects < this.objects.length) {
            this.objects[numberOfObjects] = o;
            numberOfObjects++;
            return true;
        }
        return false;
    }

    /**
     * Método responsável por remover um {@link ListManagement#objects objeto} 
     * do {@link ListManagement gestor de objetos}.
     *
     * @param i indice correspondente ao elemento a eliminar
     * @return o objeto eliminado
     */
    @Override
    public Object removeObject(int i) {
        int k = 0;
        Object objRemoved = null;
        Object[] tempList = new Object[numberOfObjects - 1];
        for (int z = 0; z < numberOfObjects; ++z) {
            if (z != i) {
                tempList[k] = objects[z];
                k++;
            } else {
                objRemoved = this.objects[z];
            }
        }
        this.numberOfObjects--;
        this.objects = tempList;
        return objRemoved;
    }

    /**
     * Método responsável por retornar um {@link ListManagement#objects objeto}
     * existente numa determinada posição do {@link ListManagement
     * gestor de objetos}.
     *
     * @param i indice do elemento a devolver
     * @return objeto do tipo Object
     */
    @Override
    public Object getObject(int i) {
        return objects[i];
    }

    /**
     * Método que permite obter uma representação textual de um 
     * {@link ListManagement gestor de objetos}.
     * @return Representação textual de um {@link ListManagement 
     * gestor de objetos}.
     */
    @Override
    public String toString() {
        return "ListManagement{" + "numberOfObjects=" + numberOfObjects +
                ", objects=" + Arrays.toString(objects) + '}';
    }  

    /**
     * Método que permite comaparar dois {@link ListManagement#objects objetos}, 
     * dizendo se são iguais ou diferentes.
     *
     * @param o  {@link ListManagement#objects Objeto} a comparar.
     * @return 0 se os objectos são iguais. 1 se sao diferentes,
     */
    @Override
    public int comparator(Object o) {
        if (o instanceof ListManagement) {
            for (int i = 0; i < numberOfObjects; i++) {
                if (this.objects[i].equals(o) == true) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return -1;
    }

    /**
     * Método que suporta a ordenação por ordem alfabética da coleção.
     */
    @Override
    public void sort() {
        ListManagement aux;
        for (int i = 0; i < this.objects.length; i++) {
            if (comparator(objects[i + 1]) > 0) {
                aux = (ListManagement) objects[i];
                objects[i] = objects[i + 1];
                objects[i + 1] = aux;
            }
        }
    }

    /**
     * Método que permite saber se existe ou não um 
     * {@link ListManagement#objects objeto}.
     * @param o  {@link ListManagement#objects Objeto}.
     * @return valor que sinaliza o sucesso ou insucesso da operação.
     */
    public boolean hasObject(Object o) {
        for (int i = 0; i < this.numberOfObjects; i++) {
            return this.objects[i].equals(o);
        }
        return false;
    }
}