package swdeber5;

import java.util.Calendar;
import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.86136F7F-0188-77C6-3D5A-C0A983B5048E]
// </editor-fold> 
public class Difunto extends Persona {
private static util utl = new util();

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.1A32A446-AAD6-C45A-DFC7-A309FC587532]
    // </editor-fold> 
    private String causa;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.2F05CCE5-EC9C-F7F5-9253-E9C49087A2AF]
    // </editor-fold> 
    private Estado estado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.709BDFB4-B1FE-4B08-AF3C-A9396BAA408F]
    // </editor-fold> 
    private Calendar fecha_defuncion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C9FD8B5E-48BA-7F1D-942E-285B0D6EDC40]
    // </editor-fold> 
    private boolean enfermedad_contagiosa;
    private Ubicacion ubicacion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ECD0AACC-52E2-D2D2-C243-DD5F180DF52E]
    // </editor-fold> 
    public Difunto () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D3C5EB16-45BA-58AF-89BA-B30C76D903CE]
    // </editor-fold> 
    public int CalcularEdad () {
         return  utl.GetYearFrom(this.getFecha_nacimiento(),this.fecha_defuncion);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4C5BDAF3-BA77-6ACB-3414-8E4A6A47AD64]
    // </editor-fold> 
    public void Mostrar () {
       utl.Println("_________________________________________________________"); 
       utl.Println("DATOS DE DIFUNTO");
       utl.Println("\nNombre: "+this.getNombre()+"\t\tCédula: "+this.getCedula());
       utl.Println("Fecha de defunción: "+utl.PrintDate(fecha_defuncion,"dd/MM/yyyy")+"\tEdad: "+this.CalcularEdad());
       utl.Println("Causa de muerte: "+causa+"\tEstado: "+estado);
       utl.Println("Enfermedad contagiosa: "+this.enfermedad_contagiosa);
       utl.Println("\nDATOS DE UBUCACIÒN DEL DIFUNTO");
       utl.Println("Jardín: "+ubicacion.getJardin()+"Tipo:"+ubicacion.getTipo()+"\tFila: "+ubicacion.getFila()+"\tColumna: "+ubicacion.getColumna());
      
              
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7562A653-6568-8C98-B175-E98CC90FC69C]
    // </editor-fold> 
    public String getCausa () {
        return causa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D2CB5BFC-AE2D-1035-9AB5-6C8A8E46A229]
    // </editor-fold> 
    public void setCausa (String val) {
        this.causa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.470F36CD-B5B7-E0AC-1767-A3D671EB52B8]
    // </editor-fold> 
    public boolean getEnfermedad_contagiosa () {
        return enfermedad_contagiosa;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8C4AABBD-842B-D5D4-E7E3-FE57A72AF888]
    // </editor-fold> 
    public void setEnfermedad_contagiosa (boolean val) {
        this.enfermedad_contagiosa = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.CCDFB632-B6AE-FCB2-D5F5-19F4151A999C]
    // </editor-fold> 
    public Estado getEstado () {
        return estado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D6306CAB-B783-0970-B23D-EAD1FD2CF843]
    // </editor-fold> 
    public void setEstado (Estado val) {
        this.estado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D0A51A07-16B6-D630-7FD6-4ECB636BCA94]
    // </editor-fold> 
    public Calendar getFecha_defuncion () {
        return fecha_defuncion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.2C243125-EAD2-296A-4A0B-DCB5139AD332]
    // </editor-fold> 
    public void setFecha_defuncion (Calendar val) {
        this.fecha_defuncion = val;
    }

}

