package com.example.test;

import static com.example.domain.Persona.*;
//import com.example.domain.Persona;
public class TestMain {
    public static void main(String[] args) {
        saludar("contexto estatico");
        
        //Persona.saludar("desde referencia");
        
        final int pi = 10;
        System.out.println("pi = " + pi);
        
        
        //pi = 110;
        System.out.println("pi = " + pi);
    }
}
