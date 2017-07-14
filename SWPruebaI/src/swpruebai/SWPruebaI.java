/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swpruebai;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;
import util.perez.*;

/**
 *
 * @author michelle
 */
public class SWPruebaI {

     private static util utl = new util();
   
    
    public static void main(String[] args) {
        try {
            Calendar date = Calendar.getInstance();
            date.set(2017,Calendar.JULY,07);
            Unit unidad = Unit.II;
            utl.setDate(date);
            utl.setUnit(unidad);
            utl.setDescription("Un celular posee una memoria interna con una capacidad definida, cada vez que una aplicación es instalada la capacidad de memoria disminuye.\n");
            utl.setTitle("Exámen unidad 2");
            utl.setNumber((byte)1);
            utl.PrintHeader();
            //Instanciar celular
            Celular cel = new Celular();
            utl.Println("INGRESAR DATOS DEL CELULALR");
            TipoMarca tipom = (TipoMarca)utl.ReadEnum("Marca","Elegir opción: ",TipoMarca.values());
            cel.setMarca(tipom);
            cel.setModelo(utl.ReadString("Modelo: "));
            TipoSO tipso = (TipoSO)utl.ReadEnum("Sistema Operativo","Elegir opción: ",TipoSO.values());
            cel.setSistemaoperativo(tipso);
            
            //Instanciar memoria
            Memoria m = new Memoria();
            m.setMarca(utl.ReadString("Marca de memoria"));
            m.setCapacidad(utl.ReadByte("Capacidad en GB: ", true));
            m.IniciarArray();
            //Instanciar aplicaciones
            byte op = 0;
            utl.Println("INGRESAR APLICACIONES");
            Aplicacion ap = new Aplicacion();
            String entradaTeclado = "";
            Scanner entradaEscaner = new Scanner (System.in); 
            byte result;
            System.out.println("Cuantas aplicaciones desea agregar: ");
            entradaTeclado = entradaEscaner.nextLine (); 
            result = Byte.parseByte(entradaTeclado);
       
            do{
                ap.setNombre(utl.ReadString("Nombre: "));
               int a = utl.ReadInt("Ingrese el peso de la aplicacion en MB: ");
                TipoCategoria tipc = (TipoCategoria)utl.ReadEnum("TipoCategoria","Elegir opción: ",TipoCategoria.values());
                ap.setCategoria(tipc);
                m.CalcularUsoMemoria(a);
                op++;
            }while(op != result);
            
         
            utl.PrintFooter();
            
        } catch (Exception e) {
        }
    }
    
}
