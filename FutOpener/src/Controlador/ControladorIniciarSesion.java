/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Servicios.InicioServicios;

/**
 *
 * @author Sebi
 */
public class ControladorIniciarSesion {
    private InicioServicios inicioServicios;

    public ControladorIniciarSesion() {
       inicioServicios = new InicioServicios();
    }
    


public boolean ConfirmarIniciarSesion(String usuario, String contraseña, String correo){
    return inicioServicios.ConfirmarIniciarSesion(usuario, contraseña, correo);
}





}




