package swdeber5;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.7F2EAAFC-7D3D-3A34-3D17-D6D6108D6CF2]
// </editor-fold> 
public class Ubicacion {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8FAD1D4E-8206-A9AE-8B7D-CFD40B077E88]
    // </editor-fold> 
    private String jardin;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.60FB78E3-5960-B42F-3795-89A406494CD9]
    // </editor-fold> 
    private byte fila;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.0EFFEC21-73D2-2C2E-3E55-44F1214785AC]
    // </editor-fold> 
    private char columna;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BE7B56BC-DA28-690A-C09B-0A9EE7234C26]
    // </editor-fold> 
    private TipoUbicacion Tipo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A992919A-0B98-C846-988F-4BE248B651B1]
    // </editor-fold> 
    public Ubicacion () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C714EE69-CC0E-C4C3-78C8-F86D1F16608E]
    // </editor-fold> 
    public TipoUbicacion getTipo () {
        return Tipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E56D7187-6DC6-49C5-6937-E45ABF62F6A0]
    // </editor-fold> 
    public void setTipo (TipoUbicacion val) {
        this.Tipo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B055624B-15CC-E856-CAD5-5EEE36FD187A]
    // </editor-fold> 
    public char getColumna () {
        return columna;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C719FB19-F82F-A2F4-9DB3-CAA25A74C881]
    // </editor-fold> 
    public void setColumna (char val) {
        this.columna = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.AB8A6984-194A-92CA-FC7F-BCCB94CE4964]
    // </editor-fold> 
    public byte getFila () {
        return fila;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.12F4145D-36BB-87F3-8A17-CFDCB82E212A]
    // </editor-fold> 
    public void setFila (byte val) {
        this.fila = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.18F04EF6-18E3-A10A-15C7-D5B9B4FC8CC6]
    // </editor-fold> 
    public String getJardin () {
        return jardin;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.993BD386-EBCA-EE61-89A5-205E0CB616C9]
    // </editor-fold> 
    public void setJardin (String val) {
        this.jardin = val;
    }

}

