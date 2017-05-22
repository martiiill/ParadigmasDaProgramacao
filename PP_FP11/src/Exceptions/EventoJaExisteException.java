/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Ana Martins
 */
public class EventoJaExisteException extends Exception {

    public EventoJaExisteException() {
    }

    public EventoJaExisteException(String message) {
        super(message);
    }

    public EventoJaExisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EventoJaExisteException(Throwable cause) {
        super(cause);
    }

    public EventoJaExisteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
