
package com.mycompany.verificarnumerointeiro;

import java.util.Scanner;

public class VerificarNumeroInteiro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            System.out.println(numero + " é um número inteiro.");
        } else {
            String input = scanner.next();
            System.out.println("\"" + input + "\" não é um número inteiro.");
        }

        scanner.close();
    }

}

