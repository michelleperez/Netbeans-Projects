/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.ArrayList;

/**
 *
 * @author michelle
 */
public class Examen {

  
       public static void main(String[] args) {
        
        ArrayList<Animales> animales = new ArrayList<Animales>();         
Animales Ballena = new Mamiferos("Ballena","Masculino",1500,15);
         Animales Humano = new Mamiferos("Daniel","Masculino",160,19);
         
         Animales Pinguino= new Aves("Pinguino","Femenino",60,20);
         Animales Pinzón= new Aves("Pinzón","Masculino",10,5);
         Animales Tiburon = new Peces("Tiburon","Femenino",200,13);
         Animales Payaso = new Peces(" Pez Payaso "," Masculino ",5,3);
         Animales Rana = new Anfibios(" Rana "," Masculino ",30,12);
         Animales Salamandra = new Anfibios(" Salamandra "," Femenino ",30,3);
         animales.add(Ballena);
         animales.add(Humano);
         animales.add(Pinguino);
         animales.add(Pinzón);
         animales.add(Tiburon);
         animales.add(Payaso);
         animales.add(Rana);
         animales.add(Salamandra);
        for(Animales animal:animales){
            animal.moverse();
            animal.TipoRespiracion();
            animal.tipoReproduccion();
            animal.imprimir();
        } 
      
                
    }
       
    
}
