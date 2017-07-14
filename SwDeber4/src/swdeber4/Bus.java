/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber4;

/**
 *
 * @author michelle
 */
public class Bus {
    private String Placa;
    private byte numero;
    private String Cooperativa;
    private byte capacidad;

    public Bus() {
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public String getCooperativa() {
        return Cooperativa;
    }

    public void setCooperativa(String Cooperativa) {
        this.Cooperativa = Cooperativa;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }
    
    public void mostrarBus(){
        System.out.print("  va a ser operados por la Cooperativa  "+Cooperativa+" en el bus#  "+numero+" placa "+this.Placa+" con capacidad para "+this.capacidad+" pasajeros");
      
    }
}
