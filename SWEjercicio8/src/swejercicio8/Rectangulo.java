package swejercicio8;

import util.perez.*;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.1B13D1CD-16B2-86D8-7D37-9364979F4E37]
// </editor-fold> 
public class Rectangulo implements  FiguraGeometrica {
private static util utl = new util();
 
    private float base;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DBF79F16-3462-8BC0-ABB4-6A88B2FF5E8B]
    // </editor-fold> 
    private float altura;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4DE212DD-64E7-BFD1-888C-60D26A3AF4D5]
    // </editor-fold> 
    public Rectangulo () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.721EB71A-3981-A07A-951A-754C58A97442]
    // </editor-fold> 
    public float getAltura () {
        return altura;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.4A1B6665-3CB7-74F9-C895-FE6A3F53E87A]
    // </editor-fold> 
    public void setAltura (float val) {
        this.altura = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.D7B5799C-5BD4-6034-82F4-5DDA4F3D2B2F]
    // </editor-fold> 
    public float getBase () {
        return base;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.957AAB02-998D-26F0-2307-CDEA125251EF]
    // </editor-fold> 
    public void setBase (float val) {
        this.base = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CFC1D61E-A529-696E-CC42-2FE7C8C364C8]
    // </editor-fold> 
    public void Mostrar () {
      
        utl.Println("La altura del rectangulo es: "+altura+", su base es: "+base);
        utl.Print("Y su area es: "+this.CalcularArea());
        utl.Println("Su perímetro es: "+this.CalcularPerimetro());
        utl.Println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.5D1723BA-9B51-240A-CB1D-22F849E2D340]
    // </editor-fold> 
    @Override
    public float CalcularArea () {
        return (base*altura);
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.237D739C-2874-EBFA-F3D1-FA954A69631A]
    // </editor-fold> 
    @Override
    public float CalcularPerimetro () {
        return (base+base+altura+altura);
    }

}

