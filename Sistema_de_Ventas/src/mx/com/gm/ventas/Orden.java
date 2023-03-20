package mx.com.gm.ventas;

import mx.com.gm.ventas.Producto;

public class Orden {
    private final int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
        
     
    public Orden(){
        this.idOrden = ++ Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("no puede acceder más registros");
        }
        
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total+= this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("ID ORDEN "+ this.idOrden);
        for (int i = 0; i < this.productos.length; i++) {
            if (productos[i] != null){
            System.out.println(productos[i]);}
        }
        
        double total = this.calcularTotal();
        System.out.println("\t\t\t TOTAL"+ "\t\t" + total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Orden{");
        sb.append("idOrden=").append(idOrden);
        sb.append(", producto=").append(productos);
        sb.append(", MAX_PRODUCTOS=").append(MAX_PRODUCTOS);
        sb.append('}');
        return sb.toString();
    }

       
}
