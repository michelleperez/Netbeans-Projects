/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio3;


public class Circulo {
    final float PI=(float) 3.1415;
    private float radio;
    
    public Circulo(float radio) {
        this.radio = radio;
    }

   
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float calcularArea(){
        return PI * radio*radio ;
    }
    public float calcularPerimetro(){
        return 2*PI*radio;
    }
    public void mostrar(){
        System.out.println("");
        System.out.println("El circulo  de radio: "+radio+" cm");
        System.out.print("Tiene un area de: "+calcularArea()+"cm^2");
        System.out.println(" y su perimetro es de: "+calcularPerimetro()+" cm");
      
    }    
}
