/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber;

/**
 *
 * @author kevin
 */
public class patron_damas_mediante_asteriscos {

    public static void main(String[] args) {
        int contador1 = 1;
        int contador2 = 1;
        int espacio = 8;

        while (contador2 <= espacio) {
            contador1 = 1;
            while (contador1 <= espacio) {
                if (0 == contador2 % 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }

                contador1++;
            }
            System.out.print("\n");
            contador2++;
        }
    }
}