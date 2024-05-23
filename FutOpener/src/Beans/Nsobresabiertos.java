package Beans;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sebi
 */
public class Nsobresabiertos {
    private int openedPacksCount;

    public Nsobresabiertos() {
        this.openedPacksCount = 0;
    }

    // Método para incrementar el contador de sobres abiertos
    public void incrementOpenedPacksCount() {
        openedPacksCount++;
    }

    // Método para obtener el número actual de sobres abiertos
    public int getOpenedPacksCount() {
        return openedPacksCount;
    }
}

