package swpruebai;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.3939EFA5-C187-0374-490B-9536A8E016F2]
// </editor-fold> 
public class Aplicacion {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3FC5B11B-6854-8E87-D110-2AD7EB93056E]
    // </editor-fold> 
    private String nombre;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.01796EC6-B9FD-8B07-B7A6-CC86EEEE0457]
    // </editor-fold> 
    private int peso;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.567C3F33-2B8B-256D-6B9E-578EC02F779A]
    // </editor-fold> 
    private TipoCategoria categoria;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.18F58DC1-2463-C65C-60E1-ED8DC04F5C71]
    // </editor-fold> 
    public Aplicacion (String nombre, int peso,TipoCategoria tipo) {
    }

    public Aplicacion(){
        
    }
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.69B59AA6-7155-A88E-B5A3-5A57CA470227]
    // </editor-fold> 
    public TipoCategoria getCategoria () {
        return categoria;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.EF339605-6E47-8C34-09F7-415C0762E9ED]
    // </editor-fold> 
    public void setCategoria (TipoCategoria val) {
        this.categoria = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.B70FF70A-8378-08BA-206C-F8ED1AE0576A]
    // </editor-fold> 
    public String getNombre () {
        return nombre;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.589FFB16-FE0B-5F2B-588C-022AE23ECD7F]
    // </editor-fold> 
    public void setNombre (String val) {
        this.nombre = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.10C620D8-A639-AF2E-7955-C09486663315]
    // </editor-fold> 
    public int getPeso () {
        return peso;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.06CF88DA-B6AA-8C4D-E6AD-D88CED511A2A]
    // </editor-fold> 
    public void setPeso (int val) {
        this.peso = val;
    }

}

