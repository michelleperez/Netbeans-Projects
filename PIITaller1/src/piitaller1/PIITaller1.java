package piitaller1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PIITaller1 {

    //Crear un objeto para cada clase: scanner, inputStreamReader y BufferedReader.
    private static Scanner sc = new Scanner(System.in);
    private static InputStreamReader isr = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(isr);

    public static void main(String[] args) {
        try {
            Caratula cr = new Caratula();
            cr.setAutor("Michelle Pérez");
            cr.setDescripcion("Este programa nos crea una cuenta bancaria, nos pide datos \n        del titula y el tipo de cuenta, se puede hacer transacciones de retiro \n        y deposito. Nos imprime los movimientos que se han realizado en la cuenta.");
            cr.setFecha("29/may/2017");
            cr.setMateria("Programación II");
            cr.setTitulo("Utilización de ArrayList");
            cr.setUnidad(Unidad.UnidadII);
            cr.Mostrar();
            
            //Inicializar variables de tipo string, double y byte para la lectura de datos por teclado.
            String str = "";
            double dou = 0;
            byte op = 0;
            
            //Instanciar un objeto t para la clase titular y un objeto para la clase c.
            Titular t = new Titular();
            Cuenta c = new Cuenta();
            System.out.println();
            System.out.println("Crear nueva cuenta");
            
            //Obtner los datos por teclado y guardarlos en las variables antes inicializadas
            System.out.print("Nombre del titular: ");
            str = br.readLine();
            t.setNombre(str);
            
            System.out.print("Cédula del titular: ");
            str = br.readLine();
            t.setCedula(str);
            
            System.out.print("Número de cuenta: ");
            str = br.readLine();
            c.setNumero(str);
            
            System.out.println("Seleccione el tipo de cuenta");
            System.out.println("1. Ahorros");
            System.out.print("2. Corriente...");
            //Realizamos un Switch para saber si desea una cuenta de ahorros o de corriente. 
            op = sc.nextByte();
            switch(op){
                case 1:
                    c.setTipo(TipoCuenta.Ahorros);
                    break;
                case 2:
                    c.setTipo(TipoCuenta.Corriente);
                    break;
                default:
                    c.setTipo(TipoCuenta.NA);
                    break;
            }
            
            c.setTitular(t);
            
                        
            op = 0; //Se vuelve a inicializar la variable op, para que no exista errores al utilizarla, es decir no vote datos basura.
            //Aqui tenemos un do while en donde se repite mientras op sea diferente a op=3, por que si es op es igual a 3 sale del bulce do-while.
            do{
                System.out.println("\nSeleccione el tipo de transacción");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.print("3. Salir...");
                op = sc.nextByte();                             
                
                //Tenemos un Switch dependiendo si la opcion seleccionada es uno para depositar y llamamos al método Depositar de la clase cuenta, 
                //además le mandamos el parametro monto, que lo leemos por teclado.Y el caso 2 es para retirar,leemos el monto lo enviamos y llamamos
                //al método Retirar de la clase Cuenta.
                switch(op){
                    case 1:
                        System.out.print("\nIngrese el monto: ");
                        dou = sc.nextDouble();
                        c.Depositar(dou);                        
                        break;                    
                    case 2:                        
                        System.out.print("\nIngrese el monto: ");
                        dou = sc.nextDouble();
                        c.Retirar(dou);
                        break;
                }                
            }
            while(op != 3);
            
            c.Mostrar();            
            c.ImprimirDetalle();
            
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido" + e.getMessage());
        }
    }    
}