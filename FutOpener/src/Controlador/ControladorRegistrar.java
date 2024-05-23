/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Beans.Usuario;
import Vista.Registrar;
import Servicios.Basedatos;
import Vista.Inicio;
import Servicios.InicioServicios;
/**
 *
 * @author Sebi
 */
public class ControladorRegistrar {
 private Registrar vista;
 private InicioServicios inicioServicios;
 

    public ControladorRegistrar() {  
       this.inicioServicios= new InicioServicios();
      
    }
    
    
   
    
    
    
    

    
// Método para establecer la referencia a la vista
    public void setVista(Registrar vista) {
        this.vista = vista;
    }
    
    
   // Método para registrar un usuario en la base de datos
    public String registrarUsuario(String usuario, String contraseña, String correo) {
        // Llamar al método de servicios para registrar el usuario en la base de datos
        return inicioServicios.registrarUsuario(new Usuario(usuario, contraseña, correo));
    }

   
     
     
     
}
   

       
    


