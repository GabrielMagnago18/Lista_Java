
package com.mycompany.empregadoteste;
public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 1500.00);
        Empregado empregado2 = new Empregado("Maria", "Rosa", 6000.00);
        
        System.out.println("O salário anual de João é: " + empregado1.calcularSalario());
        System.out.println("O salario anual de Maria é: " + empregado2.calcularSalario());
        
        empregado1.darAumento();
        empregado2.darAumento();
        
        System.out.printf("Salário anual do empregado 1 após aumento: %.2f", empregado1.calcularSalario());
        System.out.printf("Salário anual do empregado 2 após aumento: %.2f", empregado2.calcularSalario());
    }
}
