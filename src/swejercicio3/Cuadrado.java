
package swejercicio3;

/**
 *
 * @author labctr
 */
public class Cuadrado {
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    public int calcularArea(){
        return lado* lado;
    }
    public int calcularPerimetro(){
        return 4*lado;
    }
    public void mostrar(){
         System.out.println("----------------------------------------");
        System.out.println("      UNIVERSIDAD DE LAS FUERZAR ARMADAS");
        System.out.println("                   ESPE-L");
        System.out.println("Autora: Michelle Pérez        28/04/2017");
        System.out.println("Ejercicio en clase #3");
        System.out.println("----------------------------------------- ");
        System.out.println("");
        System.out.println("El cuadro de lado: " +lado+ " cm");
        System.out.print("Tiene una area de: "+calcularArea()+" cm^2");
        System.out.println(" y su perimetro es: "+calcularPerimetro()+ " cm");
    }
    
}
