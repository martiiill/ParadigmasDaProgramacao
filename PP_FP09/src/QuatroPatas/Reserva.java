
package QuatroPatas;

/**
 *
 * @author anaal
 */
public class Reserva {
    private int id;
    private Data data;
    private Animal animal;
    private String estado;
    private int numberOfReservas;

    public Reserva(int id, Data data, Animal animal) {
        this.id = id;
        this.data = data;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumberOfReservas() {
        return numberOfReservas;
    }

    public void setNumberOfReservas(int numberOfReservas) {
        this.numberOfReservas = numberOfReservas;
    }

    
    
    @Override
    public String toString() {
        return "Reserva{" + "animal=" + animal +  ", numberOfReservas=" + numberOfReservas + '}';
    }

    

}
