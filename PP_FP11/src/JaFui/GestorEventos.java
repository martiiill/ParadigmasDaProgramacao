/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JaFui;

/**
 *
 * @author Ana Martins
 */
public interface GestorEventos {
    /**
     * Metodo que permite adicionar um novo evento
     * @param evento evento a adicionar
     * @return valor booleano
     */
    boolean adicionarEvento(Evento evento);

    /**
     * Metodo que permite remover um evento
     * @param evento evento que quer remover
     * @return valor booleano
     */
    boolean removerEvento(Evento evento);

    /**
     * Metodo que permite obter todos os eventos 
     * @return 
     */
    Evento[] getAll();

    /**
     * Metodo que saber se um evento existe
     * @param evento evento que quer encontrar
     * @return valor booleano
     */
    boolean hasEvent(Evento evento);

}
