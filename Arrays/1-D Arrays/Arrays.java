import java.util.Scanner;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter nos:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(java.util.Arrays.toString(arr));
        sc.close();

    }

    public static void sort(char[] ch1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

    public static boolean equals(char[] ch1, char[] ch2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'equals'");
    }
}
