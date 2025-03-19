package org.example.ui;

import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a mostrar el diccionario");
        GestionElementos ge = new GestionElementosImplementacion();
    }

}

