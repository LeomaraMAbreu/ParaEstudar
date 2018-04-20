package lista3;

import java.util.Scanner;

public class Lista3_Exercicio9 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        /*Questão 9 - Faça um programa que leia um número n e imprima se ele é primo ou
        não. (um número primo tem apenas 2 divisores: 1 e ele mesmo! O
        número 1 não é primo!!!)*/
        
        Scanner scn = new  Scanner(System.in); 

        System.out.println("Digite um número: ");
        int numeroprimoounao = scn.nextInt();
        boolean primo = true;
 
        if (numeroprimoounao == 0|| numeroprimoounao == 1){
            primo = false;
        }
        else {
            for (int i = 2; i < numeroprimoounao; i++) {
            //Divide o número por i e verifica se o resto é 0   
            if ((numeroprimoounao % i) == 0){               
            primo = false; 
            //Para de verificar
            break; 
            }
            }
        }
 
        if (primo){  
            System.out.println("O Número " + numeroprimoounao + " É primo!");
        
        }
        else{ 
            System.out.println("O Número " + numeroprimoounao + " NÃO é primo!");
        }
        
    }
    
}
