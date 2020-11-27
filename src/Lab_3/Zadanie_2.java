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
public class Zadanie_2 {
static int faktorial(int n){
int f = 1;
for (int i = 1; i <=n; i ++){
	f = f*i;
        }
    return f;
}	

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число n не более 10: ");
        int n = sc.nextInt();
        sc.close();
        if (n < 10) 
        {System.out.println(faktorial(n));}
        else {System.out.print("n больше 10 ");}
    }
    
}
