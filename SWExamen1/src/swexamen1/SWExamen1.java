/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swexamen1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author michelle
 */
public class SWExamen1 {

   //para leer numeros enteros,float double,etc
   private  static Scanner sc= new Scanner (System.in);
   private  static InputStreamReader isr =  new InputStreamReader(System.in);
   
   // leer atributos de tipo string
    private  static BufferedReader br = new BufferedReader(isr);
     
    public static void main(String[] args) {
        try {
            // Instanciar clase caratula.
            Caratula car= new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE-L","Michelle Pérez",1,1,"Exámen Unidad 1");
             car.mostrarCaratula();
            //Inicializar variables de tipo string, double y byte para la lectura de datos por teclado.
            String str;
            double dou = 0;
            byte op = 0;
            
            //Instanciar clase Examen.
            Examen exa = new Examen();
            //Obtner datos del paciente.
            System.out.println();
            System.out.println("Ingreso datos paciente:");
            System.out.println("Nombre:");
            str = br.readLine();
            exa.setNombre(str);
            
            System.out.println("Fecha de nacimiento( dd/MM/yyyy):");
            str=br.readLine();
            SimpleDateFormat sdf_fecha= new SimpleDateFormat("dd/MM/yyyy");
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf_fecha.parse(str));
            exa.setFecha_nacimiento(fecha);
            String x;
              do{
            
           int  opc = 0; 
           
               
                System.out.println("\n Ingrese el tipo de de resultado de química sanguínea:");
                System.out.println("1. Glucosa");
                System.out.println("2. Colesterol");
                System.out.println("3. Triglicéridos");
                System.out.println("4.Creatinina");
                opc = sc.nextByte();   
                System.out.print("\nIngrese el resultado numérico de su exámen: ");
                dou = sc.nextDouble();
                exa.ResultadoQumica(dou, opc);
                System.out.println("Desea realizar un nuevo registro s/n");
                x = br.readLine();
                              
            }while(x=="s");
            exa.MostrarValoresExamen();
             exa.MostrarRegistros();
            
            
        } catch (Exception e) {
        }
  
        

    }
    
}
