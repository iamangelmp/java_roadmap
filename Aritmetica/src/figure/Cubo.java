/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figure;

/**
 *
 * @author Alexis
 */
public class Cubo {
    int alto;
    int largo;
    int profundo;
    
    public Cubo(){
        System.out.println("from class");
    }
    
    public Cubo (int alto, int largo, int profundo){
    this.alto = alto;
    this.largo = largo;
    this.profundo = profundo;
    }
    
    public int volumenCubo(){
        var resultado = this.alto * this.largo * this.profundo;
        return resultado;
    }
    
    public void volumenCuboT(int alto, int largo, int profundo){
        System.out.println("el volumen es: "+ (alto * largo * profundo));
    }
}
