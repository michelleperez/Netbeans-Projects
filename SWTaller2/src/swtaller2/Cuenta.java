package swtaller2;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import util.perez.*;

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.6D5408D5-4229-FD78-BD48-88EB2F6B25DC]
// </editor-fold> 
public class Cuenta {

    private Persona persona;
    private final List<Transaccion> transacciones;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.36039D83-CDEF-7225-75CB-5727F83DFD66]
    // </editor-fold> 
    private Calendar fecha_apertura;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.031EFCAA-40A2-F2D3-A252-7FD418FCDB6F]
    // </editor-fold> 
    private TipoCuenta cuenta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AA55E71B-3C73-2018-B7B9-61189D76F81A]
    // </editor-fold> 
    private String num_cuenta;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.9C60241B-3C94-FD07-BA95-E97ACAB639C0]
    // </editor-fold> 
    private double saldo;
 
   private static util utl = new util();
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.73F8C267-5C0C-9E93-0C82-A395C86DE393]
    // </editor-fold> 
    public Cuenta () {
        this.saldo = 0;
        this.fecha_apertura = Calendar.getInstance();
        this.transacciones = new ArrayList<>();
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.89F92E00-D248-8CEF-D610-2B93FEFA5769]
    // </editor-fold> 
    public TipoCuenta getCuenta () {
        return cuenta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.1C0D6830-BA8B-96DA-229A-A865D1FE7A15]
    // </editor-fold> 
    public void setCuenta (TipoCuenta val) {
        this.cuenta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.5E9503A1-8EFA-D2CB-7C2E-743FCA849C68]
    // </editor-fold> 
    public Calendar getFecha_apertura () {
        return fecha_apertura;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BB0B548E-6A64-3CDC-40CE-A4D823DDB979]
    // </editor-fold> 
    public void setFecha_apertura (Calendar val) {
        this.fecha_apertura = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.ABAB3B49-A024-1697-6190-523820319237]
    // </editor-fold> 
    public String getNum_cuenta () {
        return num_cuenta;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7B470938-9D71-4DD1-87A1-8ED0F5B1543A]
    // </editor-fold> 
    public void setNum_cuenta (String val) {
        this.num_cuenta = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DA3FC439-C5A1-312A-AA4B-AD461B61B82C]
    // </editor-fold> 
    public double getSaldo () {
        return saldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FAB141EB-2EF8-7964-41F5-63F7BEDAF4B8]
    // </editor-fold> 
    public void setSaldo (double val) {
        this.saldo = val;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.90F37508-14B7-C25F-A921-ABB752A8D960]
    // </editor-fold> 
    public void Retirar (double monto) {
           utl.Println("Inicio de retiro ===> $" + monto);
        if(monto <= 0){
            utl.Println("El monto $" + monto + " no es válido para retirar");    
        }
        else if(monto > saldo){
            utl.Println("No hay saldo suficiente para su retiro de  $" + monto);
        }
        else{
            saldo -= monto;
            utl.Println("Retiro exitoso");
            System.out.printf("Saldo actualizado $%.2f\n" ,saldo);
            
            //Agregar comentario
           Transaccion t = new Transaccion(Calendar.getInstance(),"Retiro de $" + monto, monto, saldo, TipoTransaccion.Retiro);
            transacciones.add(t);
        }
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.14529070-41E6-1EC0-4081-33A1DFB06F4D]
    // </editor-fold> 
    public void Depositar (double monto) {
       utl.Println("Inicio de depósito ===> $" + monto);
        if(monto <= 0){
             utl.Println("El monto $" + monto + " no es válido para depositar");                
        }
        else{
            saldo += monto;
             utl.Println("Depósito exitoso");
            System.out.printf("Saldo actualizado $%.2f\n" ,saldo);
            
            //Agregar comentario
            Transaccion t = new Transaccion(Calendar.getInstance(),"Depósito de $" + monto, monto, saldo, TipoTransaccion.Deposito);
            transacciones.add(t);
        }    
    }
    public void AperturarCuenta(double monto){
          utl.Println("Inicio de apertura de cuenta ===> $" + monto);
        if(monto == 200){
            utl.Println("El monto $" + monto + " no es válido para aperurar");                
        }
        else{
            saldo += monto;
             utl.Println("Apertura exitosa");
            System.out.printf("Saldo actualizado $%.2f\n" ,saldo);
            
            //Agregar comentario
            Transaccion t = new Transaccion(Calendar.getInstance(),"Depósito de $" + monto, monto, saldo, TipoTransaccion.AperturaCuenta);
            transacciones.add(t);
        }    
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A15B17AD-26C8-2B18-6711-FA16F4C4D9D6]
    // </editor-fold> 
    public void Mostrar () {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("\n============================================================================================");
        System.out.print("\tCuenta:" + num_cuenta+"\t\tSaldo actual: "+ saldo);
        System.out.print("\n\tTitular:" +persona.getNombre()+"\t\tCédula: " +persona.getCedula());
        System.out.print("\n\tDirección:" +persona.getDireccion()+"\t\tTeléfono:" +persona.getTelefono());
        System.out.print("\n============================================================================================");
        System.out.print("\n\tTipo:" + this.cuenta+"\t\tFecha de apertura:" + sdf.format(this.fecha_apertura.getTime()));
        System.out.print("\n============================================================================================");
        System.out.println();        
    }

    public void MostrarTransacciones(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("\t\t\tTransacciones");
        System.out.println("============================================================================================");        
        System.out.println("\t\tFecha\t\tDescripción\t\tMonto\t\tTipo\t\tSaldo");        
        System.out.println("=============================================================================================");        
        for(Transaccion t:this.transacciones){
            System.out.print("\t"+sdf.format(t.getFecha_transaccion().getTime()));
            System.out.print("\t" + t.getDescripcion());
            System.out.print("\t\t$" + t.getMonto());
            System.out.print("\t\t" + t.getTipo_trans());
            System.out.printf("\t$%.2f\n", t.getSaldo());        
        }
    
     System.out.println("============================================================================================");  
    }
    
    }



