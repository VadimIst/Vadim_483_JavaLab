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
public class Zadanie_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое действительное число: ");
        double x = sc.nextDouble();
        System.out.print("Введите второе действительное число: ");
        double y = sc.nextDouble();
        sc.close();
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        
    }
    
}
