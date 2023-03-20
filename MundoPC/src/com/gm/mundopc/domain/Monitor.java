package com.gm.mundopc.domain;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;
    
    public Monitor(){
        this.idMonitor = ++ Monitor.contadorMonitor;
    }
    
    public Monitor(String marca,double tamanio ){
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public double getTamanio(){
        return this.tamanio;
    }
    
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Monitor\t{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamanio=").append(tamanio);
        sb.append('}');
        return sb.toString();
    }
     
}
