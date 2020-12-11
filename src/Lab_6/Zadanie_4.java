/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

import java.util.Random;

/**
 *
 * @author User
 */
public class Zadanie_4 {

    public static void main(String[] args) {
        int[] D = new int[30];
        int C = 0;
        int N = 0;
        Random rand = new Random();
        for (var i = 0; i < D.length; i++) {
            D[i] = rand.nextInt() % 100;
            System.out.print(D[i] + ", ");

            if (D[i] % 2 == 0) {
                C += D[i];
            } else {
                N += D[i];
            }
        }
        System.out.print("\nСумма четных: " + C);
        System.out.println("\nСумма нечетных: " + N);
    }
}
