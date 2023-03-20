package com.gm.mundopc.domain;

public class Teclado extends DispositivoEntrada {
    private final int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Teclado \t{");
        sb.append("idTeclado : ").append(idTeclado);
        sb.append("").append(super.toString());
        return sb.toString();
    }
    
}
