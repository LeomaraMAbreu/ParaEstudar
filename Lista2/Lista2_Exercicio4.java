package lista2;

import java.util.Scanner;

public class Lista2_Exercicio4 {        
    
    public static void main(String[] args) {
        // Lista 2 de Exercícios de Algoritmos
       /* Questão 4 - Ler três valores e um código de condição. Se o código for “c” os valores devem
        ser escritos em ordem crescente. Se o código for “d”, deve-se escrevê-los em
        ordem decrescente. */

       int valor1, valor2, valor3, opcao,c = 0, d = 0;
                
        Scanner valor = new Scanner (System.in);
        
        System.out.println("Informe o 1º valor: ");
        
        valor1 = valor.nextInt();
        
        System.out.println("Informe o 2º valor: ");
        
        valor2 = valor.nextInt();
        
        System.out.println("Informe o 3º valor: ");
        
        valor3 = valor.nextInt();
        
        Scanner op = new Scanner (System.in);
        
        System.out.println("Informe C ou D: ");
        
        opcao = op.nextInt();
         
        if (opcao == c){
        if (valor1 < valor2){
            if (valor2 < valor3){
                                     
                System.out.println(valor1+"\n"+valor2+"\n"+valor3);
                
            }
            else if (valor1 < valor3){
                
                System.out.println(valor1+"\n"+valor3+"\n"+valor2);
            }
      
    }
        if (opcao == d){
            if(valor2 < valor3){
                    if(valor1 < valor3){
                    
                    System.out.println(valor2+"\n"+valor1+"\n"+valor3);
                    
                    }
                    else{
                    
                    System.out.println(valor2+"\n"+valor3+"\n"+valor1);
                         }                    
                    }
                    else{
                    
                    System.out.println(valor3+"\n"+valor2+"\n"+valor1);
                    
                    }
            }
        }
    }
    
}
