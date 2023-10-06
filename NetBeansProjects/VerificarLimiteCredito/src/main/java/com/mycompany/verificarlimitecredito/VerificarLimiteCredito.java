        package com.mycompany.verificarlimitecredito;

import java.util.Scanner;

public class VerificarLimiteCredito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo no início do mês: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o total de itens cobrados no mês: ");
        double totalDespesas = scanner.nextDouble();

        System.out.print("Digite o total de créditos aplicados no mês: ");
        double totalCreditos = scanner.nextDouble();

        System.out.print("Digite o limite de crédito autorizado: ");
        double limiteCredito = scanner.nextDouble();

        
        double novoSaldo = saldoInicial + totalDespesas - totalCreditos;

        System.out.println("Novo saldo: $" + novoSaldo);

        
        if (novoSaldo > limiteCredito) {
            System.out.println("Limite de crédito excedido para a conta " + numeroConta);
        }

        scanner.close();
    }
}
