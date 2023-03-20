package domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Persona {
    //atributos
    private int idCliente;
    private static int contadorCliente;
    private Date fechaRegistro;
    private boolean vip;
    
    //constructores
    public Cliente(){
        this.idCliente = ++Cliente.contadorCliente;
    }
    
    public Cliente(String nombre, char genero, int edad, String direccion, boolean vip ){
        this();
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
        this.vip = vip;
        Date date = new Date(System.currentTimeMillis());
        this.fechaRegistro = date;
    }
    
    //getters y setters
    public int getIdCliente(){
        return this.idCliente;
    }
    
    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro =  fechaRegistro;
    }
       
    public boolean getVip(){
        return this.vip;
    }
    
    public void setVip(boolean vip){
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente \n");
        sb.append("idCliente= ").append(idCliente);
        sb.append(", fechaRegistro= ").append(fechaRegistro);
        sb.append(", vip= ").append(vip);
        sb.append("").append(super.toString());
        return sb.toString();
    }
    
    
}
