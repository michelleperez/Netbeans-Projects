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
    private  String nombre;
    private  String cedula;
    private TipoLicencia Tipo_licencia;

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

    public TipoLicencia getTipo_licencia() {
        return Tipo_licencia;
    }

    public void setTipo_licencia(TipoLicencia Tipo_licencia) {
        this.Tipo_licencia = Tipo_licencia;
    }
    public void mostrarChofer(){
        System.out.println("Este viaje va a ser operado por: "+nombre+" con cédula: "+cedula+" y tipo de licencia: "+Tipo_licencia);
    }

    

    
 
 
            
    
    
}
