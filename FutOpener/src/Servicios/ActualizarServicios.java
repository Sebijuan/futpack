/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Beans.Usuario;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import Controlador.ControladorActualizar;
import static Servicios.Basedatos.CerrarConexion;
import static Servicios.Basedatos.Conectar;
import static Servicios.Basedatos.EjecutarUpdate;

/**
 *
 * @author Sebi
 */
public class ActualizarServicios {
    
    
    public ArrayList<Usuario> ActualizarUsuarios(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ResultSet resultado = Basedatos.EjecutarSentencia("SELECT * FROM usuario");
		try {
			while(resultado.next()) {
                           
				String usuario = resultado.getString("usuario");
				String contraseña = resultado.getString("contraseña");
				String correo = resultado.getString("correo");
                              
				usuarios.add(new Usuario(usuario,contraseña ,correo));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuarios;
	}
    
    
     public void UpdateUsuario(String usuario1,String contraseña , String correo) throws SQLException{
             String query = "UPDATE usuario SET Contraseña = '" + contraseña + "', Correo = '" + correo + "' WHERE Usuario = '" + usuario1 + "'";

               
             try{
                   Conectar();
                    EjecutarUpdate(query);
                    CerrarConexion();

             }catch (SQLException e){
                   e.printStackTrace();
            throw new SQLException(e.getMessage());

             }
       
     
        }
}
  

