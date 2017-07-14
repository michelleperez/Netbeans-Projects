package swdeber5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.223F2425-5E99-5F06-6521-BDB8B4D1843B]
// </editor-fold> 
public class Cliente extends Persona {
    private static util utl = new util();
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62495AE8-30F9-0367-CF23-FB56496F6DFC]
    // </editor-fold> 
    private int numero;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E45FE97A-4611-1F71-F7F0-1C44F1C5EE20]
    // </editor-fold> 
    private Calendar fecha_afiliacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AB2974A0-B116-6A6C-B149-A337A6BF6F01]
    // </editor-fold> 
    private String direccion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EE5EE5EA-9C8F-A1B9-68DD-5473BC86E240]
    // </editor-fold> 
    private String telefono;

    private Calendar fecha_nacimiento;
      // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A6464754-4960-E179-5BF3-46E9DE80598C]
    // </editor-fold> 
      private List<Factura> factura;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.07EE716C-E4BF-00A0-F403-793FD6794867]
    // </editor-fold> 
    public Cliente () {
        
    }

    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    

        // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0F093C2A-AE04-D46A-D1F1-D67411AD94BB]
    // </editor-fold> 
    public String getDireccion () {
        return direccion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.01C76446-DCEF-420D-1E36-FA0D5695F0A5]
    // </editor-fold> 
    public void setDireccion (String val) {
        this.direccion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB3FD0D5-C282-070D-E34C-46BBAE13BA8C]
    // </editor-fold> 
    public Calendar getFecha_afiliacion () {
        return fecha_afiliacion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BC4A4DA1-9F3B-9661-7BE3-46F07206339C]
    // </editor-fold> 
    public void setFecha_afiliacion (Calendar val) {
        this.fecha_afiliacion = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B17B26B0-81BC-7E48-A4D6-21C817325E77]
    // </editor-fold> 
    public int getNumero () {
        return numero;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0EE46501-3FEA-F824-66ED-1164B1F94DF1]
    // </editor-fold> 
    public void setNumero (int val) {
        this.numero = val;
    }
     public int CalcularEdad () {
         return  utl.GetYear(fecha_nacimiento);
         
    }
     
    public int CalcularAfiliacion(){
        return utl.GetYear(fecha_afiliacion);
    } 
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D10FA7CF-686F-B960-44A2-51802789741C]
    // </editor-fold> 
    public void Mostrar () {
    utl.Println("Datos del cliente");
    utl.Println("Nombre:"+getNombre()+"\tCédula: "+getCedula()+"\tTeléfono:"+this.getTelefono());
    utl.Println("Número: "+numero+"\tFecha afiliación: "+utl.PrintDate(fecha_afiliacion,"dd/MM/yyyy"));
    utl.Println("Edad: "+this.CalcularEdad()+"\tAño de afiliación: "+this.CalcularAfiliacion());
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F1384EE7-6A6A-B0E0-1C94-0BFB9A2919A3]
    // </editor-fold> 
    public String getTelefono () {
        return telefono;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D3ED43F3-F068-D60D-2838-84AEB19F114B]
    // </editor-fold> 
    public void setTelefono (String val) {
        this.telefono = val;
    }
    public void IniciarArrayFactura(){
         this.factura = new ArrayList<>();
    }

    public void AñadirFactura(Factura fac){
         factura.add(fac);
    }
    public void ImprimirFactura(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        utl.Println("\n=================================================================================================================");
        utl.Println("\t\t\tFactura");
        utl.Println("=================================================================================================================");        
        for(Factura fac:this.factura){
            utl.Println("\tFecha de emisión: "+utl.PrintDate(fac.getFecha_emision(),"dd/MM/yyyy")+"No.Factura: "+fac.getNumero());
            utl.Println("Método de pago: "+fac.getPago());
            utl.Println("Subtotal: "+fac.getPrecio());
            fac.setPrecio(fac.CalcularSubtotal());
            fac.setIva(fac.getPrecio()*0.12);
            utl.Println("Iva 12%:"+fac.getIva());
            fac.setTotal(fac.getIva()+fac.getPrecio());
            utl.Println("Total: "+fac.getTotal());
        }
        utl.Println("=================================================================================================================");       
        
        
    }
    
}

