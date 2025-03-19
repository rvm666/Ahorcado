package org.example.service;

import org.example.dao.DaoElementos;
import org.example.dao.DaoElementosImplementacion;

public class GestionElementosImplementacion {
    private DaoElementos daoElementos;

    public GestionElementosImplementacion(DaoElementos daoElementos) {
        this.daoElementos = daoElementos;
    }

    public GestionElementosImplementacion(){
        this.daoElementos = new DaoElementosImplementacion();
    }
}
