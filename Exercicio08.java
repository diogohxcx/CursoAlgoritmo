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
public class Exercicio08 {
    public static void main(String[] args) {
        //Variaveis
        int num;
        Scanner teclado = new Scanner(System.in);
        //Entradadas
        System.out.print("Digite um número: ");
        num = teclado.nextInt();
        //Processamento
        if(num % 2 == 0){
            if(num > 0){
                System.out.printf("O número %d é par e positivo!\n", num);    
            }else{
                System.out.printf("O número %d é par e negativo!\n", num);
            }
        }else{
            if(num > 0){
                System.out.printf("O número %d é ímpar e positivo!\n", num);
            }else{
                System.out.printf("O número %d é ímpar e negativo!\n", num);
            }
        }
       
    }          
}
  

    

