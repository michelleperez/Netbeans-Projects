
package swejercicio3;

/**
 *
 * @author labctr
 */
public class SWEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cuadrado cua = new Cuadrado(5);
        cua.mostrar();
        Rectangulo r = new Rectangulo(6,5);
        r.mostrar();
        Triangulo t = new Triangulo(10,5);
        t.mostrar();
        Circulo c = new Circulo( (float) 2.5);
        c.mostrar();
    }
    
}
