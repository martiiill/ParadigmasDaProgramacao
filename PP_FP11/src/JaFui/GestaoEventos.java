/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaFui;

import ContainerOfObjects.ContainerOfObjects;
import Exceptions.EventoJaExisteException;
import Exceptions.EventoNaoExisteException;
import Exceptions.EventoNuloException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ana Martins
 */
public class GestaoEventos extends ContainerOfObjects implements GestorEventos {

    public GestaoEventos(Object[] objects) {
        super(objects);
    }

    public GestaoEventos() {
    }

    public GestaoEventos(int maxsize) {
        super(maxsize);
    }

    @Override
    public boolean adicionarEvento(Evento evento) {
        System.out.println("O evento" + evento.getNome() + " esta a ser inserido.");
        if (super.hasObject(evento)) {
            try {
                throw new EventoJaExisteException("Esse evento ja existe");
            } catch (EventoJaExisteException ex) {
                Logger.getLogger(GestaoEventos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            return super.addObject(evento);
        }
        return false;
    }

    @Override
    public boolean removerEvento(Evento evento) {
        if (evento == null) {
            try {
                throw new EventoNuloException("Evento nulo");
            } catch (EventoNuloException ex) {
                Logger.getLogger(GestaoEventos.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            int p = super.findObject(evento);
            if (p == -1) {
                try {
                    throw new EventoNaoExisteException("Evento nao existe");
                } catch (EventoNaoExisteException ex) {
                    Logger.getLogger(GestaoEventos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                return super.removeObject(p);
            }
        }
        return false;
    }

    @Override
    public Evento[] getAll() {
        return (Evento[]) super.getAllObjects();
    }

    @Override
    public boolean hasEvent(Evento evento) {
        return super.hasObject(evento);
    }

}
