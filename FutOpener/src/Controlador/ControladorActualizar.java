/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Beans.Usuario;

import java.sql.SQLException;
import java.util.ArrayList;
import Servicios.ActualizarServicios;

/**
 *
 * @author Sebi
 */
public class ControladorActualizar {
   private ActualizarServicios actualizarServicios;



 public ControladorActualizar(){
    this.actualizarServicios = new ActualizarServicios();
}

public ArrayList<Usuario> ActualizarUsuarios(){
    return actualizarServicios.ActualizarUsuarios();
}

}
