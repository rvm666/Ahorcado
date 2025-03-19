package org.example.dao;

import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Elementos {
    private final List<Elemento> listaElementos;

    public Elementos(List<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }

    public Elementos(){
        this.listaElementos = new ArrayList<Elemento>();

        Random random = new Random();
        String categoria = "movies";
        for ( int i = 0; i <5; i++){
            listaElementos.add(new Elemento());
        }
        categoria = "personajesTHeBigBangTHeory";
        for (int i = 0; i <5; i++){
          //  listaElementos.add(new Elemento(String.valueOf(random.nextInt())));
        }
    }

    public List<Elemento> getListaElementos(){
        return listaElementos;
    }

    public void vaciarListaElementos(List<Elemento> listaElementos){
        listaElementos.clear();
        this.listaElementos.addAll(listaElementos);
    }

    @Override
    public String toString() {
        return "Elementos{" +
                "listaElementos=" + listaElementos +
                '}';
    }
}
