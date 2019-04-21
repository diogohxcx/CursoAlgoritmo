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
public class Exercicio09 {
    public static void main(String[] args) {
        //Variaveis
        float poluicao;
        Scanner teclado = new Scanner(System.in);
        //Entradas
        System.out.print("Informe o indice de poluição: ");
        poluicao = teclado.nextFloat();
        //Processamento
        if(poluicao >= 0.3 && poluicao < 0.4){
            System.out.println("Grupo1 suspender atividades!");    
        }
        if(poluicao >= 0.4 && poluicao < 0.5){
            System.out.println("Grupo1 e Grupo2 suspender atividades!");
        }
        if(poluicao >= 0.5 ){
            System.out.println("Todos os grupos suspender atividades!");
        
        }
        teclado.close();
    }
}
