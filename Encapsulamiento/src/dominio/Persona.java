package dominio;

public class Persona {
    //atributos
    private String nombre;
    private double sueldo;
    private boolean status;
    
    //constructor
    public Persona(String nombre, double sueldo, boolean status){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.status = status;
    }
    
    //getters y setters
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isStatus (){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }

    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", status=" + status + '}';
    }
    
    
}
