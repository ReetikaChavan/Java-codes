import java.util.Scanner;

public class LargestSmallSum {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 7, 5, 4};
        int min = a[0];
        int max = a[0];
        int sum = 0;

        for (int i = 0; i < a.length; ++i) {
            sum += a[i];

            if (a[i] < min) {
                min = a[i];
            }

            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Sum: " + sum);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
