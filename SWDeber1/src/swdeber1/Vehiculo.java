/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber1;

/**
 *
 * @author michelle
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private Motor motor;

    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    public void Acelerar (int rpm){
     this.motor.VariarRPM(rpm, true);
    }
    public void Desacelerar(int rpm){
        this.motor.VariarRPM(rpm, false);
    }
    public void Mostrar( ){
        System.out.println();
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Año: "+this.año);
        System.out.println("----------------------------------------");
    }
}