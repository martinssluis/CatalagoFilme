package com.example.Principal;

import com.example.entities.Filme;
import com.example.entities.Serie;
import com.example.entities.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoPaulo; // variavel de referencia, tanto filmeDoPaulo e f1 apontam para o mesmo objeto na memoria

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

//        lista.forEach(item-> System.out.println(item));
//        lista.forEach(System.out::println);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof  Filme filme && filme.getClassificacao() >2){
                System.out.println("Classigicação " + filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: "+ buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de Titulos ordenados: "+lista);
    }
}
