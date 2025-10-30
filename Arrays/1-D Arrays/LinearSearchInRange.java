import java.util.*;

public class LinearSearchInRange {
    static int linear_search(int arr[], int n, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i < end; i++) {
            int ele = arr[i];
            if (ele == n) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        System.out.println("Enter data to array of size " + n);

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to be searched in array:");
        int x = sc.nextInt();
        System.out.println("Enter start range:");
        int start = sc.nextInt();
        System.out.println("Enter end range:");
        int end = sc.nextInt();
        int ans = linear_search(arr, x, start, end);
        if (ans != -1) {
            System.out.println("Found in position" + ans);
        } else {
            System.out.println("Not found");
        }

    }
}
