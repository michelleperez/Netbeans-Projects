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
public class Motor {
    private int limiteRpm;
    private int rpmactual;

    public Motor(int limiteRpm, int rpmactual) {
        this.limiteRpm = limiteRpm;
        this.rpmactual = rpmactual;
    }

    public int getLimiteRpm() {
        return limiteRpm;
    }

    public void setLimiteRpm(int limiteRpm) {
        this.limiteRpm = limiteRpm;
    }

    public int getRpmactual() {
        return rpmactual;
    }

    public void setRpmactual(int rpmactual) {
        this.rpmactual = rpmactual;
    }
    
    public void VariarRPM(int rpm, boolean acelerar){
        if(acelerar == true){
            rpmactual+=rpm;
            if(rpmactual>limiteRpm){
                System.out.println("Rpm maxima , el motor se ha fundido");
            }else{
             System.out.println("Motor en buen estado");
         }
           
        }else{
            rpmactual = rpmactual-rpm;
            if(rpmactual<=0){
                rpmactual =0;
            }
        }
    }

    
}
