package piilista;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
    private String nombre;    
    private Calendar nacimiento;
    private int estatura;
    private float peso;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void CalcularIMC(){
        float est = estatura / 100f;
        float imc = peso / (est * est);
        System.out.print(imc);
        if(imc < 18.5f){
            System.out.print(" [Peso inferior al normal]");
        }
        else if(imc > 25f && imc <29.9f){
            System.out.print(" [Peso superior al normal]");
        }
        else if(imc > 30f){
            System.out.print(" [Sobrepeso]");
        }
        else{
            System.out.print(" [Peso normal]");
        }        
    }
        
    public void Mostrar(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.print(nombre);
        System.out.print("\t" + sdf.format(nacimiento.getTime()));
        System.out.print("\t\t" + CalcularEdad() + " años");
        System.out.print("\t\t" + estatura + " cms");
        System.out.print("\t\t" + peso + " kgs\t");    
        CalcularIMC();
        System.out.println();
        
    }
    
    public int CalcularEdad(){        
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        int mes = hoy.get(Calendar.MONTH) - nacimiento.get(Calendar.MONTH);
        int dia = hoy.get(Calendar.DAY_OF_MONTH) - nacimiento.get(Calendar.DAY_OF_MONTH);
        
        if(mes < 0 || dia < 0)
            edad--;                
        
        return edad;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
