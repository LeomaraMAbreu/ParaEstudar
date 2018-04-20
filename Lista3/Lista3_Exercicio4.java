package lista3;

public class Lista3_Exercicio4 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        /*Questão 4 - Escreva um algoritmo que gera números entre 1000 e 1999 e mostra
        aqueles que divididos por 11 dão resto 5.*/
        
        // Números entre 1000 e 1999 que são divisíveis por 11 dão o resto 5
        for(int n = 1000; n <= 1999; n++){
            if(n % 11 == 5){
               
               //Imprime os números divisíveis por 11 que dão resto 5
               System.out.println(n);
           }
       }
    }
    
}
