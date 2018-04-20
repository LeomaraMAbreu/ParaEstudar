/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author leomara
 */
public class Lista1_Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista 1 de Exercícios de Algoritmos
        /*Questão 1 - Faça um algoritmo do tipo fluxograma que tendo dois números de
        entrada mostre a soma, a diferença, o produto e a média aritmética
        desses valores. Após, faça o algoritmo. A tela de diálogo deve aparecer como se segue:
        Entre com o primeiro número:
        Entre com o segundo número:
        Soma: valor
        Diferença: valor
        Produto: valor
        Media: valor*/
        int n1, n2;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Entre com o primeiro número: ");
        
        n1 = entrada.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        
        n2 = entrada.nextInt();
        
        double soma = n1 + n2;
        System.out.println("Soma: "+soma);
        
        double diferenca = n1 - n2;
        System.out.println("Diferença: "+diferenca);
        
        double produto = n1 * n2;
        System.out.println("Produto: "+produto);
        
        double media = n1 + n2/2;
        System.out.println("Média: "+media);
        
    }
    
}
