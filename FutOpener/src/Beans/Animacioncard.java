package Beans;


import Beans.Jugador;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebi
 */
public class Animacioncard {
    // Método para simular la animación de apertura de un sobre de cartas
    public void openPackAnimation(List<Jugador> cards) {
        System.out.println("¡Abriendo sobre de cartas!");
        System.out.println("...");

        // Simular la animación mostrando cada carta
        for (int i = 0; i < cards.size(); i++) {
            System.out.println("Carta " + (i + 1) + ": " + cards.get(i));
            // Puedes agregar un pequeño retraso aquí para simular una animación más realista
            try {
                Thread.sleep(1000); // Espera 1 segundo entre cada carta
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("¡Sobre abierto!");
    }
}

