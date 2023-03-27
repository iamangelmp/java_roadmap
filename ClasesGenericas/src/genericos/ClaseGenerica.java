/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos;

/**
 *
 * @author Ebit PC 2
 */
public class ClaseGenerica<T> {

    private T obj;

    public ClaseGenerica(T obj) {
        this.obj = obj;
    }

    public void getTipo() {
        System.out.println("El tipo de T es:  " + obj.getClass().getSimpleName());
    }

}
