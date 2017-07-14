/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio2;

/**
 *
 * @author labctr
 */
public class Swejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de un nuevo objeto;
        caratula Caratula = new caratula();
        Caratula.setTitulo("UNIVERSIDAD DE LAS FUERZAS ARMADAS");
        Caratula.setMateria("Programación II");
        
        String nombre = "Michelle Pérez";
        Caratula.setAutor(nombre);
        Caratula.setFecha("24/Abril/2017");
        Caratula.setN_ejercicio((byte)2);
        Caratula.setUnidad(unidad.Unidad_1);
        Caratula.setDescripcion("Implementación de clases, metodos,atributos y constructor.");
        Caratula.mostrar();
    }
   
}
