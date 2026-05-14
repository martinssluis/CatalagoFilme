package com.example;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu filme favorito:");
        String filme = sc.nextLine();

        System.out.print("Qual o ano de lançamento?");
        int anoLancamento = sc.nextInt();

        System.out.print("Diga sua avaliação para o filme: (0-5 estrelas)");
        double avaliacao = sc.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);

        sc.close();
    }
}
