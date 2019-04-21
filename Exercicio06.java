/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ardili.secao06;

import java.util.Scanner;

/**
 *
 * @author diogo
 */
public class Exercicio06 {
    public static void main(String[] args) {
        //Variaveis
        int c;
        float n, salario, e, extra;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o código: ");
        c = teclado.nextInt();
        System.out.print("Informe a quantidade de horas: ");
        n = teclado.nextFloat();
        //Processamento
        if (n > 50){
            e = n - 50;
            n = n - e;
            extra = e * 20;
            salario = n * 10;
            System.out.printf("O salário será de: R$%.2f\n", salario);
            System.out.printf("A hora extra será de: R$%.2f\n",  extra);
        }
    }  
}
