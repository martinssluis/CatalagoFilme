package com.example.services;

import com.example.entities.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal+= titulo.getDuracoesMinutos();
    }

//    public void inclui(Filme f){
//        tempoTotal+= f.getDuracoesMinutos();
//    }
//
//    // sobrecarga para aceitar tanto filme como serie
//    public void inclui(Serie s){
//        tempoTotal+= s.getDuracoesMinutos();
//    }
}
