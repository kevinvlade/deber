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
public class Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int radio;
        Scanner entrada = new Scanner( System.in );
        System.out.print( "Digite el radio del círculo: ");
        radio = entrada.nextInt();
        System.out.printf("\nEl diametro del círculo es: %d.", ( 2 * radio ) );
        System.out.printf( "\nLa circunferencia del círculo es: %f.", ( 2 * Math.PI * radio ) );
        System.out.printf( "\nEl área del círculo es: %f.\n", ( Math.PI * radio * radio ) );
    }
    
}
