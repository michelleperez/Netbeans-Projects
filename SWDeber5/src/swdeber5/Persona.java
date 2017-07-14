package swdeber5;

import java.util.Calendar;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.CC71E2B6-66E1-389A-DF70-DBFDD3B2D68F]
// </editor-fold> 
public class Persona {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.933F115B-3C6C-122C-F6CB-4669DCDB3534]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.11B0CAF2-5FD8-C18E-17DD-B66A2752BFCD]
    // </editor-fold> 
    private String cedula;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AEC31D62-AAF2-AA1E-4892-218F98731367]
    // </editor-fold> 
    private Calendar fecha_nacimiento;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.02DF4132-4AE0-2EE5-63FB-FAC27A95B295]
    // </editor-fold> 
    public Persona () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A8CCAFCE-52D4-BF3D-E3DE-B67EAD22938F]
    // </editor-fold> 
    public String getCedula () {
        return cedula;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F4A7D9D6-DCDB-9DE2-C204-6982200D730C]
    // </editor-fold> 
    public void setCedula (String val) {
        this.cedula = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.703B34E2-B06A-5128-9DAF-1D013BA393D2]
    // </editor-fold> 
    public Calendar getFecha_nacimiento () {
        return fecha_nacimiento;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.F321A24E-1BB3-C31D-6C0B-9FC419159045]
    // </editor-fold> 
    public void setFecha_nacimiento (Calendar val) {
        this.fecha_nacimiento = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A3B5C0E9-764B-8ADB-F964-ACDA9678E8A4]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FA09D739-00F6-84EA-A3D5-9570C02009FE]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3CD9E9DB-454D-3EF8-49C7-0E77EF63041B]
    // </editor-fold> 
    public int CalcularEdad () {
        return 0;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.F156D45A-5365-3C0C-56DD-AE63DB6E1162]
    // </editor-fold> 
    public void Mostrar () {
    }

}

