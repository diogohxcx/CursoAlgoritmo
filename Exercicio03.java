/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ardili.secao06;

/**
 *
 * @author diogo
 */
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        //Variaveis
        int num, p = 0, i = 0;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Digite um valor: ");
        num = teclado.nextInt();
        //Processamento
        if (num % 2 == 0){
            p = num;
            System.out.println(p + " Este número é par!");
        }else{
            i = num;
            System.out.println(i + " Este número é impar!");
        }
        teclado.close();
    }
}
