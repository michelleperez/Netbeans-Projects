package swdeber6;

import util.perez.util;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.03549632-7FC2-1731-A02E-079029BFAACE]
// </editor-fold> 
public class Ocacional implements Contrato {
private static util utl = new util();

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.74D1F3C5-E955-FA6B-6481-EACF095A8FCF]
    // </editor-fold> 
    private float sueldo;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.64E67CC1-BAD6-BFD2-EADF-BE45BFD60D57]
    // </editor-fold> 
    private float seguro_Social;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A2C0CDD3-C3DD-6D67-9F80-CD754B313807]
    // </editor-fold> 
    public Ocacional () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.0E3DA738-C1C1-B780-B457-6B519D9CD0C7]
    // </editor-fold> 
    public float getSeguro_Social () {
        return seguro_Social;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.E61822DD-E90F-3B4E-9581-B2DA7E69DFB5]
    // </editor-fold> 
    public void setSeguro_Social (float val) {
        this.seguro_Social = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.54E3E9B2-247B-D788-D018-FBB792A609EE]
    // </editor-fold> 
    public float getSueldo () {
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.6F56CDF7-0A10-ACC3-7080-76511D4B6B52]
    // </editor-fold> 
    public void setSueldo (float val) {
        this.sueldo = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.B43C9D46-5200-EC7C-CD0E-5BB08C9D604B]
    // </editor-fold> 
    public float CalcularSueldo () {
        float aps=(float)(sueldo*0.0945);
         sueldo= (float) (sueldo-(sueldo*0.0945));
        return sueldo;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.BB642581-BA28-21EC-5984-BFBB6ECAB27C]
    // </editor-fold> 
    public void Mostrar () {
        float aps=(float)(sueldo*0.0945);
        utl.Println("***********************************************************");
        utl.Println("Persona con contrato ocacional");
        utl.Println("Se le restará el 9.45% de aporte al seguro que son:"+aps);
        utl.Println("Su sueldo es de :"+this.CalcularSueldo());
    }

}

