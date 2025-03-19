package org.example.dao;

public class DaoElementosImplementacion {
    private Elementos lista;

    public DaoElementosImplementacion(Elementos lista) {
        this.lista = lista;
    }

    public DaoElementosImplementacion(){
        lista = new Elementos();
    }
}
