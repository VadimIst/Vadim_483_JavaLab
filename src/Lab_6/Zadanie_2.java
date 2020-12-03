/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;

import static Lab_6.Zadanie_1.minX;

/**
 *
 * @author User
 */
public class Zadanie_2 {
    
     public static void sort() {
        short temp;
        short[] array = new short[10];
        System.out.print("\nИсходный массив: ");
        for (int i = 0; i < 10; i++) {
            array[i] = (short) Math.round(50 * Math.random());
            System.out.print(array[i] + ", ");
        }
        System.out.print("\nМассив отсортированный: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
            System.out.print(array[i] + ", ");
        }
    }
public static void main(String[] args) {
        sort();
    }
}