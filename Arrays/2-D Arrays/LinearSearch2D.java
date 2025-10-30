import java.util.*;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int i;
        int j;
        System.out.println("Enter data to array:");
        int arr[][] = new int[n][n];
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // element to search
        System.out.println("Enter number to search:");
        int x = sc.nextInt();
        boolean found = false;

        // linear search 2D
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (arr[i][j] == x) {
                    System.out.println(x + " found at (" + i + "," + j + ")");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
