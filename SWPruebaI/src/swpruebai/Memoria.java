package swpruebai;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.4A217A29-41B1-D560-7780-71D454031720]
// </editor-fold> 
public class Memoria {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.61022343-2AFE-1392-EFAA-FD792981FE07]
    // </editor-fold> 
    private String marca;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4E6F120E-65AD-7CB7-A6B4-23C9F1B09B2A]
    // </editor-fold> 
    private byte capacidad;
    private Aplicacion aplicacion;
 private List<Aplicacion> aplicaciones;
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.41C69C3C-F024-EEE0-E4F0-942139ECADAF]
    // </editor-fold> 
    public Memoria () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7E4E4A71-8A24-8FB0-C245-9D1A57C9B911]
    // </editor-fold> 
    public byte getCapacidad () {
        return capacidad;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7CDB7071-47C7-58D6-295D-5F8AB5BAF103]
    // </editor-fold> 
    public void setCapacidad (byte val) {
        this.capacidad = val;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.C25F0295-32E0-6E01-22AC-BFC4F779BDC7]
    // </editor-fold> 
    public String getMarca () {
        return marca;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,regenBody=yes,id=DCE.7AE99873-5F1B-BEE4-08EB-28EF53A9F047]
    // </editor-fold> 
    public void setMarca (String val) {
        this.marca = val;
    }
 public void IniciarArray(){
         this.aplicaciones = new ArrayList<>();
    }

       // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A3819A65-970C-B88B-7D01-0A3BBEFF0CCD]
    // </editor-fold> 
    public void CalcularUsoMemoria (int peso) {
        int capfinal= capacidad*1024;
        if(capfinal>=peso){
             capfinal= capfinal-peso;
             capfinal=(capfinal*100)/capfinal;
             int a =(int) (100-capfinal);
             System.out.println("El porcentaje de uso de memoria es del :"+a +" %");
        }else if(capfinal< peso){
            System.out.println("Capacidad del celular agotada");
        }
        Aplicacion t = new Aplicacion();
            aplicaciones.add(t);
    }

}

