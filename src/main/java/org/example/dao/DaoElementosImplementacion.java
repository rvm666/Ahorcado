package org.example.dao;

public class DaoElementosImplementacion implements DaoElementos{
    private Elementos lista;

    public DaoElementosImplementacion(Elementos lista) {
        this.lista = lista;
    }

    public DaoElementosImplementacion(){
        lista = new Elementos();
    }
}
