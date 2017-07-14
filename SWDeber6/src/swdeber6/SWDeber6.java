/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber6;
import java.util.Calendar;
import util.perez.*;

/**
 *
 * @author michelle
 */

public class SWDeber6 {
private static util utl = new util();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Calendar date = Calendar.getInstance();
            date.set(2017,Calendar.JULY,05);
            Unit unidad = Unit.II;
            utl.setDate(date);
            utl.setUnit(unidad);
            utl.setDescription("Implementación con Interfaces ");
            utl.setTitle("Interfaces");
            utl.setNumber((byte)6);
             utl.PrintHeader();
            //Instanciar indefinido
            Indefinido in=new Indefinido();
             utl.Println("\nINGRESAR DATOS DE LA PERSONA CON CONTRATO INDEFINIDO");
            Calendar fecha = Calendar.getInstance();
            fecha=utl.ReadDate("Fecha de contrato: ","dd/MM/yyyy");
            in.setFecha_contrato(date);
            in.setSueldo(utl.ReadFloat("Ingrese su sueldo mensual:"));
            
            //Instanciar Ocacional
            Ocacional oc = new Ocacional();
             utl.Println("\nINGRESAR DATOS DE LA PERSONA CON CONTRATO OCACIONAL");
            oc.setSueldo(utl.ReadFloat("Ingrese su sueldo estipulado en el contrato:"));
     
            //Instanciar Por horas
            Porhoras ph = new Porhoras();
             utl.Println("\nINGRESAR DATOS DE LA PERSONA CON CONTRATO POR HORAS");
            ph.setHoras(utl.ReadShort("Ingrese el numero de horas trabajas mensualmente"));
            ph.setSueldo(utl.ReadFloat("Ingresar sueldo por hora: "));
            
           
            in.Mostrar();
            oc.Mostrar();
            ph.Mostrar();
            utl.PrintFooter();
            
        } catch (Exception e) {
            
        }
    }
    
}
