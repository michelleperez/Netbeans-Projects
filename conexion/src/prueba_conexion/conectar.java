/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author michelle
 */
public class conectar {
    Connection con=null;
    Statement st;
    public Connection conexion(){
        try{
            //Cargar nuestro driver
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/LigaSanJuanito","root","191196");
            System.out.println("conexion establecida");
            JOptionPane.showMessageDialog(null, "conexion establecida");
        }catch (ClassNotFoundException | SQLException e){
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "erro de conexion"+e);
        }
        return con;
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}