package conexion;

import java.sql.*;

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
