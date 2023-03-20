/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Alexis
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    static{
        System.out.println("inicializador estatico");
        ++Persona.contadorPersona;
    }
    
    {
        System.out.println("inicializador dinamico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("ejecución del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
}
