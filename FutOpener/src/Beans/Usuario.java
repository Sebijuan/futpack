package Beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.lang.String;

/**
 *
 * @author Sebi
 */


public class Usuario {
   
   String usuario;
   String contraseña;
   String correo;

    
    public Usuario( String usuario, String contraseña, String correo ) {
         
         this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }
    

    

    
   
    
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contraseña=" + contraseña + ", correo=" + correo +  '}';
    }
    
    
    
    
}

