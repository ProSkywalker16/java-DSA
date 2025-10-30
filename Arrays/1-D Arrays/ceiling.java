import java.util.Scanner;

public class ceiling {
    static int ceiling(int arr[], int k) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k == arr[mid]) {
                return mid; // found
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        // After loop, start is the index of the ceiling element
        // But if start == arr.length, there is no ceiling
        if (start < arr.length) {
            return start;
        } else {
            return -1; // ceiling doesn't exist
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data into array in sorted order:");
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data to be searched:");
        int k = sc.nextInt();
        int f = ceiling(arr, k);
        if (f != -1) {
            System.out.println("Ceiling of " + k + " is: " + arr[f] + " (at index " + f + ")");
        } else {
            System.out.println("No ceiling found for " + k);
        }
    }
}
