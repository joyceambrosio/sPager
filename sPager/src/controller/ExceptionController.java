/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author joyce
 */
public class ExceptionController extends Exception {

    public ExceptionController() {
    }

    public ExceptionController(String message) {
        super(message);
    }

    public ExceptionController(String message, Throwable cause) {
        super(message, cause);
    }

}
