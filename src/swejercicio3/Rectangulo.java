/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio3;

/**
 *
 * @author labctr
 */
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
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
    public int calcularPerimetro(){
        return (2*base)+ (2*altura);
    }
    public void mostrar(){
        System.out.println("");
        System.out.println("El rectangulo de tiene de base: "+base+" cm y de altura: "+altura+ " cm");
        System.out.print("Su area es de: "+calcularArea()+"cm^2");
        System.out.println(" y su perimetro es de: "+calcularPerimetro()+" cm");
      
    }
}
