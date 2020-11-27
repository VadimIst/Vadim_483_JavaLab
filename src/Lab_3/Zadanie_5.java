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
public class Zadanie_5 {
public static double kat(double c, double a){
double f= Math.sqrt(c*c-a*a);
return f;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину гипотенузы: ");
        int x = sc.nextInt();
        System.out.print("Введите длину катета: ");
        int y = sc.nextInt();
        sc.close();
        System.out.println (kat(x,y));
    }
    
}
