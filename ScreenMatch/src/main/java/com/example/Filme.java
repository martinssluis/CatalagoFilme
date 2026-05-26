package com.example;

public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoPlano;
    double somaAvaliacoes;
    int totalAvaliacoes;
    int duracoesMinutos;

    void exibeFichaTecnica(){
        System.out.println(String.format(
                """
                Nome do filme: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Incluído no lano: $b
                """
                ,nome, anoLancamento, duracoesMinutos, incluidoPlano)
        );
    }

        void avalia(double nota) {
            somaAvaliacoes += nota;
            totalAvaliacoes++;
        }

    double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
