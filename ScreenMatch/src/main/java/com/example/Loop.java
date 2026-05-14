package com.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Diga sua avaliação para o filme: (0-5 estrelas)");
            nota = sc.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Média de avaliações " +mediaAvaliacao/3);
    }
}
