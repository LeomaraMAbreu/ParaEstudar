
package lista3;

import java.util.Scanner;

public class Lista3_Exercicio5 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
       /*Questão 5 - Faça um programa que leia vários inteiros positivos e mostre, no
        final, a soma dos números pares e a soma dos números ímpares. O
        programa para quando entrar um número maior que 1000.*/
       
       int valor = 0,
        pares = 0,
        impares = 0;
        
        Scanner dados = new Scanner(System.in);
            //Laço de repetição para ser executado enquanto o valor for menor do que 1000
            while(true){
                System.out.println("Informe um valor inteiro positivo: ");
                    valor = dados.nextInt();
                    if(valor > 1000){
                        break;
                    }
                    //Se o valor for menor do que 1000 e for par o sistema faz a soma dos números pares informados
                    if (valor % 2 == 0) {
                        pares += valor;
                    //Se o valor for ímpar e menor do que 1000, o sistema faz a soma dos números impares informados       
                    } else {
                        impares += valor;
                    }
             }
             //O sistema apresenta na tela o resultado da soma dos valores pares e ímpares
             System.out.println("Soma dos números PARES: " + pares);
             System.out.println("Soma dos números ÍMPARES: " + impares);
        
    }
    
}
