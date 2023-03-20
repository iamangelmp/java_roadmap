package domain;

public class Empleado extends Persona{
    //atributos
    private int idEmpleado;
    private static int contadorEmpleado;
    private double salario;
    
    //constructores
    public Empleado(){
        this.idEmpleado = ++ Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double salario) {
        this();
        this.nombre = nombre;
        this.salario = salario;
    }
    
    //getters y setters

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public static int getContadorEmpleado() {
        return Empleado.contadorEmpleado;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado \n");
        sb.append("idEmpleado = ").append(idEmpleado);
        sb.append(", salario = ").append(salario);
        sb.append("").append(super.toString()); 
        return sb.toString();
    }
    
}
