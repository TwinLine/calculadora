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
        
        //declaração e instancia do objeto de entrada
        Scanner entrada = new Scanner (System.in);
        
        //apresentação
        System.out.println("\n\t\t\t -- Calculadora Simples --\n");
        
        System.out.println("\n\tSoma simples:\n");
        
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
    }
}
