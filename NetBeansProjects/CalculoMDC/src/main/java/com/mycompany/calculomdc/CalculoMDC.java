package com.mycompany.calculomdc;

public class CalculoMDC {
    public static void main(String[] args) {
        int num1 = 56; // Primeiro número
        int num2 = 48; // Segundo número

        int mdc = calcularMDC(num1, num2);

        System.out.println("MDC de " + num1 + " e " + num2 + " é " + mdc);
    }

    
    public static int calcularMDC(int m, int n) {
        
        if (n > m) {
            int temp = m;
            m = n;
            n = temp;
        }

        
        if (n == 0) {
            return m;
        }

        
        return calcularMDC(n, m % n);
    }
}
