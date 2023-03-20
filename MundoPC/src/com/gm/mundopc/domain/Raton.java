package com.gm.mundopc.domain;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorTeclado;
    
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorTeclado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Raton \t\t{");
        sb.append("idRaton : ").append(idRaton);
        sb.append("").append(super.toString());
        return sb.toString();
    }   
    
}
