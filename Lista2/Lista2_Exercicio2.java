package lista2;

import java.util.Scanner;

public class Lista2_Exercicio2 {
             
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       /*Questão 2 - Fazer um algoritmo para ler os três lados de um triângulo, dizer se ele é
        isósceles, escaleno ou equilátero. OBS: Antes de verificar o tipo do triângulo
        deve-se verificar se os lados fornecidos formam triângulo:
        ( L1+L2 > L3; L2+L3 >L1 e L3+L1 > L2)*/
       
       int L1, L2, L3;
        
        Scanner numero = new Scanner (System.in);
        
          System.out.println("Informe o 1º lado do triângulo: ");
          
          L1 = numero.nextInt();
          
          System.out.println("Informe o 2º lado do triângulo: ");
          
          L2 = numero.nextInt();
          
          System.out.println("Informe o 3º lado do triângulo: ");
          
          L3 = numero.nextInt();
          
          if (L1 < L2 + L3 || L2 < L1 + L3 || L3 < L1 + L2){
              
              System.out.println("Trata-se de um triângulo.");         
          }         
          
          else if  (L1 == L2 && L1 == L3){
              
              System.out.println("Trata-se de um triângulo Equilátero.");
          }              
          
          else if (L1 == L2 || L1 == L3){
              
              System.out.println("Trata-se de um triângulo Isósceles.");
          } 
         else{
            System.out.println("Trata-se de um triângulo Escaleno.");
            System.out.println("\n");   
         }
        
    }
          
    
}
