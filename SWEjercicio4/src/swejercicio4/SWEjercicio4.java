/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio4;

import java.util.Calendar;

/**
 *
 * @author labctr
 */
public class SWEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Caratula car = new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS","MICHELLE PÈREZ",1, 3,"Calcular edades utilizando CALENDAR y mediante el SWITCH su cedulación.");
        car.mostrarCaratula();
    
    System.out.println();
    System.out.println();
        Persona per = new Persona();
        per.setNombre("Michelle Pérez");
        per.setCedula("1719090902");
        per.setGenero('F');
        per.setPeso(50f);
        per.setEstatura(160);
        
        
        Calendar n = Calendar.getInstance();
        n.set(1996,Calendar.NOVEMBER,19 );
        per.setNacimiento(n);
        per.mostrar();
        per.CalcularIMC();
        per.identificacion();
        per.calcularEdad();
        
        Persona per1=new Persona("Miguel",n);
        n.set(1994,Calendar.FEBRUARY,21 );
        per1.setNacimiento(n);
        per1.setCedula("0945872575");
        per1.setEstatura(170);
        per1.setGenero('M');
        per1.setPeso(52f);
        per1.mostrar();
        per1.CalcularIMC();
        per1.identificacion();
        per1.calcularEdad();
        
       Persona per2= new Persona("Daniel", 'M');
        n.set(1998,Calendar.MAY,8 );
        per2.setNacimiento(n);
        per2.setCedula("0604178541");
        per2.setEstatura(160);
        per2.setPeso(55f);
        per2.mostrar();
        per2.CalcularIMC();
        per2.identificacion();
        per2.calcularEdad();
       
        Persona per3 = new Persona("Javi",160);
        n.set(1997,Calendar.MAY, 10);
        per3.setNacimiento(n);
        per3.setCedula("1818436486");
        per3.setGenero('M');
        per3.setPeso(59f);
        per3.mostrar();
        per3.CalcularIMC();
        per3.identificacion();
        per3.calcularEdad();
        
        Persona per4= new Persona ("Dayana",70f);
        n.set(1995,Calendar.MAY, 9);
        per4.setNacimiento(n);
        per4.setCedula("2116782311");
        per4.setGenero('F');
        per4.setEstatura(149);
        per4.mostrar();
        per4.CalcularIMC();
        per4.identificacion();
        per4.calcularEdad();
          
    
}
}