/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michelle
 */
public class SWDeber4 {

    //para leer numeros enteros,float double,etc
   private  static Scanner sc= new Scanner (System.in);
   private  static InputStreamReader isr =  new InputStreamReader(System.in);
   
   // leer atributos de tipo string
   private  static BufferedReader br = new BufferedReader(isr);
     
    
    public static void main(String[] args) throws ParseException {
        
       try {
           Caratula caratula = new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS","MICHELLE PÈREZ",1, 4,"Implementación del Scanner y de clases asociadas ");
           caratula.mostrarCaratula();
           
           Chofer chofer = new Chofer();
           System.out.println("Ingrese los datos del chofer");
           
           System.out.print("Nombre:");
           String str = br.readLine();
           chofer.setNombre(str);
           
           System.out.println("Cédula: ");
           str = br.readLine();
           chofer.setCedula(str);
           
           System.out.println("Tipo de licencia: ");
           System.out.println("1.B ");
           System.out.println("2.C ");
           System.out.println("3.D ");
           System.out.println("4.D1");           
           byte opcion = sc.nextByte();
           
           switch(opcion){
                case 1:                    
                    chofer.setTipo_licencia(TipoLicencia.B);
                    break;
                case 2:
                    chofer.setTipo_licencia(TipoLicencia.C);
                    break;
               case 3:
                    chofer.setTipo_licencia(TipoLicencia.D);
                    break;
                case 4:
                    chofer.setTipo_licencia(TipoLicencia.D1);
                    break;    
            }
           
           //chofer.mostrarChofer();
           
           //Instanciar objeto bus
           
            Bus bus = new Bus();
            System.out.println("Ingrese los datos del bus");
            
            System.out.print("Cooperativa:");
            str = br.readLine();
            bus.setCooperativa(str);
            
            System.out.print("Placa:");
            str = br.readLine();
            bus.setPlaca(str);
            
            System.out.print("Número:");            
            byte byt = sc.nextByte();
            bus.setNumero(byt);
            
            System.out.print("Capacidad de pasajeros: ");
            byt = sc.nextByte();
            bus.setCapacidad(byt);
            
          //  bus.mostrarBus();
            System.out.println(" ");
            
            Ciudad origen = SWDeber4.leerCiudad("Origen");
            Ciudad destino = SWDeber4.leerCiudad("Destino");
        
            Viaje viaje = new Viaje();
            viaje.setBus(bus);
            viaje.setChofer(chofer);
            viaje.setCiu_origen(origen);
            viaje.setCiu_destino(destino);
            
            System.out.println("Fecha: HH:mm dd/MM/yyyy");
            str=br.readLine();
            SimpleDateFormat sdf= new SimpleDateFormat("HH:mm dd/MM/yyyy");
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf.parse(str));
            viaje.setFecha(fecha);
            
          
            System.out.println("Precio: ");
            double pr = sc.nextDouble();
            viaje.setPrecio(pr);
            System.out.println("Kilometraje: ");
            short km = sc.nextShort();
            viaje.setKilometros(km);
            
            viaje.mostrarViaje();
            
            
            System.out.println(origen.getNombre());     
            System.out.println(origen.getClima_invierno());     
            System.out.println(origen.getClima_verano());     
            System.out.println(origen.getRecomendacion_invierno());     
            System.out.println(origen.getRecomendacion_verano()); 
           // System.out.println(origen.getRegion());
            //System.out.println(origen.getProvincia());
            
            
            System.out.println(destino.getNombre()); 
            System.out.println(destino.getClima_invierno());     
            System.out.println(destino.getClima_verano());     
            System.out.println(destino.getRecomendacion_invierno());     
            System.out.println(destino.getRecomendacion_verano()); 
            //System.out.println(destino.getRegion());
            //System.out.println(destino.getProvincia());
            
            
            
                       
            
           
       } catch (IOException ex) {
           Logger.getLogger(SWDeber4.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }
    public static Ciudad leerCiudad(String a) throws IOException{
        Ciudad resultado = new Ciudad();
        
        System.out.println("Ingrese los datos de la ciudad " + a);

        System.out.print("Nombre: ");
        String str = br.readLine();
        resultado.setNombre(str);
        
        System.out.println("Tipo de Turismo:  ");
        System.out.println("1.Cultural");
        System.out.println("2.Diversion ");
        System.out.println("3.Aventura ");
        System.out.println("4.Religioso ");
         System.out.println("5.NA ");
      
        byte opcion = sc.nextByte();
        switch(opcion){
                case 1:                    
                    resultado.setTipoDeTurismo(Titurismo.Cultural);
                    break;
                case 2:
                    resultado.setTipoDeTurismo(Titurismo.Diversion);
                    break;
               case 3:
                    resultado.setTipoDeTurismo(Titurismo.Aventura);
                    break;
                case 4:
                    resultado.setTipoDeTurismo(Titurismo.Religioso);
                    break;  
                 case 5:
                    resultado.setTipoDeTurismo(Titurismo.NA);
                    break;    
            }
        
        return resultado;
    }  
}
