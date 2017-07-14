/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swexamen1;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author michelle
 */
public class Examen {
    private String nombre;
    private Calendar fecha_nacimiento;
    private Calendar fecha_actual;
    private List<Registro> registros ;

    public Examen() {
       fecha_actual = Calendar.getInstance();
       registros= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Calendar getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(Calendar fecha_actual) {
        this.fecha_actual = fecha_actual;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }
    
    public void MostrarValoresExamen(){
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
         DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
         LocalDate fechaNac = LocalDate.parse(sdf.format(fecha_nacimiento.getTime()),fmt);
         LocalDate ahora = LocalDate.now();
         Period periodo = Period.between(fechaNac, ahora);
         int years = periodo.getYears();
         System.out.println("==============================================================");
         System.out.println("Fecha d:\t\t" + ahora);
         System.out.println("Nombre del paciente: \t\t"+this.nombre+"\t\tEdad:\t"+years);
         System.out.println("==============================================================");
         
         
    }
    public void ResultadoQumica(double resultado_medico,int opc){
        
        switch(opc){
        case 1:{
            if(resultado_medico< 40 && resultado_medico>1 ){
            Registro r = new Registro(resultado_medico,TipoResultado.Glucosa,"75-115 mmg/dl","Hipoglicemia");
             registros.add(r);
             }else if(resultado_medico<75 && resultado_medico>39){
                Registro r = new Registro(resultado_medico,TipoResultado.Glucosa,"75-115 mmg/dl","Bajao en azúcar");
             registros.add(r);
            }else{
                 Registro r = new Registro( resultado_medico,TipoResultado.Glucosa,"75-115 mmg/dl","Diabetes");
             registros.add(r);
            }
       
        }break;
        case 2:{
            if(resultado_medico>200){
             Registro r = new Registro( resultado_medico,TipoResultado.Colesterol,"hasta 200 mmg/dl","Alto en colesterol");
             registros.add(r);
            }
            
        }break;
        case 3:{
            if(resultado_medico>150){
                 Registro r = new Registro( resultado_medico,TipoResultado.Triglicéridos,"hasta 150 mmg/dl","Alto en triglicéridos");
             registros.add(r);
            }
            
        }break;
        case 4:{
            if(resultado_medico<0.6 && resultado_medico >0){
                 Registro r = new Registro( resultado_medico,TipoResultado.Creatinina,"0.6 - 1.1 mmg/dl","Pérdida masa muscular");
             registros.add(r);
            }else if(resultado_medico>1.1){
                 Registro r = new Registro( resultado_medico,TipoResultado.Creatinina,"0.6-1.1 mmg/dl","Deficiencia en los riñones");
             registros.add(r);
            }
            
        }break;
    }
        
    }
        public void MostrarRegistros(){
        System.out.println("\n=================================================================================================================");
        System.out.println("\t\t\tRegistros");
        System.out.println("=================================================================================================================");        
        System.out.println("\tTipo\t\tmg/dl\t\tReferencia\t\tEvaluación");        
        System.out.println("=================================================================================================================");        
        for(Registro r:this.registros){
             System.out.print("\t" + r.getTipo_resultado());
            System.out.print("\t\t" + r.getResultado_medico());
            System.out.print("\t\t" + r.getReferencia());
            System.out.print("\t\t"+r.getEvaluacion());
           
        }
        System.out.println("\n=================================================================================================================");        
    }
    


}
