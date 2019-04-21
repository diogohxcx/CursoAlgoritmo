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
public class Exercicio02 {
    public static void main(String[] args) {
        //Variaveis
        int num ,a ,b ;
        Scanner teclado = new Scanner(System.in);
        //Entrada
        System.out.print("Informe um número: ");
        num = teclado.nextInt();
        //Processamento
        if (num > 0){
            a = num;
            System.out.println(num + " É positivo!");
        }else{
            b = num;
            System.out.println(num + " É negativo!");
        }
    }
    
}
