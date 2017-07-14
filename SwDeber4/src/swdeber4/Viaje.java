
package swdeber4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author michelle
 */
public class Viaje {
    private String CiudadOrigen;
    private Ciudad CiudadDestino;
    private Bus Bus;
    private Chofer Chofer;
    private Calendar fecha;
    private Calendar hora;
    private double precio;
    private short kilometros;

    public Viaje() {
    }

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(Ciudad CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public Bus getBus() {
        return Bus;
    }

    public void setBus(Bus Bus) {
        this.Bus = Bus;
    }

    public Chofer getChofer() {
        return Chofer;
    }

    public void setChofer(Chofer Chofer) {
        this.Chofer = Chofer;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public short getKilometros() {
        return kilometros;
    }

    public void setKilometros(short kilometros) {
        this.kilometros = kilometros;
    }
    
    public void mostrarViaje(){
                
         SimpleDateFormat sdf_fecha = new SimpleDateFormat("dd/MM/YYYY");
         
         SimpleDateFormat sdf_hora = new SimpleDateFormat("HH:mm");
         System.out.print("El viaje a realizarse el día ");
         System.out.print(" ");
         System.out.print(sdf_fecha.format(fecha.getTime()));
         System.out.print(" desde "+CiudadOrigen);
         System.out.print(" ");
         System.out.print(" a  "+CiudadDestino.getNombre());
         this.Bus.mostrarBus(); //Mensaje a la clase bus
         this.Chofer.mostrarChofer(); //Mensaje a la clase chofer
         System.out.print(" ");
         System.out.print("a las  ");
         System.out.print(sdf_hora.format(fecha.getTime()));
         System.out.print(" ");
         System.out.print(", el recorrido del viaje es de "+this.kilometros+" kms");
         System.out.print(" y el precio del pasaje es de $ "+this.precio);
         System.out.print(" el clima en "+this.CiudadDestino.getNombre()+" es "+this.CiudadDestino.getClima()+" por lo que se recomienda "+this.CiudadDestino.getDescripcion());
         
        }
}
