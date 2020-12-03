/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Zadanie_1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Введите степень от 1 до 100: ");
        double n = sc.nextDouble();
        if (n > 0 && n < 101){
            int a,b;
            double c;
            System.out.println("Целочисленные решения теоремы ферма от 1 до 100:");
            for (int i = 1; i<101; i++){
                for (int j = 1; j < 101; j++) {
                    a = i;
                    b = j;
                    c = Math.pow((Math.pow(a, n) + Math.pow(b, n)),1.0 / n);
                    if (c == (int) c) {
                        System.out.println("a " + a + " b " + b + " c " + c);
                    } 
                }
            }
            
                    System.out.println("Решений не найдено");
}
        else{
            System.out.println("Степень должна быть от 2 до 100");
        }
    }
}
