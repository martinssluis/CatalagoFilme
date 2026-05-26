package com.example;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracoesMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}