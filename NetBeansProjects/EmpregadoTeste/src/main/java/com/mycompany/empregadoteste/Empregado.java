
package com.mycompany.empregadoteste;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    
    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if (salarioMensal >= 0) {
            this.salarioMensal = salarioMensal;
        }
        else {
            this.salarioMensal = 0.0;
        }       
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal >= 0) {
            this.salarioMensal = salarioMensal;
        }
        else {
            this.salarioMensal = 0.0;
        }
    }
    
    public double calcularSalario() {
        return salarioMensal * 12;
    }
    
    public void darAumento() {
        salarioMensal *= 1.10;
    }   
}
