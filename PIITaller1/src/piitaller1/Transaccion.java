package piitaller1;

import java.util.Calendar;

public class Transaccion {
    
    private Calendar fecha;
    private String descripcion;
    private double monto;
    private double saldo;
    private TipoTransaccion tipo;

    //Se crea el constructor con parametros(fecha,descripcion,monto,saldo,tipo de transaccion) de la clase Transaccion.
    public Transaccion(Calendar fecha, String descripcion, double monto, double saldo, TipoTransaccion tipo) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.monto = monto;
        this.saldo = saldo;
        this.tipo = tipo;        
    }

    public Calendar getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public TipoTransaccion getTipo() {
        return tipo;
    }

    public double getSaldo() {
        return saldo;
    }        
}
