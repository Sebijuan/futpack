package Beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Beans.Jugador;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sebi
 */
public class Coleccioncartas {
    private List<Jugador> cards;

    public Coleccioncartas() {
        this.cards = new ArrayList<>();
    }

    // Método para agregar una carta a la colección
    public void addCard(Jugador card) {
        cards.add(card);
    }

    // Método para remover una carta de la colección
    public void removeCard(Jugador card) {
        cards.remove(card);
    }

    // Método para obtener la colección de cartas
    public List<Jugador> getCards() {
        return cards;
    }

    // Método para mostrar la colección de cartas
    public void displayCollection() {
        System.out.println("Colección de cartas del usuario:");
        for (Jugador card : cards) {
            System.out.println(card);
        }
    }
}

