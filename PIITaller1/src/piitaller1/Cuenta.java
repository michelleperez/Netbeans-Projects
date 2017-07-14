
package piitaller1;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cuenta {
    private String numero;
    private double saldo;
    private Calendar apertura;
    private TipoCuenta tipo;
    private Titular titular;
    private List<Transaccion> transacciones;

    /**
     *Constructor vacio de la clase Cuenta , dentro del cnstructor se inicializan los atributos.
     * Es decir saldo inicializa en 0 , apertura toma el valor de la fecha, transacciones crea un nuva clase tipo arraylist.
     */
    public Cuenta() {
        this.saldo = 0;
        this.apertura = Calendar.getInstance();
        this.transacciones = new ArrayList<>();
    }    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Calendar getApertura() {
        return apertura;
    }

    public void setApertura(Calendar apertura) {
        this.apertura = apertura;
    }

    public TipoCuenta getTipo() {
        return tipo;
    }

    public void setTipo(TipoCuenta tipo) {
        this.tipo = tipo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    /**
     * Crea un metodo llamado retirar en donde recibe el @param monto a retirar.
     * En el metodo nos dice el monto a retirar, si el monto es menor igual a cero nos imprime un mensaje de monto no válido,
     * si no si el monto es mayor al saldo que se dispone en la cuenta nos imprime un mensajes de no hay saldo suficiente.
     * si no el monto disminuye al saldo e imprime retiro existoso, y nos muestra el saldo actualizado.
     */
    public void Retirar(double monto){
        System.out.println("Inicio de retiro ===> $" + monto);
        if(monto <= 0){
            System.out.println("El monto $" + monto + " no es válido para retirar");    
        }
        else if(monto > saldo){
            System.out.println("No hay saldo suficiente para su retiro de  $" + monto);
        }
        else{
            saldo -= monto;
            System.out.println("Retiro exitoso");
            System.out.printf("Saldo actualizado $%.2f\n" ,saldo);
            
            //Transaccion instancia un objeto t de la clase trasaccion y envia los parametros del constructor de la clase trasaccion
            //suma una trasaccion al tipo arraylist.
            Transaccion t = new Transaccion(Calendar.getInstance(),"Retiro de $" + monto, monto, saldo, TipoTransaccion.Retiro);
            transacciones.add(t);
        }
    }
    
    /**
     * Creamos otro método llamado Depositar con un  @param monto donde Nos indica el monto a depositar, si el monto es menor o igual a cero
     * imprime un mensaje de monto no válido para depositar, si no el monto se suma a saldo e imprime depósito exitoso, y nos muestra es saldo actualizado.
     */
    public void Depositar(double monto){
        System.out.println("Inicio de depósito ===> $" + monto);
        if(monto <= 0){
            System.out.println("El monto $" + monto + " no es válido para depositar");                
        }
        else{
            saldo += monto;
            System.out.println("Depósito exitoso");
            System.out.printf("Saldo actualizado $%.2f\n" ,saldo);
            
            //Se instancia un nuevo obejto t de la clase transaccion y se envian los parametros a su contructor.
            Transaccion t = new Transaccion(Calendar.getInstance(),"Depósito de $" + monto, monto, saldo, TipoTransaccion.Deposito);
            transacciones.add(t);
        }       
    }
    
    /**
     *Se crea un metodo mostrar el cual va mostrar en pantalla la información(cuenta,titular,cédula,tipo de cuenta,la echa de apertura y el saldo actual.)
     * ademas creamos un objeto de SimpleDateFormat para obtener la fecha de la computadora.
     */
    public void Mostrar(){        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("\n=================================================================================================================");
        System.out.println("\t\t\tCuenta:" + numero);
        System.out.println("=================================================================================================================");        
        System.out.println("\tTitular:\t\t" + titular.getNombre());
        System.out.println("\tCédula:\t\t" + titular.getCedula());
        System.out.println("\tTipo:\t\t" + tipo);
        System.out.println("\tFecha de apertura:\t\t" + sdf.format(apertura.getTime()));
        System.out.printf("\tSaldo actual:\t\t$%.2f\n", saldo);        
        System.out.println("=================================================================================================================");
        System.out.println();        
    }
    
    /**
     *Se crea un método MostrarTransacciones, en donde instaciamos un objetos sdf de la clase SimpleDateFormat.
     * Se muestra en pantalla los datos que le mandamos a imprimircon un print, los datos son: Fecha,descripción, monto, tipo y el saldo.
     * Los datos de las transacciones se muestran mediante un for ya que anteriormente las guardamos en en un arraylist llamado transacciones.
     */
    public void ImprimirDetalle(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("\n=================================================================================================================");
        System.out.println("\t\t\tTransacciones");
        System.out.println("=================================================================================================================");        
        System.out.println("\t\t\tDescripción\t\tMonto\t\tTipo\t\tSaldo");        
        System.out.println("=================================================================================================================");        
        for(Transaccion t:this.transacciones){
            System.out.print("\t" + sdf.format(t.getFecha().getTime()));
            System.out.print("\t" + t.getDescripcion());
            System.out.print("\t$" + t.getMonto());
            System.out.print("\t\t" + t.getTipo());
            System.out.printf("\t$%.2f\n", t.getSaldo());        
        }
        System.out.println("=================================================================================================================");        
    }
    
}
