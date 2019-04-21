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
public class Exercicio05 {
    public static void main(String[] args) {
        //Variaveis
        float p, e, m;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o peso total: ");
        p = teclado.nextFloat();
        //Processamento
        if (p > 50){
            e = p - 50;
            m = e * 4;
            System.out.printf("O excesso foi %.2f\n",e);
            System.out.printf("E a multa é R$%.2f\n",m);
        }else{
            System.out.println("Não houve excesso!");
            m = 0;
            System.out.println(m);
        }
        teclado.close();
    }
    
}
