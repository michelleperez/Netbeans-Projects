package swdeber6;

import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.F8A272FE-885C-11B5-D9A3-F5A48D9711EF]
// </editor-fold> 
public class Porhoras implements Contrato {
private static util utl = new util();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.077FD88E-2AEF-C839-E0FD-20F0B7E33DAC]
    // </editor-fold> 
    private float sueldo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.938A98B8-D106-6EC1-369B-CECE005A8424]
    // </editor-fold> 
    private short horas;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F83CF24E-2757-F32E-6158-2FDA40C0CD3A]
    // </editor-fold> 
    public Porhoras () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D2332B2F-D894-68D0-EC36-6303CEC04C23]
    // </editor-fold> 
    public short getHoras () {
        return horas;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.70F47654-6C8C-6C56-38AD-FD055E5FEF09]
    // </editor-fold> 
    public void setHoras (short val) {
        this.horas = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.DDC73DB2-639A-FE7C-FCE0-DBDCB4E3225A]
    // </editor-fold> 
    public float getSueldo () {
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.9705177E-6039-9278-4604-E24AB0F0F081]
    // </editor-fold> 
    public void setSueldo (float val) {
        this.sueldo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6A46736C-6AA9-9E67-7D58-6D0FFD779892]
    // </editor-fold> 
    public float CalcularSueldo () {
           sueldo = sueldo*horas;
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.57D8664E-D438-9AA0-E71F-C8A712D29FB5]
    // </editor-fold> 
    public void Mostrar () {
        utl.Println("***********************************************************");
        utl.Println("Persona que trabaja por horas");
        utl.Println("Horas trabajadas: "+horas+"\tSueldo por hora: "+sueldo);
        utl.Println("Su sueldo es de: "+this.CalcularSueldo());
    }

}

