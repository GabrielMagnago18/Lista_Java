package com.mycompany.faturateste;

public class FaturaTeste {
    public static void main(String[] args) {
        
        Fatura fatura = new Fatura("001", "Item de Teste", 5, 10.5);

        
        System.out.println("Número da Fatura: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por Item: " + fatura.getPrecoPorItem());

        
        double totalFatura = fatura.getTotalFatura();
        System.out.println("Total da Fatura: " + totalFatura);
    }
}
