import java.util.Scanner;
import java.util.*;

public class LinearSearch {
    /*
     * //PROGRAM: Linear search for array of unsorted numbers
     * static int linear_search(int arr[], int n) {
     * if (arr.length == 0) {
     * return -1;
     * }
     * for (int i = 0; i < arr.length; i++) {
     * int ele = arr[i];
     * if (ele == n) {
     * return i;
     * }
     * 
     * }
     * return -1;
     * 
     * }
     * 
     * public static void main(String[] args) {
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter size of array:");
     * int n = sc.nextInt();
     * int arr[] = new int[n];
     * int i;
     * System.out.println("Enter data to array of size " + n);
     * 
     * for (i = 0; i < n; i++) {
     * arr[i] = sc.nextInt();
     * }
     * 
     * System.out.println("Enter number to be searched in array:");
     * int x = sc.nextInt();
     * int ans = linear_search(arr, x);
     * if (ans != -1) {
     * System.out.println("Found in position" + ans);
     * } else {
     * System.out.println("Not found");
     * }
     * 
     * }
     */

    static int linear_string_search(String str, char ch) {
        int i;
        if (str.length() == 0) {
            return -1;

        }
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.nextLine();

        System.out.println("Enter character to search:");
        char ch = sc.next().charAt(0);

        int ans = linear_string_search(str, ch);

        if (ans == -1) {
            System.out.println(ch + " was not found in array");
        } else {
            System.out.println(ch + " was found in position " + ans);
        }
    }
}
