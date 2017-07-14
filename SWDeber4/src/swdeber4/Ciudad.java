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
    private String Nombre;
    private Clima Clima_invierno;
    private Clima Clima_verano;
    private String Provincia;
    private Region Region;
    private Titurismo TipoDeTurismo;
    private String recomendacion_verano;
    private String recomendacion_invierno;

    public Ciudad() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Clima getClima_invierno() {
        return Clima_invierno;
    }

    public void setClima_invierno(Clima Clima_invierno) {
        this.Clima_invierno = Clima_invierno;
    }

    public Clima getClima_verano() {
        return Clima_verano;
    }

    public void setClima_verano(Clima Clima_verano) {
        this.Clima_verano = Clima_verano;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public Region getRegion() {
        return Region;
    }

    public void setRegion(Region Region) {
        this.Region = Region;
    }

    public Titurismo getTipoDeTurismo() {
        return TipoDeTurismo;
    }

    public void setTipoDeTurismo(Titurismo TipoDeTurismo) {
        this.TipoDeTurismo = TipoDeTurismo;
    }

    public String getRecomendacion_verano() {
        return recomendacion_verano;
    }

    public void setRecomendacion_verano(String recomendacion_verano) {
        this.recomendacion_verano = recomendacion_verano;
    }

    public String getRecomendacion_invierno() {
        return recomendacion_invierno;
    }

    public void setRecomendacion_invierno(String recomendacion_invierno) {
        this.recomendacion_invierno = recomendacion_invierno;
    }

    

  
    
    
}
