package swejercicio11;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.E764967F-A684-E983-3B4D-3D95801DFCA5]
// </editor-fold> 
public class Cuadrado implements FiguraGeometrica {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.6C376457-7D09-B92A-1574-6FDF5CE7ED31]
    // </editor-fold> 
    private float lado;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EF4C52DA-6B41-562A-5413-54BB82990A12]
    // </editor-fold> 
    public Cuadrado (float l) {
        this.lado=l;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B7312425-D6D3-F1D3-02D3-321BB0C7C32F]
    // </editor-fold> 
    public float getLado () {
        return lado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.01510B39-7251-6414-25E0-D90040B3738A]
    // </editor-fold> 
    public void setLado (float val) {
        this.lado = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ACF1A11B-1411-FA43-8435-5BBC28448B4B]
    // </editor-fold> 
    public float CalcularArea () {
        return lado * lado;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.39E05C6E-864B-84CF-D04E-8CE0DD0824B3]
    // </editor-fold> 
    public float CalcularPerimetro () {
        return lado*4;
    }

       
}

