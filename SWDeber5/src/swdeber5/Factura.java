package swdeber5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.C72A0974-0C79-6F6E-48EA-2C329BC48A60]
// </editor-fold> 
public class Factura {
  private static util utl = new util();
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.036DF5E4-B295-4777-1D90-BB0547626655]
    // </editor-fold> 
    private String numero;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D00102FD-B278-79FB-4EB1-5E4CA06D6CFE]
    // </editor-fold> 
    private Calendar fecha_emision;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.53959BC2-A465-4833-4044-A3CC8D179D12]
    // </editor-fold> 
    private double precio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2A9FBC7E-89D0-567B-AB8D-D8D04A2A5F16]
    // </editor-fold> 
    private double iva;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5AC68246-C30D-E38C-0179-19DA986DB74C]
    // </editor-fold> 
    private double total;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED62C423-E589-4319-70E1-8ABB37ED60F6]
    // </editor-fold> 
    private MetodoPago Pago;
    private List<DetalleFactura> detfac = new ArrayList <>();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.7475B613-4B02-2C20-E940-B54B3E8D2651]
    // </editor-fold> 
    public Factura () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.02F741B7-5AE3-B2E7-6391-BE27A54838A3]
    // </editor-fold> 
    public MetodoPago getPago () {
        return Pago;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E510BF94-B381-390D-8A37-9821906B3A2C]
    // </editor-fold> 
    public void setPago (MetodoPago val) {
        this.Pago = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.13372F4D-6E9F-B66F-8C26-3E25ABC3E6F7]
    // </editor-fold> 
    public Calendar getFecha_emision () {
        return fecha_emision;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.309509FB-F572-E04D-3F0F-A947C08B9CCE]
    // </editor-fold> 
    public void setFecha_emision (Calendar val) {
        this.fecha_emision = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7365A875-F5AA-9453-0896-439BADBD6EFC]
    // </editor-fold> 
    public double getIva () {
        return iva;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F00C3F1B-CFB8-53DE-C8C7-3283C9457864]
    // </editor-fold> 
    public void setIva (double val) {
        this.iva = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C47887DA-DA9B-ADE7-92D5-D5C9A7ADE065]
    // </editor-fold> 
    public String getNumero () {
        return numero;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9A579460-BD98-4B86-D15B-152DFC326618]
    // </editor-fold> 
    public void setNumero (String val) {
        this.numero = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.15200055-FE75-07BD-D55A-08D0B2082758]
    // </editor-fold> 
    public double getPrecio () {
        return precio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D820C353-ACD5-15D4-7C3E-077731A268A8]
    // </editor-fold> 
    public void setPrecio (double val) {
        this.precio = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.92CD2D39-37B7-6890-CA81-E0EC51B0B972]
    // </editor-fold> 
    public double getTotal () {
        return total;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BB7DBE38-0926-FCE3-B065-5B5492C3F2DE]
    // </editor-fold> 
    public void setTotal (double val) {
        this.total = val;
    }
    
     public void AñadirDetalleFact(DetalleFactura d_fac){
         detfac.add(d_fac);
    }
    public void ImprimirDetFact(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        utl.Println("\n=================================================================================================================");
        utl.Println("\t\t\tDetalle Factura");
        utl.Println("=================================================================================================================");        
        utl.Println("\tTipo\t\tDescripción\t\tCantidad\t\tP.Unitario\t\tTotal");        
        utl.Println("=================================================================================================================");        
        for(DetalleFactura det:this.detfac){
            
            utl.Print("\t" + det.getTipo());
            utl.Print("\t" + det.getDescripcion());
            utl.Print("\t$" + det.getCantidad());
            utl.Print("\t\t" + det.getPrecio_unitario());
            utl.Print("\t$%.2f\n"+det.getTotal());        
        }
        System.out.println("=================================================================================================================");        
    
    }
    public double CalcularSubtotal(){
    double sub =0;
    for(DetalleFactura det:this.detfac){
         sub += det.getTotal();
     }
    return sub;
    } 
}

