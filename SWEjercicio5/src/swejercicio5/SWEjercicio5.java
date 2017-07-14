package swejercicio5;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author michelle
 */
public class SWEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
                /*Calendar hoy = Calendar.getInstance();
                Calendar fecha_nacimiento = Calendar.getInstance();
                fecha_nacimiento.set(1997,Calendar.JULY,29);
                SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/YYYY");
                String strhoy= sdf.format(hoy.getTime());
                String strnac = sdf.format(fecha_nacimiento.getTime());

                String stranio_hoy = strhoy.substring(6);
                String strmes_hoy =  strhoy.substring(3,5);       
                String strdia_hoy =  strhoy.substring(0,2);    
                
                int aniohoy = Integer.valueOf(stranio_hoy);
                int meshoy = Integer.valueOf(strmes_hoy);
                int diahoy = Integer.valueOf(strdia_hoy);
                
                String stranio_fec = strnac.substring(6);
                String strmes_fec =  strnac.substring(3,5);       
                String strdia_fec =  strnac.substring(0,2);    
                
                int aniofec = Integer.valueOf(stranio_fec);
                int mesfec = Integer.valueOf(strmes_fec);
                int diafec = Integer.valueOf(strdia_fec);
               
                int edad = aniohoy - aniofec;
                int meses = meshoy -mesfec;
                int dia= diahoy - diafec;
                
                if(meses<0)
                        edad--;
                if(meses == 0 && dia<0)
                         edad--;
               System.out.println("Su edad es: "+edad);
               */
               for (int i = 1; i <=10; i++)
               {
                System.out.println("Bucle FOR : "+i);
              
               }
               System.out.println("");
               int j=1;
               while(j<=10){
                   System.out.println("Bucle WHILE: "+j);
                    j++;
               }
               System.out.println("");
               int r=1;
               do{
                   System.out.println("Bucle DO-WHILE: "+r);
                    r++;
               }while(r<=10);
               
            } catch (NumberFormatException e) {
            System.out.println("Se produjo una excepción"
            +e.getMessage());
        }
    }
    
}
