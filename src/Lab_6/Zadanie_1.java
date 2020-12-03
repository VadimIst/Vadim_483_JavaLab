/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_6;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Zadanie_1 {

    public static short minX() {
        short x = 0;
        short y = 0;
        short a, b;
        short[] A = new short[10];
        System.out.print("Массив: ");
        for (int i = 0; i < 10; i++) {
            A[i] = (short) Math.round(50 * Math.random());
            System.out.print(A[i] + ", ");
        }
        x = A[0];
        y = A[0];
        for (int i = 1; i < 10; i++) {
            if (x > A[i]) {
                x = A[i];
                if (y < A[i]) {
                y = A[i];
            }
        }
        }
        return (x + y);
    }
    public static void main(String[] args) {
        System.out.print("\nМинимальный элемент: " + minX());
        System.out.print(" ");
    }
}
