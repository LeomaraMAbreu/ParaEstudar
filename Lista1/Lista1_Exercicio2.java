package lista1;

import java.util.Scanner;
import static javafx.print.Paper.C;

public class Lista1_Exercicio2 {
    
     public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        /*Questão 2 - Faça um algoritmo e implemente que leia uma
        temperatura em graus Centígrados e apresente a temperatura
        convertida em graus Fahrenheit. A equação de conversão é: F = (9 * C +
        160) / 5. Em que F é a temperatura em Fahrenheit e C é a temperatura
        em Centígrados. Faça também o algoritmo em fluxograma.*/
        double C;
        double F;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a temperatura em graus Centígrados (ºC): ");

        C = entrada.nextInt();        

        double farent = (9 * C + 160) / 5;
        System.out.println("Resposta em Fahrenheit (ºF): "+farent);  

   }
}
