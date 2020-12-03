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
        double s = 0;
        for (int x = 1; x <= 10000; x++) {
            if (x % 2 == 0) {
                s = s - 1 / x;
                System.out.println(s);} 
            else {
                s = s + 1 / x;
                System.out.println(s);}
        }
    }
}
