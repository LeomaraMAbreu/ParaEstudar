package lista1;

import java.util.Scanner;

public class Lista1_Exercicio4 {
   
    public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos  
        /*Questão 4 - Faça um algoritmo em fluxograma e pseudocódigo que leia
        dois valores para as variáveis A e B, efetue a troca dos valores de forma 
        que a variável A passe a possuir o valor da variável B e que a variável B
        passe a possuir o valor da variável A. Apresentar os valores trocados.*/
        int A, B;
        int X;
        
        Scanner valor = new Scanner (System.in);      
         
        System.out.println("Informe o valor de A: ");
        A = valor.nextInt();
        System.out.println("Informe o valor de B: ");
        B = valor.nextInt();        
        //Troca o valor de A para B e vice versa
        X=A;
        A=B;
        B=X;
        
        //Imprime o valor de B em A      
        System.out.println("O valor de A: "+A);        
        //Imprime o valor de A em B
        System.out.println("O valor de B: "+B);
    }
    
}
