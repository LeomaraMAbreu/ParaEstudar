package lista3;

import java.util.Scanner;

public class Lista3_Exercicio7 {
    
    public static void main(String[] args) {
        // Lista 3 de Exercícios de Algoritmos
        /*Questão 7 - Faça um programa que leia as médias finais de vários alunos de
        uma turma e mostre a maior média, a menor média e a média
        aritmética da turma. O programa para quando encontrar uma média
        negativa.*/
        
        int aluno = 0;
        double mediaFinal = 0;
        double maior = 0;
        double menor = 0;
        
        Scanner in = new Scanner(System.in);

        for (int i = 1; i > 0; i++) {
            System.out.println("Informe a média do aluno: ");
            double media = in.nextDouble();
            //Contador de alunos
            aluno = aluno + 1 ;
            //Soma das médias
            mediaFinal = mediaFinal + media;
            //Condição para descobrir a maior nota
            if(media > maior){
                maior = media;
            } 
            //Condição para descobrir a menor nota
            if(media < menor){
                menor = media;
            }
            if(media < 0){
                i = -1;
            }
        }
        //Cálculo da média dos alunos
        mediaFinal = mediaFinal / aluno;
        
        System.out.println("Média final de todos os alunos: "+mediaFinal);
        System.out.println("Maior média: "+maior);
        System.out.println("Menor média: "+menor);
        
    }
}
