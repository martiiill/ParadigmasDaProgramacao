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
import Resources.Collection.ListManagementContract;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Classe que representa um gestor de objetos.
 */
public class ListManagement implements Comparator, ListManagementContract,
        Serializable {

    private int numberOfObjects;
    private Object[] objects;

    /**
     * Método que permite instanciar uma lista tendo em conta um tamanho definido.
     * @param size 
     */
    public ListManagement(int size) {
        this.objects = new Object[size];
    }

    /**
     * Método construtor que permite instanciar uma lista tendo por base um
     * conjunto de objetos
     * @param objects
     */
    public ListManagement(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Método construtor que permite instanciar uma lista tendo por base o seu
     * tamanho por defeito.
     */
    public ListManagement() {
        this.objects = new Object[DEFAULT_SIZE];
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    public void setNumberOfObjects(int numberOfObjects) {
        this.numberOfObjects = numberOfObjects;
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    /**
     * Método responsável por encontrar um objeto no vetor de objetos.
     *
     * @param o objeto a procurar no vetor
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
     * Método responsável por inserir um objeto do vetor de objetos.
     *
     * @param o objeto a inserir no vetor
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
     * Método responsável por remover um objeto do vetor de objetos.
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
     * Método responsável por retornar um objeto existente numa determinada
     * posição do vetor de objetos.
     *
     * @param i indice do elemento a devolver
     * @return objeto do tipo Object
     */
    @Override
    public Object getObject(int i) {
        return objects[i];
    }

    @Override
    public String toString() {
        return "ListManagement{" + "numberOfObjects=" + numberOfObjects +
                ", objects=" + Arrays.toString(objects) + '}';
    }
    
    

    /**
     * Método que permite comaparar dois objetos, dizendo se são iguais ou
     * diferentes.
     *
     * @param o Objecto a comparar.
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
     *
     * @param o
     * @return
     */
    public boolean hasObject(Object o) {
        for (int i = 0; i < this.numberOfObjects; i++) {
            return this.objects[i].equals(o);
        }
        return false;
    }

}
