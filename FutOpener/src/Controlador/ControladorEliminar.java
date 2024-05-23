/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Beans.Usuario;
import Servicios.InicioServicios;
import java.sql.SQLException;

/**
 *
 * @author Sebi
 */
public class ControladorEliminar {
     private InicioServicios inicioservicios;

    public ControladorEliminar() {
        this.inicioservicios = new InicioServicios();
    }
    
   public void eliminarUltimoUsuario(String ID_Usuario) throws SQLException {
         inicioservicios.eliminarUsuarioBD(ID_Usuario);
    }
}
