package piilista;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class PIILista {
    
    private static Scanner sc = new Scanner(System.in);
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);
    
    public static void main(String[] args) {
        try {
            Caratula cr = new Caratula();
            cr.setAutor("Diego Velasco");
            cr.setDescripcion("Ejemplo de uso de listas en bucles, registro de personas \n\ty cálculo de la edad e IMC.");
            cr.setFecha("24-may-2017");
            cr.setMateria("Programación II");
            cr.setTitulo("Listas y bucles");
            cr.setUnidad(Unidad.UnidadI);
            cr.Mostrar();
            
            //Número de elementos en la lista
            System.out.print("Ingrese el número de personas...");
            int limite = sc.nextInt();
            
            int in = 0;
            String str = "";
            float flo = 0f;
            
            List<Persona> personas =  new ArrayList<>();
                        
            for (int i = 1; i <= limite; i++) {
                System.out.println("\nDatos de la persona " + i);
                Persona p = new Persona();
                
                System.out.print("Nombre: ");
                str = br.readLine();
                p.setNombre(str);
                                
                System.out.print("Fecha [dd/mm/yyyy]: ");
                str = br.readLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar fecha = Calendar.getInstance();
                fecha.setTime(sdf.parse(str));
                p.setNacimiento(fecha);
                                
                System.out.print("Peso [kgs]: ");
                flo = sc.nextFloat();
                p.setPeso(flo);
                
                System.out.print("Estatura [cms]: ");
                in = sc.nextInt();
                p.setEstatura(in);                
                
                personas.add(p);
            }
            
            System.out.println("\n=================================================================================================================");
            System.out.println("\t\t\t\tResultados");
            System.out.println("=================================================================================================================");
            System.out.println("Nombre\t\tFec.nacimiento\t\tEdad\t\tEstatura\tPeso\t\tIMC");
            System.out.println("=================================================================================================================");
            for(Persona p:personas){                
                p.Mostrar();
            }
            System.out.println("=================================================================================================================");
            System.out.println();
            
            
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido: " + e.getMessage());
        }
    }
    
}
