import java.util.Scanner;

public class floor {
    static int floor(int arr[], int k) {
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

        if (end >= 0) {
            return end; // floor exists
        } else {
            return -1; // floor doesn't exist
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
        int f = floor(arr, k);
        if (f != -1) {
            System.out.println("floor of " + k + " is: " + arr[f] + " (at index " + f + ")");
        } else {
            System.out.println("No floor found for " + k);
        }
    }
}
