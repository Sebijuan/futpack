/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicios.ActualizarServicios;
import Servicios.TablaServicios;
import java.sql.SQLException;

/**
 *
 * @author Sebi
 */
public class ControladorUpdate {
    private ActualizarServicios actualizarServicios;
    
    
    
    
    public ControladorUpdate(){
        this.actualizarServicios = new ActualizarServicios();
    }

   
    public void UpdateUsuario(String usuario1,String contraseña , String correo) throws SQLException{
        actualizarServicios.UpdateUsuario( usuario1,contraseña,correo);
    }


}



