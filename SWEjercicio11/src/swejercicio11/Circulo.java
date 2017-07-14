package swejercicio11;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.B07E0211-2808-2750-8880-1DD6BD3E1360]
// </editor-fold> 
public class Circulo implements FiguraGeometrica {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A5414E7C-EC83-38DC-177E-C093F8BD24D2]
    // </editor-fold> 
    private float radio;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.34453A18-4BA1-A1D3-34C5-F2BE907AA2F1]
    // </editor-fold> 
    public Circulo (float radio) {
        this.radio= radio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E2EA434F-88E4-F01B-9447-017039E5017F]
    // </editor-fold> 
    public float getRadio () {
        return radio;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C4BF4B5C-AC96-6B5C-568C-8CEC1017BFBE]
    // </editor-fold> 
    public void setRadio (float val) {
        this.radio = val;
    }

   
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.62798EC4-1146-C7D8-5B54-CF4AC397C993]
    // </editor-fold> 
    public float CalcularArea () {
        return ;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D89D4F9C-4D80-16CF-B848-95EBAC0EF1B3]
    // </editor-fold> 
    public float CalcularPerimetro () {
        return 0.0f;
    }

}

