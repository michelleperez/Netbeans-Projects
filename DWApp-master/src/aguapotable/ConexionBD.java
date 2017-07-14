
package aguapotable;
import java.sql.*;
import javax.swing.JOptionPane;
public class ConexionBD {
    Connection cn;
     
    public Connection conexion(){
       try{
            //Cargar nuestro driver
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DWABDD","root","191196");
            System.out.println("conexion establecida");
            JOptionPane.showMessageDialog(null, "conexion establecida");
        }catch (Exception e){
           System.out.println(e.getMessage());
        }
        return cn;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
