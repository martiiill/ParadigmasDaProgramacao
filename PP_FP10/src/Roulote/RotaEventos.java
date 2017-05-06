package Roulote;

import JaFui.Evento;
import ObjectManagement.ContainerOfObjects;
import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Ana Martins P.Porto @ESTG
 */
public class RotaEventos extends ContainerOfObjects implements Serializable {

    private Evento[] eventos;
    private int numEventos;

    public RotaEventos() {

    }

    public RotaEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public Evento[] getEventos() {
        return eventos;
    }

    public void setEventos(Evento[] eventos) {
        this.eventos = eventos;
    }

    public int getNumEventos() {
        return numEventos;
    }

    public void setNumEventos(int numEventos) {
        this.numEventos = numEventos;
    }

    /**
     * Método que permite comparar um evento com a lista de eventos existentes e
     * dizer se o evento já existe ou não.
     *
     * @param e evento
     * @return valor boolean
     */
    private boolean compararEvento(Evento e) {
        for (int i = 0; i < this.numEventos; i++) {
            return e.equals(this.eventos[i]); //return true;
        }
        return false;
    }

    /**
     * Metodo que permite adicionar um novo evento a lista existente
     *
     * @param e evento que quer adicionar
     * @return
     */
    @Override
    public boolean addObject(Object e) {
        int i = 0;
        if (!compararEvento((Evento) e) && this.numEventos == 0) {
            this.eventos = new Evento[this.numEventos + 1];
            this.eventos[this.numEventos] = (Evento) e;
            this.numEventos++;
            return true;
        } else {
            Evento[] eTemp = new Evento[this.numEventos + 1];
            for (int j = 0; i < this.numEventos; i++) {
                eTemp[i] = this.eventos[j];
                i++;
            }
            eTemp[i] = (Evento) e;
            this.eventos = new Evento[eTemp.length];
            this.eventos = eTemp;
            this.numEventos++;
            return true;
        }
    }

    /**
     * Metodo que permite remover um evento
     *
     * @param position position que quer remover
     * @return
     */
    @Override
    public boolean removeObject(int position) {
        return super.removeObject(position);
    }

    @Override
    public int getNumberOfObjects() {
        if (this.getNumEventos() > 0) {
            return this.getNumEventos();
        }
        return this.getNumEventos();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Arrays.deepHashCode(this.eventos);
        hash = 47 * hash + this.numEventos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RotaEventos other = (RotaEventos) obj;
        if (!Arrays.deepEquals(this.eventos, other.eventos)) {
            return false;
        }
        return this.numEventos == other.numEventos;
    }

    @Override
    public String toString() {
        return "RotaEventos{" + "eventos=" + Arrays.toString(eventos) + ", numEventos=" + numEventos + '}';
    }
}
