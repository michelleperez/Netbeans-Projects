package swpruebai;

import java.util.ArrayList;
import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B8BEB977-6C0F-7DEE-C598-BF3EBA31DA30]
// </editor-fold> 
public class Celular {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E367A278-4168-5A4B-FF52-72DFCEE30CBB]
    // </editor-fold> 
    private TipoMarca marca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.91646DC3-22CC-BBF2-DCE7-18E539797B9A]
    // </editor-fold> 
    private String modelo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.92468429-EC08-5263-9087-4EEE479B71B1]
    // </editor-fold> 
    private TipoSO sistemaoperativo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.28469D8F-FA37-E6CB-695C-C0A53E85D2CB]
    // </editor-fold> 

   
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3B347455-9F52-B300-97C8-3B9BD263DA94]
    // </editor-fold> 
    public Celular () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B5271742-4ED2-1AEE-810D-5F51E59F8E8E]
    // </editor-fold> 
    public TipoMarca getMarca () {
        return marca;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F3A8199E-1695-1C1C-1F1E-A5F0DE656104]
    // </editor-fold> 
    public void setMarca (TipoMarca val) {
        this.marca = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0B958DA1-7154-264C-3D67-A851E405B7A8]
    // </editor-fold> 
    public String getModelo () {
        return modelo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A0537145-6260-0CE3-54AC-9D5EBA939830]
    // </editor-fold> 
    public void setModelo (String val) {
        this.modelo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.20EACC7F-1009-E5CC-1E42-AF63372F051D]
    // </editor-fold> 
    public TipoSO getSistemaoperativo () {
        return sistemaoperativo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.BE58770A-7BAC-B00A-1348-C30EDFBFADB1]
    // </editor-fold> 
    public void setSistemaoperativo (TipoSO val) {
        this.sistemaoperativo = val;
    }

    
}

