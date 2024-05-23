/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Servicios.Basedatos;
import Vista.Video;
import Vista.Registrar;
import Vista.Inicio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // Crear una instancia del JFrame Inicio
      
        Basedatos.Conectar();
        
        Inicio inicio= new Inicio();
      inicio.setVisible(true);
      inicio.setSize(1200,700);
      inicio.setLocationRelativeTo(null);
    

    
  

        // Lectura del archivo
        try (BufferedReader lector = new BufferedReader(new FileReader("C:\\Users\\Sebi\\Downloads\\leer.txt"))) {
            String linea;
            int contador = 0;
            while ((linea = lector.readLine()) != null) {
                contador++;
                System.out.println(contador + "\t" + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Lectura finalizada.");

        // Escritura en el archivo
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("C:\\Users\\Sebi\\Downloads\\escribir.txt"))) {
            for (int i = 0; i < 1; i++) {
                String linea = i + ". Buenas Maquina eres un gran alumno\n";
                escritor.write(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

        System.out.println("Escritura finalizada.");
    
    
    
    
    
    
    
    
    }
    
    
      
      
    
     
    
    
    
    
      
      
    }
    
    
       
    



        

    
 
    
    
    

