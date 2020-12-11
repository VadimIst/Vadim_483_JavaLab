package Lab_6;
import java.util.Random;
public class Zadanie_6 {
    static int[] A = new int[25];
    static int min = 0;
    static int max = 0;
    static int indexMin = 0;
    static int indexMax = 0;
    static int swap = 0;

    public static void minA(int value, int arrayMin, int i) {
        if (value < arrayMin) {
            min = value;
            indexMin = i;
        }
    }
    public static void maxA(int value, int arrayMax, int i) {
        if (value > arrayMax) {
            max = value;
            indexMax = i;
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        for (var i = 0; i < A.length; i++) {
            A[i] = rand.nextInt() % 100;
            System.out.print(A[i] + ", ");
            minA(A[i], min, i);
            maxA(A[i], max, i);
        }
        System.out.print("\nmax = " + max + "\n");
        swap = A[indexMax];
        A[indexMax] = A[indexMin];
        A[indexMin] = swap;
        for (var j = 0; j < A.length; j++) {
            System.out.print(A[j] + ", ");
        }
    }
}
