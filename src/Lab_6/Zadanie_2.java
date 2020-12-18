/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;
/**
 *
 * @author User
 */
public class Zadanie_2 {
    
     public static void sort() {
        float temp;
        float[] B = new float[25];
        System.out.print("\nИсходный массив: ");
        for (int i = 0; i < 10; i++) {
            B[i] = (int) Math.round(Math.random()*100-50);
            System.out.print(B[i] + ", ");
        }
        System.out.print("\nМассив отсортированный: ");
        for (int i = 0; i < 9; i++) {
            for (int j = 9; j > i; j--) {
                if (B[j - 1] > B[j]) {
                    temp = B[j];
                    B[j] = B[j - 1];
                    B[j - 1] = temp;
                }
            }
            System.out.print(B[i] + ", ");
        }
    }
public static void main(String[] args) {
        sort();
    }
}  