/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch2.lab;

public class EmptyFieldExecption extends Exception {

    /**
     * Creates a new instance of <code>EmptyFieldExecption</code> without detail
     * message.
     */
    public EmptyFieldExecption() {
    }

    /**
     * Constructs an instance of <code>EmptyFieldExecption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmptyFieldExecption(String msg) {
        super(msg);
    }
}
