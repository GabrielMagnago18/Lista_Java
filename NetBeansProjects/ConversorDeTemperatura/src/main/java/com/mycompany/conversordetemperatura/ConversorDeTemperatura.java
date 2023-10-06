package com.mycompany.conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a opção de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                {
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + " °F");
                    break;
                }
            case 2:
                {
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitParaCelsius(fahrenheit);
                    System.out.println("A temperatura em Celsius é: " + celsius + " °C");
                    break;
                }
            default:
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
                break;
        }

        scanner.close();
    }

    
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }    
}
