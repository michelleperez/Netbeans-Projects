/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author michelle
 */
public class Anfibios extends Animales {

    public Anfibios(String nombre, String genero, int tamaño, int edad) {
        super(nombre, genero, tamaño, edad);
    }
    

    @Override
    protected void moverse() {
        System.out.println("El anfibio "+nombre+" camina y nada");
    }

    @Override
    protected void tipoReproduccion() {
        System.out.println("Su tipo de reproduccion es: ovíparos ");
    }

    @Override
    protected void TipoRespiracion() {
     System.out.println("Respiran por pulmones y a taves de la piel");   
    }

    @Override
    protected void imprimir() {
        System.out.println("Su edad es : "+edad);
       System.out.println("Su tamaño es : "+tamaño);
        System.out.println("Su genero es : "+genero);
       
    }
    
}
