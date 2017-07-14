/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author michelle
 */
public class Viaje {
    private Calendar fecha;
    private Ciudad ciu_origen;
    private Ciudad ciu_destino;
    private double precio;
    private short kilometros;
    private Bus bus;
    private Chofer chofer;

    public Viaje() {
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Ciudad getCiu_origen() {
        return ciu_origen;
    }

    public void setCiu_origen(Ciudad ciu_origen) {
        this.ciu_origen = ciu_origen;
    }

    public Ciudad getCiu_destino() {
        return ciu_destino;
    }

    public void setCiu_destino(Ciudad ciu_destino) {
        this.ciu_destino = ciu_destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public short getKilometros() {
        return kilometros;
    }

    public void setKilometros(short kilometros) {
        this.kilometros = kilometros;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }
     public void mostrarViaje(){
         SimpleDateFormat sdf_fecha = new SimpleDateFormat("dd/MM/YYYY");
         
         SimpleDateFormat sdf_hora = new SimpleDateFormat("HH:mm");
         
         System.out.print("Viaje a realizarse el día: ");
         System.out.print(" ");
         System.out.print(sdf_fecha.format(fecha.getTime()));
         System.out.print("desde: "+ciu_origen.getNombre());
         System.out.print("desde: "+ciu_destino.getNombre());
         this.bus.mostrarBus(); //Mensaje a la clase bus
         this.chofer.mostrarChofer(); //Mensaje a la clase chofer
         System.out.print("a las : ");
         System.out.print(sdf_hora.format(fecha.getTime()));
         System.out.println("el recorrido del viaje es: "+this.kilometros);
         System.out.println("el precio del pasaje es: "+this.precio);
         
         int mes= fecha.get(Calendar.MONTH);
        // En verano
        if( mes >= Calendar.JUNE && mes <= Calendar.NOVEMBER){
        System.out.println("el clima en"+ ciu_destino.getNombre() + "en Verano"+ ciu_destino.getClima_verano()+ "se recomienda"+ ciu_destino.getRecomendacion_verano());
        }
        else{
            //Clima en invierno
         System.out.println("el clima en"+ ciu_destino.getNombre() + "en Invierno "+ ciu_destino.getClima_invierno() + "se recomienda"+ ciu_destino.getRecomendacion_invierno());   
        }
         
         
         
     }
    
}
