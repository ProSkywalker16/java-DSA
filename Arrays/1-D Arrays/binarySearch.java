import java.util.*;

public class binarySearch {
    static int binary_search(int arr[], int k) {
        int start = 0, end = arr.length - 1;

        // detect if ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (k == arr[mid]) {
                return mid; // found
            }

            if (isAscending) {
                // ascending order logic
                if (k > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // descending order logic
                if (k > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // not found
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
        int f = binary_search(arr, k);
        if (f != -1) {
            System.out.println(k + " was found at:" + f);
        } else {
            System.out.println("Not Found");
        }
    }
}
