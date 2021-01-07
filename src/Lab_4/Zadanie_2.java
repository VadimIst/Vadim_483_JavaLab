/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;

/**
 *
 * @author User
 */
public class Zadanie_2 {

    public static void main(String[] args) {
        double a = 0;
        for (double x = 1; x < 1001; x++) {
            while (x % 2 == 1) {
                a = a + 1 / x;
                break;
            }
        }
        for (double n = 1; n < 1001; n++) {
            while (n % 2 == 0) {
                a = a - 1 / n;
                break;
            }
        }
        System.out.println(a);
    }
}
