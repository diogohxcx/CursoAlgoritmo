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
public class Exercicio04 {
    public static void main(String[] args) {
        //Variaveis 
        float altura, peso_ideal;
        char sexo;
        Scanner teclado = new Scanner(System.in);
        //Entrada
        System.out.print("Informe sua altura: ");
        altura = teclado.nextFloat();
        System.out.print("Informe o sexo, [m/f]");
        sexo = teclado.next().charAt(0);
        //Processamento
        if(sexo == 'm'){
            peso_ideal = (float)(72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f\n", peso_ideal);
        }
        if(sexo == 'f'){
            peso_ideal = (float)(62.1 * altura) - (float)44.7;
            System.out.printf("Seu peso ideal é: %.2f\n", peso_ideal);    
        }
        if(sexo != 'm' && sexo != 'f'){
            System.out.println("Sexo não reconhecido.");
            //peso_ideal = 0;            
        }
        teclado.close();
    }
    
}
