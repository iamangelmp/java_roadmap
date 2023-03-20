package com.gm.mundopc.domain;

public class Orden {
    private final int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++ Orden.contadorOrdenes;
    }
    
    public void agregarComputadora(Computadora computadora){
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
        if(contadorComputadoras <10){
            this.computadoras[contadorComputadoras ++] = computadora;
                    }

    }
    
    public void mostrarOrden(){
        for (int i = 0; i < this.computadoras.length; i++) {
            if(this.computadoras[i] != null){
                this.computadoras[i].setIdComputadora(contadorComputadoras);
                System.out.println(this.computadoras[i]);
            }
        }

    }
}
