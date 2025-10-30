import java.math.*;
import java.util.*;

public class Multi_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int i;
        /*
         * double arr[] = new double[n];
         * int i;
         * System.out.println("Enter data in array of size:" + n);
         * for (i = 0; i < n; i++) {
         * arr[i] = sc.nextDouble();
         * }
         * double s[] = new double[n];
         * double c[] = new double[n];
         * 
         * for (i = 0; i < n; i++) {
         * s[i] = Math.sqrt(arr[i]);
         * c[i] = Math.cbrt(arr[i]);
         * }
         * 
         * System.out.println("Square roots (s):");
         * for (i = 0; i < n; i++) {
         * System.out.print(s[i] + " ");
         * }
         * System.out.println();
         * System.out.println("Cube roots (c):");
         * for (i = 0; i < n; i++) {
         * System.out.print(c[i] + " ");
         * }
         * System.out.println();
         */

        // program: getting whole and fractional part
        /*
         * double arr[] = new double[n];
         * int i;
         * int whole[] = new int[n];
         * double frac[] = new double[n];
         * 
         * System.out.println("Enter the values:");
         * for (i = 0; i < n; i++) {
         * arr[i] = sc.nextDouble();
         * whole[i] = (int) (arr[i]); // This will store the whole number of the values
         * frac[i] = arr[i] - whole[i]; // This stores the fractional/decimal part
         * }
         * System.out.println("Whole values: ");
         * for (i = 0; i < n; i++) {
         * System.out.print(whole[i] + " ");
         * }
         * System.out.println();
         * 
         * System.out.println("Fractional values: ");
         * for (i = 0; i < n; i++) {
         * System.out.print(frac[i] + " ");
         * }
         * System.out.println();
         */

        int arr1[] = new int[n];
        System.out.println("Enter data to array1:");
        for (i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[n];
        System.out.println("Enter data to array2:");
        for (i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int arr3[] = new int[arr1.length * 2];
        int k = 0;
        for (i = 0; i < n; i++) {
            arr3[k++] = arr1[i];
            arr3[k++] = arr2[i];

        }

        System.out.println("New merged array:");
        for (i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
    }
}
