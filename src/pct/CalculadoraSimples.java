/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Aline
 */
public class CalculadoraSimples {
    public static void main(String[] args) {
        //declarando variaveis
        int v1, v2, total;
        int op;
        
        //declaração e instancia do objeto de entrada
        Scanner entrada = new Scanner (System.in);
        
        
        do{
            //apresentação
            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            //menu
            System.out.println("[1].Soma");
            System.out.println("[2].Subtração");
            System.out.println("[3].Divisão");
            System.out.println("[4].Multiplicação");
            System.out.println("[5].Sair");

            //leitura da opção do usúario
            System.out.print("Escolha sua opção: ");
            op = entrada.nextInt();

            if (op == 1){

                System.out.println("\n\tSoma:\n");

                //entradas
                System.out.print("Informe V1: ");
                v1 = entrada.nextInt();

                System.out.print("Informe V2: ");
                v2 = entrada.nextInt();

                // processamento
                total = v1 + v2;

                //saída
                //System.out.printf("\n %d + %d = %d\n\n", v1, v2, total);
                System.out.println("\n" + v1 + " + " + v2 + " = " + total + "\n");
            }else if (op == 2){
                //subtracao
                System.out.println("\n\tSubtração:\n");

                // entrada
                System.out.print("Informe V1: ");
                v1 = entrada.nextInt();

                System.out.print("Informe V2: ");
                v2 = entrada.nextInt();

                // procesamento
                total = v1 - v2;

                // saída
                    System.out.println("\n" + v1 + " - " + v2 + " = " + total + "\n");
            }else if (op == 3){            
                //divisão
                System.out.println("\n\tDivisão:\n");

                // entrada
                System.out.print("Informe V1: ");
                v1 = entrada.nextInt();

                System.out.print("Informe V2: ");
                v2 = entrada.nextInt();

                // processamento
                total = v1 / v2;

                //saída
                System.out.println("\n" + v1 + " / " + v2 + " = " + total + "\n");
            
            }else if(op == 4){
                //multiplicação
                System.out.println("\n\tMultiplicação:\n");
            
                //entrada
                // entrada
                System.out.print("Informe V1: ");
                v1 = entrada.nextInt();

                System.out.print("Informe V2: ");
                v2 = entrada.nextInt();

                // processamento
                total = v1 * v2;

                //saída
                System.out.println("\n" + v1 + " * " + v2 + " = " + total + "\n");
            
            }else if(op == 5){
                System.out.println("Até breve!");
            }else{
                System.out.println("Opção " + op + " incorreta!");
            }               
        }while(op != 5);        
    }
}
