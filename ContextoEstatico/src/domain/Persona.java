package domain;

public class Persona {

    //atributos
    private int id;
    private String nombre;
    private static int contadorPersona;
    
    
    //constructor
    public Persona(String nombre){
        this.nombre = nombre;
        
        //definicion de los atributos estaticos
        Persona.contadorPersona++;
        
        //asignación al id
        this.id= Persona.contadorPersona;
    }
    
    
    //encapsulamiento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getContadorPersona() {
        return contadorPersona;
    }

    public static void setContadorPersona(int aContadorPersona) {
        contadorPersona = aContadorPersona;
    }

    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + '}';
    }

      
}
