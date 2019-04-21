/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ardili.secao2;

import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class Exercico2 {
    public static void main(String[]args){
        //Variaveis
        int num1, num2, soma, multiplicacao;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.println("Informe o primeiro número: ");
        num1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        num2 = teclado.nextInt();
        //Processamento
        soma = num1 + num2;
        multiplicacao = soma * num1;
        //Saída
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        teclado.close();
    }
    
}

