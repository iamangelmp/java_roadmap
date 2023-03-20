package com.gm.mundopc.domain;

public class Computadora {

    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;

    
    public Computadora(String nombre, Monitor monitor, Raton raton, Teclado teclado){
        this.nombre = nombre;
        this.monitor = monitor;
        this.raton = raton;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }
  
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora \n");
        sb.append("idComputadora: ").append(idComputadora);
        sb.append(", nombre: ").append(nombre);
        sb.append("\t").append(monitor.toString());
        sb.append("\t").append(raton.toString());
        sb.append("\t").append(teclado.toString());
        return sb.toString();
    }

}
