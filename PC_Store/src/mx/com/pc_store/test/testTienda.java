/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.pc_store.test;

import mx.com.pc_store.domain.Raton;
import mx.com.pc_store.domain.Teclado;
import mx.com.pc_store.domain.Monitor;
/**
 *
 * @author Alexis
 */
public class testTienda {
    public static void main(String[] args) {
        
        Raton raton1 = new Raton ("USB","HP");
        Raton raton2 = new Raton ("Analogo","Logitech");
        
        Monitor mon = new Monitor();
        System.out.println(mon);
        
        Teclado teclado1 = new Teclado("usb", "dell");
        
        System.out.println(raton1);
        System.out.println(raton2);
        System.out.println("teclado1 = " + teclado1);
        
        
    }
    
}
