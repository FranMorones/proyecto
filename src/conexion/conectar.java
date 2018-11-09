/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;


/**
 *
 * @author Alumno
 */
public class conectar {
   Connection con=null;
   public Connection conexion(){
   try { 
   //cargar nuetro driver
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/proyecto","root","");
    System.out.println("conexion establecida"); 
   }

    catch(ClassNotFoundException | SQLException e){
    System.out.println("error de conexion");
    }
    return con;
   }
   
}
