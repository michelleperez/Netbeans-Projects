package swdeber5;

import java.util.ArrayList; 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.8C11E2CB-6FA2-87E5-2551-45B20574E0BD]
// </editor-fold> 
public class DetalleFactura {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.443F1B50-5F8A-7F03-B065-63ECF77A5476]
    // </editor-fold> 
    private byte cantidad;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D8DF21DF-D21B-FF45-720A-4F978E0DA258]
    // </editor-fold> 
    private double precio_unitario;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8ADF3FB1-1EFB-897B-D2B4-A53EADC64196]
    // </editor-fold> 
    private double total;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E78AE2DF-7EB7-B9DA-A227-F89FA2A5B5FA]
    // </editor-fold> 
    private String descripcion;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.25FC336A-5EB1-ECF1-3207-2AC933ABC9A8]
    // </editor-fold> 
    private TipoProducto tipo;

       // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.201F2729-A1B9-98BA-C9FE-2B2CC99FC4F0]
    // </editor-fold> 
    public DetalleFactura () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.A7BDDCF6-F78C-D1F5-EA95-D78C8F3C57E7]
    // </editor-fold> 
    public byte getCantidad () {
        return cantidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2EFC07C-B011-CFFD-D2DB-390F236D7BA5]
    // </editor-fold> 
    public void setCantidad (byte val) {
        this.cantidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FAC3CB32-772D-8D10-417D-3D72BFD3F2B0]
    // </editor-fold> 
    public String getDescripcion () {
        return descripcion;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.56BE12D2-FBD1-7076-B787-BD56CE8B58D8]
    // </editor-fold> 
    public void setDescripcion (String val) {
        this.descripcion = val;
    }


    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.FB32A597-EB96-C3F0-99FC-5D123BA15979]
    // </editor-fold> 
    public double getPrecio_unitario () {
        return precio_unitario;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6FEBC79A-6DA4-A308-3EB6-12D49A013F9A]
    // </editor-fold> 
    public void setPrecio_unitario (double val) {
        this.precio_unitario = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.74240182-CB4E-AF9D-BEA6-721389B00E40]
    // </editor-fold> 
    public TipoProducto getTipo () {
        return tipo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.96E51F82-A511-51D9-FA0A-A41F2E1BB06C]
    // </editor-fold> 
    public void setTipo (TipoProducto val) {
        this.tipo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.38976DAF-1AB9-BCC7-4BAE-347724F4D0BE]
    // </editor-fold> 
    public double getTotal () {
        return total;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0082E798-7AA6-27DF-5575-EAE18B49EA5F]
    // </editor-fold> 
    public void setTotal (double val) {
        this.total = val;
    }

}

