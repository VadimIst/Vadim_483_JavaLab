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
public class Zadanie_3 {

    public static void main(String[] args) {
        int[] C = new int[20];
        Random rand = new Random();
        int Sum = 0;
        for (var i = 0; i < C.length; i++) {
            C[i] = rand.nextInt() % 100;
            Sum += C[i];
            System.out.print(C[i] + ", ");
        };
        float Sr = (float) Sum/ C.length;
        System.out.print("\nСумма = " + Sum);
        System.out.print("\nДлина массива = " + C.length);
        System.out.println("\nСреднее значение = " + Sr);
    }
}
