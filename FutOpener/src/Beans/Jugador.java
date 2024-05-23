package Beans;


import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebi
 */
public class Jugador {
    private int id_jugador;
     private String nombre;
     private String apellido;
     private String nombre_equipo;
     private int valoracion;

    // Constructor

    public Jugador(int id_jugador,String nombre, String apellido ,int valoracion,String nombre_equipo) {
        this.id_jugador= id_jugador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombre_equipo = nombre_equipo;
        this.valoracion = valoracion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNombre_Equipo() {
        return nombre_equipo;
    }

    public void setNombre_Equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

   public int getid_jugador(){
       return id_jugador;
   }
   public void setid_equipo(int id_equipo){
       this.id_jugador= id_jugador;
   }

    // Método hashCode para generar un código hash único para el jugador
    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, valoracion,nombre_equipo);
    }

    @Override
    public String toString() {
        return "Jugador{" + "id_jugador=" + id_jugador + ", nombre=" + nombre + ", apellido=" + apellido + ", nombre_equipo=" + nombre_equipo + ", valoracion=" + valoracion + '}';
    }
    
}



