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
public class Zadanie_4 {
public static final Double G=9.8;
public static double vis(double h){
double t= Math.sqrt(2*h/G);
return t;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        Double x = sc.nextDouble();
        sc.close();
        System.out.print("Время падения: ");
        System.out.print(vis(x));
        System.out.println(" секунд");
    }
    
}
