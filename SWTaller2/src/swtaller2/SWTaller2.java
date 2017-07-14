package swtaller2;
import java.io.IOException;
import util.perez.*;
import java.util.Calendar;
public class SWTaller2 {

         private static util utl = new util();
    public static void main(String[] args) throws IOException {
        try {
            // Instanciar objetos
   
        Persona per = new Persona();
        Transaccion tra = new Transaccion();
        Cuenta c = new Cuenta();
        
        
        Calendar date = Calendar.getInstance();
            date.set(2017,Calendar.JUNE,23);
            Unit unidad = Unit.II;
            utl.setDate(date);
            utl.setUnit(unidad);
            utl.setDescription("Implementación");
            utl.setTitle("Clases relacionadas Agregación/Composición");
            utl.setNumber((byte)2);
            utl.PrintHeader();
            
        //Ingresar datos titular / persona
        String str;
        utl.Println("Ingresar datos del titular: ");
        str=utl.ReadString("Nombre:");
        per.setNombre(str);
        str=utl.ReadString("Cédula: ");
        per.setCedula(str);
        str=utl.ReadString("Dirección: ");
        per.setDireccion(str);
        str=utl.ReadString("Teléfono: ");
        per.setTelefono(str);
      
        //Ingresar datos cuenta
        utl.Println("Ingrese datos de la cuenta");
        c.setPersona(per);
        c.setNum_cuenta(utl.ReadString("Número:"));
        TipoCuenta tipoc = (TipoCuenta)utl.ReadEnum("Tipo de Cuenta","Elegir opción: ",TipoCuenta.values());
        c.setCuenta(tipoc);
        
        
       //Transacciones
        int i ;
        char r;
        do{
            utl.Println("Selección tipo de transacción:");
            utl.Println("1.Depósito.");
            utl.Println("2.Retiro");
            utl.Println("3.Apertura de cuenta");
            i=utl.ReadInt("Elegir opción:");
            
            switch(i){
                case 1:
                    double  dou = utl.ReadDouble("\nIngrese el monto: ");
                         c.Depositar(dou);
                    break;
                case 2:
                     dou = utl.ReadDouble("\nIngrese el monto: ");
                         c.Retirar(dou);
                    
                    break;
                case 3:
                     dou = utl.ReadDouble("\nIngrese el monto: ");
                         c.AperturarCuenta(dou);
                    break;
               }
               r =utl.ReadChar("Desea realizar alguna otra transacción? s/n", 0);
            
        }while(r!='n' );
        
        
       
             
      
       c.Mostrar();
       c.MostrarTransacciones();
       utl.PrintFooter();
        
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido" + e.getMessage());
        }
 
        
    
       
        
    }
    
}
