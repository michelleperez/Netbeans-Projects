/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author michelle
 */
public class SwDeber4 {

    
    //para leer numeros enteros,float double,etc
   private  static Scanner sc= new Scanner (System.in);
   private  static InputStreamReader isr =  new InputStreamReader(System.in);
   
   // leer atributos de tipo string
   private  static BufferedReader br = new BufferedReader(isr);
   
    public static void main(String[] args) {
        try {
             Caratula caratula = new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS","MICHELLE PÈREZ",1, 4,"Implementación del Scanner y de clases asociadas ");
           caratula.mostrarCaratula();
           
           //Instanciar objeto CHOFER
           Chofer chofer = new Chofer();
           System.out.println("Ingrese los datos del chofer");
           
           System.out.print("Nombre:");
           String str = br.readLine();
           chofer.setNombre(str);
           
           System.out.println("Cédula: ");
           str = br.readLine();
           chofer.setCedula(str);
           
           System.out.println("Tipo de licencia: ");
           System.out.println("1.Profesional B ");
           System.out.println("2.Profesional C ");
           System.out.println("3.Profesional D ");
           System.out.println("4.Profesional D1");           
           byte opcion = sc.nextByte();
           
           switch(opcion){
                case 1:                    
                    chofer.setLicencia(Licencia.ProfesionalB);
                    break;
                case 2:
                    chofer.setLicencia(Licencia.ProfesionalC);
                    break;
               case 3:
                    chofer.setLicencia(Licencia.ProfesionalD);
                    break;
                case 4:
                    chofer.setLicencia(Licencia.ProfesionalD1);
                    break;    
            }
           
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
           
             //Instanciar objeto ciudad
            Ciudad ciu = new Ciudad();
            System.out.println("Ingrese los datos de la ciudad de destino:");

            System.out.print("Nombre: ");
            str = br.readLine();
            ciu.setNombre(str);
            
            System.out.print("Descripción: ");
            str = br.readLine();
            ciu.setDescripcion(str);

            System.out.println("Tipo de Turismo:  ");
            System.out.println("1.Cultural");
            System.out.println("2.Diversion ");
            System.out.println("3.Aventura ");
            System.out.println("4.Religioso ");
             System.out.println("5.NA ");

            opcion = sc.nextByte();
            switch(opcion){
                    case 1:                    
                        ciu.setTipoTurismo(Turismo.Cultural);
                        break;
                    case 2:
                        ciu.setTipoTurismo(Turismo.Diversion);
                        break;
                   case 3:
                        ciu.setTipoTurismo(Turismo.Aventura);
                        break;
                    case 4:
                        ciu.setTipoTurismo(Turismo.Religioso);
                        break;  
                     case 5:
                        ciu.setTipoTurismo(Turismo.NA);
                        break;    
                }
            System.out.println("Tipo de Clima:  ");
            System.out.println("1.Cálido");
            System.out.println("2.Frío ");
            System.out.println("3.Templado ");
            System.out.println("4.LLuvioso");
            System.out.println("5.Húmedo");
         
            opcion = sc.nextByte();
            switch(opcion){
                    case 1:                    
                        ciu.setClima(Clima.Cálido);
                        break;
                    case 2:
                        ciu.setClima(Clima.Frío);
                        break;
                   case 3:
                         ciu.setClima(Clima.Templado);
                        break;
                    case 4:
                        ciu.setClima(Clima.Lluviosos);   
                        break;  
                     case 5:
                          ciu.setClima(Clima.Húmedo);
                        break;    
                }
            
        
            
            //Instanciar viaje
            
            Viaje vj = new Viaje();
            vj.setBus(bus);
            vj.setChofer(chofer);
                   
            vj.setCiudadDestino(ciu);            
            System.out.print("Ingrese nombre ciudad origen: ");
            str = br.readLine();
            vj.setCiudadOrigen(str);
               
            
            System.out.println("Fecha( dd/MM/yyyy)");
            str=br.readLine();
            SimpleDateFormat sdf_fecha= new SimpleDateFormat("dd/MM/yyyy");
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(sdf_fecha.parse(str));
            vj.setFecha(fecha);
            
            System.out.println("Hora( HH:mm):");
            str=br.readLine();
            SimpleDateFormat sdf_hora= new SimpleDateFormat("HH:mm");
            Calendar hora = Calendar.getInstance();
            fecha.setTime(sdf_hora.parse(str));
            vj.setHora(hora);
            
          
            System.out.println("Precio: ");
            double pr = sc.nextDouble();
            vj.setPrecio((float) pr);
            System.out.println("Kilometraje: ");
            short km = sc.nextShort();
            vj.setKilometros(km);
            
           vj.mostrarViaje();
            
        } catch (Exception e) {
        }
        
        
    }
    
}
