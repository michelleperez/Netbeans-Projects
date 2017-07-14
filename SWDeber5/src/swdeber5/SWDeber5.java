/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import util.perez.*;

/**
 *
 * @author michelle
 */
public class SWDeber5 {

    private static util utl = new util();
    public static void main(String[] args) {
        try {
            Calendar date = Calendar.getInstance();
            date.set(2017,Calendar.JUNE,23);
            Unit unidad = Unit.II;
            utl.setDate(date);
            utl.setUnit(unidad);
            utl.setDescription("Servicios funerarios");
            utl.setTitle("De todo");
            utl.setNumber((byte)6);
           utl.PrintHeader();
           //Instanciar cliente
            Cliente cli = new Cliente();
            utl.Println("Ingresar datos del cliente");
            cli.setNombre(utl.ReadString("Nombre:"));
            cli.setCedula(utl.ReadString("Cédula: "));
            cli.setTelefono(utl.ReadString("Teléfono:"));
             cli.setNumero(utl.ReadInt("Número: "));
            Calendar fecha_naci = Calendar.getInstance();
            fecha_naci=utl.ReadDate("Fecha de nacimiento: ","dd/MM/yyyy");
            cli.setFecha_nacimiento(fecha_naci);
            Calendar fecha_afil = Calendar.getInstance();
            fecha_afil=utl.ReadDate("Fecha de afiliación:","dd/MM/yyyyy");
            cli.setFecha_afiliacion(fecha_afil);
           
             cli.Mostrar();
            //Instanciar difinto
          /* 
            Difunto di= new Difunto();
            utl.Println("INGRESE DATOS DE DIFUNTO");
            di.setNombre(utl.ReadString("Nombre: "));
            di.setCedula(utl.ReadString("Cédula: "));
            di.setCausa(utl.ReadString("Causa de muerte: "));
            Calendar fecha_dif = Calendar.getInstance();
            fecha_dif = utl.ReadDate("Fecha de defunción (dd/MM/yyyy): ", "dd/MM/yyyy");
            di.setFecha_defuncion(fecha_dif);
            Calendar fecha_nac = Calendar.getInstance();
            fecha_nac=utl.ReadDate("Fecha de nacimiento (dd/MM/yyyy):","dd/MM/yyyy");
            di.setFecha_nacimiento(fecha_nac);
            boolean EnferCont = utl.ReadBoolean("Enfermedad Contagiosa");
            di.setEnfermedad_contagiosa(EnferCont);
            
            Estado est = (Estado)utl.ReadEnum("Estado","Elegir opción: ",Estado.values());
            di.setEstado(est);
             
            //Instanciar Ubicación
            Ubicacion ub = new Ubicacion();
            utl.Println("INGRESE DATOS DE UBICACIÓN");
            ub.setJardin(utl.ReadString("Jardin:"));
            TipoUbicacion tipo=(TipoUbicacion)utl.ReadEnum("Tipo:","Elegir opción:",TipoUbicacion.values());
            ub.setTipo(tipo);
            ub.setFila(utl.ReadByte("Fila:",false));
            ub.setColumna(utl.ReadChar("Columna:", 0));
            di.setUbicacion(ub);
            
           
           //Instanciar objeto factura
           Factura fac = new Factura();
           int op=0;
           do{
             utl.Println("INGRESAR DATOS FACTURA");
             Calendar fecha_emi = Calendar.getInstance();
             fecha_emi = utl.ReadDate("Fecha de emisión:","dd/MM/yyyy");
             fac.setFecha_emision(fecha_emi);
             fac.setNumero(utl.ReadString("No.Factura: "));
             MetodoPago metodo = (MetodoPago)utl.ReadEnum("Método de Pago","Elegir opción: ",MetodoPago.values());
            fac.setPago(metodo);
            //Instanciar detalle Factura
            DetalleFactura detfac = new DetalleFactura();
            int opc=0;
           do{
               float valor;
            utl.Println("INGRESAR DETALLE FACTURA");
            TipoProducto tipop = (TipoProducto)utl.ReadEnum("Tipo Producto","Elegir opción: ",TipoProducto.values());
            detfac.setTipo(tipop);
            switch(tipop){
                case   ARREGLO_FLORAL:
                    valor = 20;
                    detfac.setPrecio_unitario(valor);
                break;    
                case  BEBIDAS:
                    valor = 100;
                    detfac.setPrecio_unitario(valor);
                break;
                case  MUSICA:
                    valor = 60;
                    detfac.setPrecio_unitario(valor);
                break;
                case  MISA:
                    valor = 40;
                    detfac.setPrecio_unitario(valor);
                break;
                case  COMIDA:
                    valor = 3;
                    detfac.setPrecio_unitario(valor);
                break;
                case  RECUERDOS:
                    valor = 2;
                    detfac.setPrecio_unitario(valor);
                break;
               
                
            }
            detfac.setDescripcion(utl.ReadString("Descripción:"));
            detfac.setCantidad(utl.ReadByte("Cantidad: ", false));
            fac.AñadirDetalleFact(detfac);
            opc=utl.ReadInt("Desea ingresar un nuevo detalle de factura? 1.Si 2.No");
             
           }while(opc!=2);
            cli.AñadirFactura(fac);
            op=utl.ReadInt("Desea ingresar una nueva factura? 1.Si 2.No");
             
           }while(op!=2);
           */
          
           
            //Imprimir
           
            //di.Mostrar();
            //cli.ImprimirFactura();
            //fac.ImprimirDetFact();
            utl.PrintFooter();
           
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido" + e.getMessage());
        }
        
    }
    
}
