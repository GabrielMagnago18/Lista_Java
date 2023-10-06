package com.mycompany.conversortempo;

import java.util.Scanner;

public class ConversorTempo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a duração do evento em segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println("Tempo equivalente: " + horas + " horas, " + minutos + " minutos, " + segundosRestantes + " segundos");

        scanner.close();
    }
}
