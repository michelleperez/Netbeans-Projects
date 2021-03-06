package swdeber6;

import java.util.Calendar;
import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.12672E97-EF97-0E3D-FABF-D4CD240EF404]
// </editor-fold> 
public class Indefinido implements Contrato {
private static util utl = new util();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.81169B5E-69BC-2639-732A-10DD5CB78ADC]
    // </editor-fold> 
    private float sueldo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BD99C518-9A04-8A0C-7433-7498B538FBE5]
    // </editor-fold> 
    private float segurosocial;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5F82AFFB-08F9-EB4D-0063-6C229C2C0DCC]
    // </editor-fold> 
    private float bono;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DB92EC26-FF07-4C9B-8137-FAE06241DAA3]
    // </editor-fold> 
    private Calendar fecha_contrato;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.043B001C-6597-B91B-43BD-CD95F6C521A3]
    // </editor-fold> 
    public Indefinido () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.8D80463D-D027-4C46-85AD-1FD4D051B0E8]
    // </editor-fold> 
    public float getBono () {
        return bono;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C8B7878A-BF13-D332-1265-1FD5BA37AD9B]
    // </editor-fold> 
    public void setBono (float val) {
        this.bono = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A7D75C4-D492-ECF4-2BC6-F012DC92E534]
    // </editor-fold> 
    public Calendar getFecha_contrato () {
        return fecha_contrato;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.15C4AFCF-AA03-6AF9-FAA8-626CDF2282EA]
    // </editor-fold> 
    public void setFecha_contrato (Calendar val) {
        this.fecha_contrato = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6B9150D4-414C-32DE-0485-FFB90552A621]
    // </editor-fold> 
    public float getSegurosocial () {
        return segurosocial;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F7C5B557-82C9-F57D-61E5-DEFE1C917194]
    // </editor-fold> 
    public void setSegurosocial (float val) {
        this.segurosocial = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96D209BF-EC40-3C30-4FA8-74DBDDD4306B]
    // </editor-fold> 
    public float getSueldo () {
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4E9C8A8A-A913-3B85-9596-BBABFAC0D484]
    // </editor-fold> 
    public void setSueldo (float val) {
        this.sueldo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4CF8FB70-6ACC-398F-A97C-79C878683F78]
    // </editor-fold> 
    public float CalcularSueldo () {
        
       sueldo= (float) (sueldo-(sueldo*0.0945)+this.CalcularBono());
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B8492CCC-8F35-5D55-B958-1D196B6108F4]
    // </editor-fold> 
    public float CalcularBono () {
             float a = (float)(utl.GetYear(fecha_contrato)*(0.025*sueldo));
             return a;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A6F1C591-FD65-CF8E-EE77-AC10A078FD4A]
    // </editor-fold> 
    public void Mostrar () {
        utl.Println("***********************************************************");
        utl.Println("Persona con contrato Indefinido");
        utl.Println("Su sueldo total es :"+this.CalcularSueldo());
    }

   
}

