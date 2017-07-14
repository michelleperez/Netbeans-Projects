/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swejercicio8;
import java.util.Calendar;
import util.perez.*;
/**
 *
 * @author michelle
 */
public class SWEjercicio8 {
    private static util utl = new util();

    
    public static void main(String[] args) {
        try {
            Calendar date = Calendar.getInstance();
            date.set(2017,Calendar.JUNE,22);
            Unit unidad = Unit.II;
            utl.setDate(date);
            utl.setUnit(unidad);
            utl.setDescription("Implementación de Interfaces con UML");
            utl.setTitle("Interfaces");
            utl.setNumber((byte)8);
           
            //Instanciar cuadrado
             Cuadrado cua = new Cuadrado();
            utl.Println("Ingresar datos cuadrado");
            cua.setLado(utl.ReadFloat("Lado: "));
            cua.CalcularArea();
            cua.CalcularPerimetro();
            
            //Instanciar rectángulo
            Rectangulo rect= new Rectangulo();
            utl.Println("Ingresar datos rectangulo");
            rect.setAltura(utl.ReadFloat("Altura: "));
            rect.setBase(utl.ReadFloat("Base: "));
            rect.CalcularArea();
            rect.CalcularPerimetro();
            
            //Instanciar Círculo
            
            Circulo cir = new Circulo();
            utl.Println("Ingresa datos de círculo");
            cir.setRadio(utl.ReadFloat("Radio: "));
            cir.CalcularArea();
            cir.CalcularPerimetro();
            
            //Imprimir
            utl.PrintHeader();
            cua.Mostrar();
            rect.Mostrar();
            cir.Mostrar();
            utl.PrintFooter();
            
        } catch (Exception e) {
        }
    }
    
}
