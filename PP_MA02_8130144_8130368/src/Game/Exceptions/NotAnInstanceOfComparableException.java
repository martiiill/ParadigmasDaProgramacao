/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game.Exceptions;

/**
 *
 * @author Ana Martins
 */
public class NotAnInstanceOfComparableException extends Exception {
    public NotAnInstanceOfComparableException() {
    }

    public NotAnInstanceOfComparableException(String message) {
        super(message);
    }

    public NotAnInstanceOfComparableException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAnInstanceOfComparableException(Throwable cause) {
        super(cause);
    }

    public NotAnInstanceOfComparableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
