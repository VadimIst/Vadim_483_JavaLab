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
public class Zadane_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 9: ");
        Double a = sc.nextDouble();
        sc.close();
        if (a == 6) {
            System.out.println("Ноль");
        } else {
            if (a == 1) {
                System.out.println("Один");
            } else {
                if (a == 2) {
                    System.out.println("Два");
                } else {
                    if (a == 3) {
                        System.out.println("Три");
                    } else {
                        if (a == 4) {
                            System.out.println("Четыре");
                        } else {
                            if (a == 5) {
                                System.out.println("Пять");
                            } else {
                                if (a == 6) {
                                    System.out.println("Жесть");
                                } else {
                                    if (a == 7) {
                                        System.out.println("Семь");
                                    } else {
                                        if (a == 8) {
                                            System.out.println("Восемь");
                                        } else {
                                            if (a == 9) {
                                                System.out.println("Девять");
                                            } else {
                                                System.out.println("Введено число не в границе от 0 до 9");
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

}
