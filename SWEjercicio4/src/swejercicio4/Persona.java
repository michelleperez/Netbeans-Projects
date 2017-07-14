/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio4;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


/**
 *
 * @author labctr
 */
public class Persona {
    private String nombre;
    private String cedula;
    private Calendar nacimiento;
    private char genero;
    private int estatura;
    private float peso;

    public Persona() {
    }
    //SOBRECARGA DEL CONSTRUCTOR CUANDO UN METODO TIENE VARIOS PARAMETROS
 /*   public Persona(String n) {
        this.nombre = n;
    }

    public Persona(String n, String c) {
        this.nombre = n;
        this.cedula = c;
    }

    public Persona(String n, String c, Date nac) {
        this.nombre = n;
        this.cedula = c;
        this.nacimiento = nac;
    }*/

    public Persona(String nombre, Calendar nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public Persona(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public Persona(String nombre, int estatura) {
        this.nombre = nombre;
        this.estatura = estatura;
    }

    public Persona(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
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
   
    public void mostrar (){
        SimpleDateFormat sf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("*La persona "+this.nombre);
        System.out.print(" de cédula: "+this.cedula);
        System.out.println(" Nació el "+sf.format(this.nacimiento.getTime()));
        System.out.print(" su género es "+this.genero);
        System.out.print(" tiene una estatura de "+this.estatura+" cm");
        System.out.println(" y pesa "+this.peso+" kg");
                
    }
    
    public void CalcularIMC(){
        float esM = this.estatura/100f;//Estatura en m
        float imc=this.peso/(esM*esM);
        if(imc<18.8f){
            System.out.println("Su peso es inferior al normal");
           }else if(imc>25f && imc<29.9f){
               System.out.println("SU peso es superior al normal");
            }else if(imc>30f){
                System.out.println("Eres obeso");
            }else{
                System.out.println(" Su peso es normal");
            }
    }
    public void identificacion(){
        
        String codigo = cedula.substring(0,2);
        switch(codigo){
        case "01":
           System.out.println("Y es de Azuay");
        break;
        case "02":
            System.out.println("Y es de Bolivar");
        break;
        case "03":
            System.out.println("Y es de Cañar");
        break; 
        case "04":
           System.out.println("Y es de Carchi");
        break;
        case "05":
            System.out.println("Y es de Cotopaxi");
        break;
        case "06":
            System.out.println("Y es de Chimborazo");
        break;   
        case "07":
           System.out.println("Y es de El Oro");
        break;
        case "08":
            System.out.println("Y es de Esmeraldas");
        break;
        case "09":
            System.out.println("Y es de Guayas");
        break;   
        case "10":
           System.out.println("Y es de Imbabura");
        break;
        case "11":
            System.out.println("Y es de Loja");
        break;
        case "12":
            System.out.println("Y es de Los Rios");
        break;   
        case "13":
           System.out.println("Y es de Manabí");
        break;
        case "14":
            System.out.println("Y es de Morona Santiago");
        break;
        case "15":
            System.out.println("Y es de Napo");
        break;   
            case "16":
           System.out.println("Y es de Pastaza");
        break;
        case "17":
            System.out.println("Y es de Pichincha");
        break;
        case "18":
            System.out.println("Y es de Tungurahua");
        break;  
        case "19":
           System.out.println("Y es de Zamora Chinchipe");
        break;
        case "20":
            System.out.println("Y es de Galápagos");
        break;
        case "21":
            System.out.println("Y es de Sucumbios");
        break;   
        case "22":
           System.out.println("Y es de Orellana");
        break;
        case "23":
            System.out.println("Y es de Santo Domingo");
        break;
        case "24":
            System.out.println("Y es de Santa Elena");
        break;       
            
    }
       
    }
 public void calcularEdad(){
     
        
        SimpleDateFormat sf = new SimpleDateFormat("dd/MMM/yyyy");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        
        LocalDate fechaNac = LocalDate.parse(sf.format(this.nacimiento.getTime()),fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        int years = periodo.getYears();
        int months = periodo.getMonths();
        int days = periodo.getDays();
        System.out.println("Su edad es: "+years+" años "+months+" meses "+days+" dias ");
        if(months==0&&days==0){
            System.out.println("FELIZ CUMPLEAÑOS");
        }

        }
    
    
    
}
