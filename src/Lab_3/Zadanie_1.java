/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Zadanie_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n: ");
        double rez = 1, n = sc.nextDouble();
        sc.close();
        if (n>0)
        {for (double a = 0; a < n; a++) {
        System.out.println(rez *= 2);}}
        else {for (double a = 0; a > n; a--) {
            System.out.println(1/ (rez *= 2));}}
    }
}
