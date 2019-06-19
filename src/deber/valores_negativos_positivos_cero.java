/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class valores_negativos_positivos_cero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.println("Ingrese 5 enteros y saldra cuantos son positivos,cuantos son negativos y cuantos cero hay");
        System.out.println("Ingrese el primer entero:");
        numero1 = entrada.nextInt();

        System.out.println("Ingrese el segundo entero:");
        numero2 = entrada.nextInt();

        System.out.println("Ingrese el tercer entero:");
        numero3 = entrada.nextInt();

        System.out.println("Ingrese el cuarto entero:");
        numero4 = entrada.nextInt();

        System.out.println("Ingrese el quinto entero:");
        numero5 = entrada.nextInt();

        int positivos = 0,negativos = 0,ceros = 0;
        
        if (numero1 > 0) {
            positivos = positivos + 1;
        }

        if (numero1 < 0) {
            negativos = negativos + 1;
        }

        if (0 == numero1) {
            ceros = ceros + 1;
        }

        if (numero2 > 0) {
            positivos = positivos + 1;
        }

        if (numero2 < 0) {
            negativos = negativos + 1;
        }

        if (0 == numero2) {
            ceros = ceros + 1;
        }

        if (numero3 > 0) {
            positivos = positivos + 1;
        }

        if (numero3 < 0) {
            negativos = negativos + 1;
        }

        if (0 == numero3) {
            ceros = ceros + 1;
        }

        if (numero4 > 0) {
            positivos = positivos + 1;
        }

        if (numero4 < 0) {
            negativos = negativos + 1;
        }

        if (0 == numero4) {
            ceros = ceros + 1;
        }

        if (numero5 > 0) {
            positivos = positivos + 1;
        }

        if (numero5 < 0) {
            negativos = negativos + 1;
        }

        if (0 == numero5) {
            ceros = ceros + 1;
        }

        System.out.printf("\nDe los numeros introducidos, %d son positivos, %d son negativos y %d son ceros\n", positivos, negativos, ceros);
    }
}
