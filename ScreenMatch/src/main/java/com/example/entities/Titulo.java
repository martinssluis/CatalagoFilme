package com.example.entities;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracoesMinutos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }


    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public int getDuracoesMinutos() {
        return duracoesMinutos;
    }

    public void setDuracoesMinutos(int duracoesMinutos) {
        this.duracoesMinutos = duracoesMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.printf(
                """
                Nome do Titulo: %s
                Ano de lançamento: %d
                Duração em minutos: %d
                Incluído no plano: $b
                """
                ,nome, anoLancamento, duracoesMinutos, incluidoPlano
        );
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalAvaliacoes;
    }
}
