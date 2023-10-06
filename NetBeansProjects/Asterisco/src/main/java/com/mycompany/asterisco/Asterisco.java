package com.mycompany.asterisco;

public class Asterisco {

    public static void main(String[] args) {
        
        System.out.println("Padrão A");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        
        System.out.println("Padrão B");
        for (int i = 10; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("Padrão C");
        for (int i = 1; i <= 9; i++) {
            
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(' ');
            }
            
            
            for (int j = 1; j <= 11 - i; j++) {
                System.out.print('*');
            }
            
            System.out.println();
        }
        
        System.out.println("Padrão D");
        int n = 10; 
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            
            
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            
            System.out.println(); 
        }
    }
}
