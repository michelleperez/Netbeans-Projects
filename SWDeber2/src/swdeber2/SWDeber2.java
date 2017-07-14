/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber2;

/**
 *
 * @author michelle
 */
public class SWDeber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caratula car = new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS","MICHELLE PÈREZ",1, 2,"Ejercicio de utilizacion del Switch");
        car.mostrarCaratula();
        
        OpracionBasica op = new OpracionBasica(140,6);
        op.Ejecutar(1);
        op.mostrar();
        OpracionBasica op1 = new OpracionBasica(140,6);
        op1.Ejecutar(2);
        op1.mostrar();
        OpracionBasica op2 = new OpracionBasica(140,6);
        op2.Ejecutar(3);
        op2.mostrar();
        OpracionBasica op3 = new OpracionBasica(140,6);
        op3.Ejecutar(4);
        op3.mostrar();
        
        
        
    }
    
}
