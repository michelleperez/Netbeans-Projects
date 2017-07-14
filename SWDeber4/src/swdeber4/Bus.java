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
    private String placa;
    private byte numero;
    private String cooperativa;
    private byte capacidad;

    public Bus() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public String getCooperativa() {
        return cooperativa;
    }

    public void setCooperativa(String cooperativa) {
        this.cooperativa = cooperativa;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }
    public void mostrarBus(){
        System.out.println("Datos del bus:");
        System.out.println("Cooperativa: "+cooperativa+" con placa número: "+placa+" el nùmero de bus es "+numero+"la capacidad de pasajeros es: "+capacidad);
    }
    
    
    
    
}
