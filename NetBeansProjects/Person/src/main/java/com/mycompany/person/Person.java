package com.mycompany.person;

public class Person {
        
        //Atributos da classe
        private String nome;
        private int idade;
        
        //Construtor da classe
        public Person(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;           
        }
        
        // Métodos Get e Set
        public String getNome() {
            return nome;
        }
        
        public int getIdade() {
            return idade;
        }
   
        // Instância da classe
    public static void main(String[] args) {
        Person pessoa1 = new Person("Carlinhos", 22);
        Person pessoa2 = new Person("Jefferson", 34);
        
        System.out.println("Pessoa 1 - Nome: " + pessoa1.getNome() + " Idade: " + pessoa1.getIdade());
        System.out.println("Pessoa 2 - Nome: " + pessoa2.getNome() + " Idade: " + pessoa2.getIdade());
        
        
    }
}
