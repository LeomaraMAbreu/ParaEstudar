package lista1;

import java.util.Scanner;

public class Lista1_Exercicio3 {
   
     public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        /*Questão 3 - Faça um algoritmo com descrição narrativa e em pseudocódigo para
        calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
        equação: Volume = PI * raio2 * altura. */
        double raio;
        double altura;
        double PI = 3.14;
                
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o raio: ");
        
        raio = entrada.nextDouble();
        
        System.out.println("Informe a altura: ");
        
        altura = entrada.nextDouble();
        
        double volume = PI * (raio * raio) * altura;
        
        System.out.println("O valor do volume da lata de óleo é: "+volume);
    }
    
}
