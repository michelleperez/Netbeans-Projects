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
public class Pantalla {
     private int base;  //En pulgadas
     private int altura; //En pulgadas
    
     private int area;

    public Pantalla(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
     
    public int calcularArea(){
        
        return base * altura;
        
    }
    
    public void imprimirPantalla(){
        
        System.out.println("Base: " + this.getBase() + " pulgadas");
        System.out.println("Altura: " + this.getAltura() + " pulgadas");
        System.out.println("Area: " + this.calcularArea()+ " pulgadas");
    }
    
    
}
