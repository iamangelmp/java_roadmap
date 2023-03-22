/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author Alexis
 */
public class testConversionObj {
    public static void main(String[] args) {
        Empleado empleado1;
        
        empleado1 = new Escritor("Juan", 'H', true, Tipo_Escritura.CLASICO);
        
        //System.out.println(empleado1.obtenerDetaller());
        //System.out.println("empleado1 = " + empleado1);
        
        System.out.println(((Escritor)empleado1).getTipoEscritura());
    }
    
}
