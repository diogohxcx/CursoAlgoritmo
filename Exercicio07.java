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
public class Exercicio07 {
    public static void main(String[] args) {
        //Variaveis
        int n1, n2, n3, n4, q1, q2, q3, q4;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o primeiro número: ");
        n1 = teclado.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = teclado.nextInt();
        System.out.print("Informe o terceiro número: ");
        n3 = teclado.nextInt();
        System.out.print("Informe o quarto número: ");
        n4 = teclado.nextInt();
        //Processamento
        q1 = n1 * n1;
        q2 = n2 * n2;
        q3 = n3 * n3;
        q4 = n4 * n4;
        if ( q3 >= 100){
            System.out.println("Quadrado do terceiro valor é superior a 100! " + q3);
        }else{
            System.out.printf("O quadrado de %d é %d. \n",n1, q1);
            System.out.printf("O quadrado de %d é %d. \n",n2, q2);
            System.out.printf("O quadrado de %d é %d. \n",n3, q3);
            System.out.printf("O quadrado de %d é %d. \n",n4, q4);
        } 
        teclado.close();
    }
}
 /*
 * Informe o primeiro número: 2
 * Informe o segundo número: 3
 * Informe o terceiro número: 4
 * Informe o quarto número: 1
 * O quadrado de 2 é 4. 
 * O quadrado de 3 é 9. 
 * O quadrado de 4 é 16. 
 * O quadrado de 1 é 1. 
 * BUILD SUCCESSFUL (total time: 5 seconds)
*/