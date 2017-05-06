package ObjectManagement;

import java.util.Arrays;

/**
 * P.Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class ContainerOfObjects {

    private final int DEFAULT_SIZE = 100;
    private Object objects[];
    private int numberOfObjects;

    /**
     * Metodo que permite saber qual o numero de objetos existentes
     *
     * @return numero inteiro que representa o numero de objetos existenes
     */
    private int size(Object[] o) {
        int i = 0;

        while (i < o.length && o[i] != null) {
            i++;
        }
        return i;
    }

    public ContainerOfObjects(Object[] objects) {
        this.objects = objects;
    }


    /**
     * Constutor que permite a instanciação da classe tendo por base um valor
     * por defeito (100)
     */
    public ContainerOfObjects() {
        this.objects = new Object[DEFAULT_SIZE];
        this.numberOfObjects = 0;
    }

    /**
     * Constutor que permite a instanciação da classe definindo um valor máximo
     * de elementos
     *
     * @param maxsize Numero maximo de elementos permitidos no vetor
     */
    public ContainerOfObjects(int maxsize) {
        this.objects = new Object[maxsize];
    }

    public Object[] getObjects() {
        return objects;
    }

    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public int getNumberOfObjects() {
        return numberOfObjects;
    }

    /**
     * Metodo responsavel por inserir um {@link Object objecto} na colecao de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param newObject {@link Object objecto} a inserir no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operacao
     */
    public boolean addObject(Object newObject) {
        if (this.getNumberOfObjects() < objects.length) {
            objects[numberOfObjects] = newObject;
            this.numberOfObjects++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo responsavel por remover um {@link Object objecto} do vetor de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param position indice correspondente ao elemento a elminar
     * @return valor booleano que representa o sucesso ou insucesso da operacao
     */
    public boolean removeObject(int position) {
        int p= findObject(this.objects[position]);
        if(p != -1){
            for (int i = p; i < this.objects.length -1; i++) {
                this.objects[i] = this.objects[i + 1];
            }
            this.numberOfObjects--;
            return true;
        }else {
            return false;
        }     
    }

    /**
     * Metodo responsavel por substituir um {@link Object objecto} do vetor de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param position indice correspondente ao elemento a modficar
     * @param newObject novo objecto a colocar no vetor
     * @return valor booleano que sinaliza o sucesso/insucesso da operacao
     */
    public boolean setObject(int position, Object newObject) {
        if (this.numberOfObjects > position) {
            objects[position] = newObject;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo responsavel por encontrar um {@link Object objecto} no vetor de
     * {@link ContainerOfObjects#objects objectos}
     *
     * @param obj {@link Object objecto} a encontrar
     * @return valor inteiro que representa a posicao do objeto
     */
    public int findObject(Object obj) {
      for (int i = 0; i < this.objects.length; i++) {
            if (this.numberOfObjects!=0 && this.objects[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * @param o
     * @return
     */
    public boolean hasObject(Object o) {
        return findObject(o) != -1;
        /**
         * if(findObject(o) != -1){ return true; } else { return false; }
         */
    }

    /**
     * Metodo que permite retornar todos os objetos existentes
     *
     * @return objetos existentes
     */
    public Object[] getAllObjects() {
        return objects;
    }

    @Override
    public String toString() {
        return "ContainerOfObjects{" + "DEFAULT_SIZE=" + DEFAULT_SIZE + ", objects=" + Arrays.toString(objects) + ", numberOfObjects=" + numberOfObjects + '}';
    }

    public Object printAll() {
         for(int i = 0; i< this.numberOfObjects; i++) {
           System.out.println(this.objects[i].toString());
        }
        return true;
    }

    /**
     * Metodo que permite imprimir todos os dados de
     * {@link ContainerOfObjects objectos}
     *
     * @return String com os dados de {@link ContainerOfObjects objectos}
     */
    /**
     * Metodo que permite saber se dois objetos sao iguais.
     *
     * @param obj objecto a comparar com o meu objeto
     * @return valor booleano que indica o sucesso/insucesso da operacao
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContainerOfObjects other = (ContainerOfObjects) obj;
        if (!Arrays.deepEquals(this.objects, other.objects)) {
            return false;
        }
        return this.numberOfObjects == other.numberOfObjects;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Arrays.deepHashCode(this.objects);
        hash = 73 * hash + this.numberOfObjects;
        return hash;
    }
}
