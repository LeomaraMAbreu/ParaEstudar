package lista1;

import java.util.Scanner;

public class Lista1_Exercicio5 {
    
    public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        /*Questão 5 - Faça um algoritmo em fluxograma e pseudocódigo que
        efetue a leitura de um número inteiro e apresente o resultado do
        quadrado deste número.*/
        int num;
                      
        Scanner numero = new Scanner (System.in);
        
        System.out.println("Informe um número inteiro: ");
        
        num = numero.nextInt();
        
        double quadrado = Math.pow(num, 2);
                
        System.out.println("O quadrado do número é: "+quadrado); 
    }
}
