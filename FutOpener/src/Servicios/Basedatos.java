/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Main.Main;
import Beans.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Sebi
 */
public class Basedatos {
    static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbName = "Futopener";
	static String url = "jdbc:mysql://localhost:3306/" + dbName + timeZone;
	static String usuario = "root";
	static String pass = "";
	static String driver = "com.mysql.cj.jdbc.Driver";
        
     static Connection conexion;
    static Statement consulta;
    static ResultSet resultado; 
    
    public static void Conectar(){
    	try {
           Class.forName(driver) ;
           conexion = DriverManager.getConnection(url, usuario, pass);
           System.out.println("Base de datos clientes.fdb situada en :\n "+url);
           consulta = conexion.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static ResultSet EjecutarSentencia(String Sentencia){
        try {
        	resultado = consulta.executeQuery(Sentencia);
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return resultado;
    }
      
    public static void EjecutarUpdate(String Sentencia) throws SQLException{
    	try{
    		consulta.executeUpdate(Sentencia);
    		System.out.println("Ejecutado.");
    	}catch(SQLException e){
    		//JOptionPane.showMessageDialog(null, e.getMessage());
    		throw new SQLException("");
    	} 
    }
    
    public static void CerrarConexion(){
        try{
        	consulta.close();
        }catch(Exception e){}
    }
     

                               
                    
                    
                    
                    
          
           
    }

    
    
    


    

