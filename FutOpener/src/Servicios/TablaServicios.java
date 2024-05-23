/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Beans.Coleccioncartas;
import Beans.Jugador;
import Beans.Usuario;
import static Servicios.Basedatos.CerrarConexion;
import static Servicios.Basedatos.Conectar;
import static Servicios.Basedatos.EjecutarUpdate;
import Vista.ColeccionCartas;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Sebi
 */
public class TablaServicios {
    
	
	
	public ArrayList<Jugador> recogerTodosJugadores(){
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		ResultSet resultado = Basedatos.EjecutarSentencia(" SELECT j.ID_Jugador,j.Nombre,j.Apellido,j.Valoracion,e.Nombre_Equipo FROM jugador j JOIN equipo e ON j.ID_Equipo=e.ID_Equipo;");
		try {
			while(resultado.next()) {
				int id_jugador = resultado.getInt("id_jugador");
				String nombre = resultado.getString("nombre");
				String apellido = resultado.getString("apellido");
                                int valoracion= resultado.getInt("valoracion");
                                String nombre_equipo= resultado.getString("nombre_equipo");
				jugadores.add(new Jugador(id_jugador, nombre, apellido, valoracion,nombre_equipo));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugadores;
	}
    
  
        
       

        
        
        
        
        
}
