package lista3;

import java.util.Scanner;

public class Lista3_Exercicio10 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        /*Questão 10 - Faça um programa que leia um número n e mostre na tela os n
        primeiros números primos.*/
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = in.nextInt();
        //Irá contar até o número que foi informado
        for (int j = 1; j <= num; j++) { 
            int contador = 0;
            
            for (int k = 1; k <= num; k++) { 
                if (j % k == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.println("O número "+j+ " é primo.");
            }
        }
        
    }
        
    
}
