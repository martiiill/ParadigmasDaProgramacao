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
public class EventoNaoExisteException extends Exception {

    public EventoNaoExisteException() {
    }

    public EventoNaoExisteException(String message) {
        super(message);
    }

    public EventoNaoExisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public EventoNaoExisteException(Throwable cause) {
        super(cause);
    }

    public EventoNaoExisteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
