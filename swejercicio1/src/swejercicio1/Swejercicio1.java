/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio1;

/**
 *
 * @author labctr
 */
public class Swejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--------------------Universidad de las Fuerzas Armadas------------------");
        System.out.println("                           Autor: Michelle Pérez             ");
        System.out.println("                                Unidad I                   ");
        System.out.println("Ejercicio #1                                             21/04/2017  ");
        System.out.println("Descripción: Implementacion tipos de datos primitivos y referenciados");
        System.out.println();
        System.out.println("                   TIPOS PRIMITIVOS");
         System.out.println("----------------------------------------------------------------------");
        System.out.println("--Enteros:");
         System.out.println("");
        byte edad= 50;
        short salario=32000;
        int poblacion=16000000;
        long millonesface=125000000000000L;
        System.out.println("Byte: "+edad+" es  mi edad");
        System.out.println("Short: "+salario+" es el  salario");
        System.out.println("Int: "+poblacion+" població actual en el Ecuador");
        System.out.println("Long: "+millonesface+" representa los millones de de facebook");
        System.out.println();
        float area=15.28f;
        double deudas;
        deudas = 338970.78;
        System.out.println("Float: "+area+" representa el area de un cuadrado");
        System.out.println("Double: "+deudas+" representa mis deudas");
         System.out.println("");
        System.out.println("--Cáracter:");
         System.out.println("");
        char curso='Z';
        System.out.println("Char: "+curso+" representa mi curso");
        System.out.println("Logico:");
        boolean puntual_clase=false;
        System.out.println("Boolean: "+puntual_clase+" representa llego puntual a programación");        
        System.out.println();
        System.out.println("                  TIPOS REFERENCIADOS:");
         System.out.println("----------------------------------------------------------------------");
        Byte Edad=edad;
        Short Salario=salario;
        Integer Poblacion=poblacion;
        Long Millones_Face=millonesface;
        
        System.out.println("Byte: "+Edad.toString()+" representa la edad");
        System.out.println("Short: "+Salario.toString()+" representa salario");
        System.out.println("Integer: "+Poblacion.toString()+" representa la poblacion del Ecuador");
        System.out.println("Long: "+Millones_Face.toString()+" representa los millones de que tiene Facebook");
        
        Float Area=area;
        Double Deudas=deudas;
        Character Curso=curso;
        Boolean Puntual_a_clase=puntual_clase;
        
        System.out.println("Float: "+Area.toString()+" representa el area de un cuadrado");
        System.out.println("Double: "+Deudas.toString()+" representa mis deudas");
        System.out.println("Character: "+Curso.toString()+" representa mi curso");
        System.out.println("Boolean: "+Puntual_a_clase.toString()+" representa si llego puntual a programación");
        
        int numero=43;
        System.out.println("int: "+numero+" ->BIN: "+Integer.toBinaryString(numero));
        
        System.out.println("int: "+numero+" ->HEX: "+Integer.toHexString(numero));
        
        System.out.println("int: "+numero+" ->OCTAL: "+Integer.toOctalString(numero));
        
        
    }
 
}
