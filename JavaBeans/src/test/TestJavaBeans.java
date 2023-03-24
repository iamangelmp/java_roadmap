/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author Alexis
 */
public class TestJavaBeans{
    public static void main(String[] args) {
        System.out.println("hello");
        Persona persona1 = new Persona();
        persona1.setNombre("Angel");
        persona1.setApellido("Marquez");
        
        System.out.println(persona1.toString());
    }
}
