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
public class SwTaller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciar telefono
        Dispositivo telefono_1 = new Dispositivo("Samsung", "Galaxy", Tipo.TELEFONO);
        Pantalla pantalla_1 = new Pantalla(2,3);
        
        //Instanciar tv
        Dispositivo tv_1 = new Dispositivo ("LG", "Smart", Tipo.TV);
        Pantalla pantalla_2 = new Pantalla(7,6);
        
        //Instancia  Computadora
        Dispositivo computadora_1 = new Dispositivo("Lenovo", "Gamer", Tipo.COMPUTADOR);
        Pantalla pantalla_3 = new Pantalla(7,4);
        
        //Instanciar Tablet
        Dispositivo tablet_1 = new Dispositivo("Apple", "Ipad", Tipo.TABLET);
        Pantalla pantalla_4 = new Pantalla(3,4);
        
        System.out.println("-------------------------------------------");
        System.out.println("        UNIVERSIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("                      ESPE-L   ");
        System.out.println("Taller #1                     27/Abril/2017");
        System.out.println("-------------------------------------------");
        System.out.println();
        telefono_1.imprimirDispositivo();
        pantalla_1.imprimirPantalla();
        tv_1.imprimirDispositivo();
        pantalla_2.imprimirPantalla();
        computadora_1.imprimirDispositivo();
        pantalla_3.imprimirPantalla();
        tablet_1.imprimirDispositivo();
        pantalla_4.imprimirPantalla();
         System.out.println();
        System.out.println();
        
        System.out.println("Autores: Davalos Mauricio, Perez Michelle");



        
        
        
    }
    
}
