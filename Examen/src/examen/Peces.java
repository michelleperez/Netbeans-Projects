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
public class Peces extends Animales{

    public Peces(String nombre, String genero, int tamaño, int edad) {
        super(nombre, genero, tamaño, edad);
    }

    @Override
    protected void moverse() {
        System.out.println("El pez "+nombre+" nada");
    }

    @Override
    protected void tipoReproduccion() {
        System.out.println("Su tipo de reproduccion es: ovíparos ");
    }

    @Override
    protected void TipoRespiracion() {
        System.out.println("Respiran por branqueas ");
    }

    @Override
    protected void imprimir() {
         System.out.println("Su edad es : "+edad);
       System.out.println("Su tamaño es : "+tamaño);
        System.out.println("Su genero es : "+genero);
    }
    
}
