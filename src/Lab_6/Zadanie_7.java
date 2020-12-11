package Lab_6;
import java.util.Scanner;
public class Zadanie_7 {
    public static void proverka(String[] array) {
        if (array[3] == array[4]) {
            array[0] += array[1];
        } else {
            array[0] += array[2];
        }
    }

    public static void main(String[] args) {
        String[] A = new String[5];
        Scanner sc = new Scanner(System.in);
        for (var i = 0; i < A.length; i++) {
            System.out.print("Введите s" + (i + 1) + " строку: ");
            A[i] = sc.nextLine();
        }
        System.out.print("[ ");
        for (var i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.print("]");
        proverka(A);
        System.out.print("\n[ ");
        for (var i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
        System.out.print("]");
    }
}
