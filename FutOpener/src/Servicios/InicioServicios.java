/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Beans.Usuario;
import Servicios.Basedatos;
import static Servicios.Basedatos.CerrarConexion;
import static Servicios.Basedatos.Conectar;
import static Servicios.Basedatos.EjecutarSentencia;
import static Servicios.Basedatos.EjecutarUpdate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sebi
 */
public class InicioServicios {

                         public String registrarUsuario(Usuario usuario) {
              // Verificar que los campos no estén vacíos
        if (usuario.getUsuario().isEmpty() || usuario.getContraseña().isEmpty() || usuario.getCorreo().isEmpty()) {
            return "Por favor, complete todos los campos.";
        }
        
        // Verificar que el usuario y el correo no existan ya en la base de datos
        if (usuarioExistente(usuario)) {
            return "El usuario o correo ya existen en la base de datos.";
        }
        
        // Establecer la conexión con la base de datos
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Futopener?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "")) {
            // Preparar la consulta SQL para insertar el usuario
            String sqlInsertar = "INSERT INTO usuario (usuario, contraseña, correo) VALUES (?, ?, ?)";
            try (PreparedStatement pstmtInsertar = conexion.prepareStatement(sqlInsertar)) {
                // Establecer los valores en la consulta preparada
                
                pstmtInsertar.setString(1, usuario.getUsuario());
                pstmtInsertar.setString(2, usuario.getContraseña());
                pstmtInsertar.setString(3, usuario.getCorreo());
                
                
                // Ejecutar la consulta de inserción
                int filasAfectadas = pstmtInsertar.executeUpdate();

                // Si se afectó al menos una fila, se considera un registro exitoso
                if (filasAfectadas > 0) {
                    return "Usuario registrado exitosamente";
                } else {
                    return "Error al registrar el usuario.";
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción ocurrida durante el proceso
            
            return "Error de conexión con la base de datos."; // Devolver mensaje de error
        }
    }
    
    // Método para verificar si un usuario o correo ya existen en la base de datos
    private static boolean usuarioExistente(Usuario usuario) {
        try (Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Futopener?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "")) {
            String sqlVerificar = "SELECT COUNT(*) AS total FROM usuario WHERE usuario = ? OR correo = ?";
            try (PreparedStatement pstmtVerificar = conexion.prepareStatement(sqlVerificar)) {
                pstmtVerificar.setString(1, usuario.getUsuario());
                pstmtVerificar.setString(2, usuario.getCorreo());
                ResultSet rs = pstmtVerificar.executeQuery();

                if (rs.next()) {
                    int total = rs.getInt("total");
                    return total > 0;
                }
            }
        } catch (SQLException e) {
           
        }
        return false;
    }
    
   
    public boolean ConfirmarIniciarSesion(String usuario, String contraseña, String correo){
        boolean resultado = false;
        
        try{
            String consulta = "SELECT Usuario, Contraseña, Correo FROM usuario WHERE Usuario='"+ usuario+"'AND Contraseña='" + contraseña+"'AND Correo='"+correo+"';" ;
            
            
            ResultSet rs = Basedatos.EjecutarSentencia(consulta);
            resultado = rs.next();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error en la consulta de usuarios");
        }
        return resultado;
    }
    
    
         
    
    
    
    
    
    
    
    
    
             
    
    
    
    
    
                public void  eliminarUsuarioBD(String ID_Usuario) throws SQLException {
        String consulta = "DELETE FROM usuario ORDER BY ID_Usuario DESC LIMIT 1;";

        try {
            Basedatos.EjecutarUpdate(consulta);
            JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente.");
           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al eliminar usuario: " + e.getMessage());
           
        }
    }
    
   
                
                
           
       
                
    
public void updateUsuario(String usuario, String newUsuario, String newContraseña) throws SQLException{
    String query = "UPDATE usuario SET Usuario = '" + newUsuario + "', Contrasena = '" + newContraseña + "' WHERE Usuario = '" + usuario + "'";
      
    try{
       Conectar();
        EjecutarUpdate(query);
        CerrarConexion();
        
    }catch(SQLException e){
        System.out.println(query);
         e.printStackTrace();
          throw new SQLException(e.getMessage());

    }
}
 




}

    
  
        



    
    



























   

