package test;

import domain.Empleado;
import domain.Cliente;

public class PruebaHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan",200);
        System.out.println("empleado1 = " + empleado1);

        Cliente cliente1 = new Cliente("Alexis", 'M', 23, "felipe Angeles 12", true);
        System.out.println(cliente1);
        
        Cliente cliente2 = new Cliente("Angel", 'M', 24, "Tepalcates 12", true);
        System.out.println(cliente2);
          
    }
    
}
