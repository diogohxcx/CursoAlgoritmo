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
public class Exercicio10 {
    public static void main(String[]args){
        //Variaveis
        int idade;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe a idade do atleta: ");
        idade = teclado.nextInt();
        //Processamento
        if(idade >= 5 && idade <= 7){
            System.out.println("Atleta da categoria infantil-a.");
        }
        if(idade >=8 && idade <= 11){
            System.out.println("Atleta da categoria infantil-b.");
        }
        if(idade >= 12 && idade <= 13){
            System.out.println("Atleta da categoria juvenil-a.");
        }
        if(idade >= 14 && idade <= 17){
            System.out.println("Atleta da categoria juvenil-b.");
        }else{
            System.out.println("Atleta da categoria adulto.");
        }
    }
}
