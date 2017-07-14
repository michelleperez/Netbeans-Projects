/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swdeber1;

/**
 *
 * @author michelle
 */
public class SWDeber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caratula car = new Caratula("UNIVERSIDAD DE LAS FUERZAS ARMADAS","Michelle Pérez",1,1,"Implemetacion del ejercicio en clase");
        car.mostrarCaratula();
        Motor mot_1 = new Motor(10000,0);
        
        Vehiculo veh_1 = new Vehiculo ("Ford","EcoSport",2015);
        veh_1.setMotor(mot_1);
        veh_1.Acelerar(1000);
        veh_1.Mostrar();
        
        Motor mot_2 = new Motor(900,300);
        Vehiculo veh_2 = new Vehiculo("Ford2","EcoSport2",2016);
        veh_2.setMotor(mot_2);
        veh_2.Acelerar(1000);
        veh_2.Mostrar();
    }
    
    
}
