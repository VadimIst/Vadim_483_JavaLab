package Lab_6;
import java.util.Random;

public class Zadanie_1 {

    public static void main(String[] args) {
        int[] A = new int[25];
        Random rand = new Random();
        int min = 0;
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;
        int swap = 0;
        for (var i = 0; i < A.length; i++) {
            A[i] = rand.nextInt() % 100;
            System.out.print(A[i] + ", ");
            if (A[i] < min) {
                min = A[i];
                indexMin = i;
            }
            if (A[i] > max) {
                max = A[i];
                indexMax = i;
            }
        }
        System.out.println();
        swap = A[indexMax];
        A[indexMax] = A[indexMin];
        A[indexMin] = swap;
        for (var j = 0; j < A.length; j++) {
            System.out.print(A[j] + ", ");
        }
    }
}
