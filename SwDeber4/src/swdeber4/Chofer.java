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
public class Chofer {
    private String nombre;
    private String cedula;
    private Licencia Licencia;

    public Chofer() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Licencia getLicencia() {
        return Licencia;
    }

    public void setLicencia(Licencia Licencia) {
        this.Licencia = Licencia;
    }
    public void mostrarChofer(){
          System.out.println(", va a ser conducido por "+this.nombre+" de cédula "+this.cedula+" de licencia "+this.Licencia);
    }
}
