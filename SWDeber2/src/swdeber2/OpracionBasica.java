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
public class OpracionBasica {
    
    private int numero_1;
    private int numero_2;
    private float resultado;
    private String o;

    public OpracionBasica(int numero_1, int numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }

    public int getNumero_1() {
        return numero_1;
    }

    public void setNumero_1(int numero_1) {
        this.numero_1 = numero_1;
    }

    public int getNumero_2() {
        return numero_2;
    }

    public void setNumero_2(int numero_2) {
        this.numero_2 = numero_2;
    }
    public void Ejecutar(int opcion){
        switch(opcion){
            case 1:
                resultado = numero_1 + numero_2;
                o="suma";
            break;
            case 2:
                resultado = numero_1 - numero_2;
                o="resta";
            break;
            case 3:
                resultado = numero_1 * numero_2;
                o="multiplicacion";
            break;
            case 4:
                if(numero_1>numero_2){
                    resultado = numero_1/numero_2;
                }else{
                    resultado= numero_2/numero_1;
                }
                o="division";
            break; 
    }
        
    }
     public void mostrar(){
         System.out.println("El resultado de " +o+" es: "+resultado);
     }

       

   
}
