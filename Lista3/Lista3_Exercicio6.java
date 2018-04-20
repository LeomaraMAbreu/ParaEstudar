package lista3;

import java.util.Scanner;

public class Lista3_Exercicio6 {
    public static void main(String[] args) {  
        // Lista 3 de Exercícios de Algoritmos
        /*Questão 6 - Faça um programa que leia vários conjuntos de três valores reais
        e mostre para cada conjunto: sua soma, seu produto e sua média. O
        programa para quando um conjunto não entrar com seus valores em
        ordem crescente.*/
        
        int opcao = 0;

        while(opcao == 0){
            Scanner scanear = new Scanner(System.in);

            System.out.println("Informe o primeiro número: ");
            float valor1 = scanear.nextFloat();
            System.out.println("Informe o segundo número: ");
            float valor2 = scanear.nextFloat();
            System.out.println("Informe o terceiro número: ");
            float valor3 = scanear.nextFloat();

            //Condição para verificar os maiores números
            if((valor3 > valor2)&&(valor3 > valor1)&&(valor2 > valor1)){
                
                float soma = valor1 + valor2 + valor3;
                float produto = valor1 * valor2 * valor3;
                float media = soma / 3;
                
                System.out.println("A soma é: "+soma);
                System.out.println("O produto é: "+produto);
                System.out.println("A média é: "+media);

            }
            else{
                System.out.println("Sistema encerrado com sucesso!");
                opcao = 1;
            }
        }
    }
}
