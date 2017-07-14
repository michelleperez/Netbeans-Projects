/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swtaller1;

/**
 *
 * @author michelle
 */
public class Dispositivo{
        
    private String marca;
    private String modelo;
    private Tipo tipo;
    
   

    public Dispositivo(String marca, String modelo, Tipo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;

    }

    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

 
    

    
    public void imprimirDispositivo(){
        System.out.println();
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tipo: " + getTipo());
               
      
    }
    
    
        
    
}
