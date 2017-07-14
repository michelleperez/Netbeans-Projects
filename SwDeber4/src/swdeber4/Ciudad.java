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
public class Ciudad {
    private String nombre;
    private String Descripcion;
    private Clima clima;
    private Turismo TipoTurismo;

    public Ciudad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Turismo getTipoTurismo() {
        return TipoTurismo;
    }

    public void setTipoTurismo(Turismo TipoTurismo) {
        this.TipoTurismo = TipoTurismo;
    }
        
}
