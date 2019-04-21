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
public class Exercicio01 {
    public static void main(String[] args) {
        //Variaveis
        int num;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.println("Digite um número: ");
        num = teclado.nextInt();
        //Processamento
        if (num > 100){
            System.out.println(num);
        }else{
            num = 0;
            System.out.println("Número menor que 100!" + num);
        }
        teclado.close();
    }
    
}
