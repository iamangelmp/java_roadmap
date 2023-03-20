package mx.com.pc_store.domain;

public class DispositivoEntrada {
    //atributos
    protected String tipoEntrada;
    protected String marca;
    
    //constructores
    public DispositivoEntrada(String tipoEntrada, String marca ){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    //metodos getters y setters
    
    public String getTipoEntrada(){
        return this.tipoEntrada;
    }
    
    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    @Override
    public String toString(){
        return (", Tipo Entrada: " + this.tipoEntrada + ", Marca: "+ this.marca);
    }
    
    
}
