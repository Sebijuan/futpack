/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Beans.Jugador;
import Servicios.TablaServicios;
import Vista.ColeccionCartas;
import Vista.Menu;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebi
 */
public class ControladorColeccionCartas {
private TablaServicios tablaservicios;
    
    public ControladorColeccionCartas(){
       tablaservicios = new TablaServicios();
    }
    
    public ArrayList<Jugador> recogerTodosJugadores() {
        // Llamar a servicio para recoger los datos de la bbdd
        return tablaservicios.recogerTodosJugadores();
        
    }
   
    
    
}


