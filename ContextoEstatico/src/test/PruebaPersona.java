package test;

import domain.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Angel");
        
        Persona persona2 = new Persona("Juan");
   
        Persona persona3 = new Persona("Juan");

        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
        
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona); 
    }
}
