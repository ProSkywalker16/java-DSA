
import java.util.*;

public class OneD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int i = 0;

        /*
         * char arr[] = new char[n]; // store characters directly
         * 
         * System.out.println("Enter characters to array:");
         * for (i = 0; i < arr.length; i++) {
         * arr[i] = sc.next().charAt(0); // take first character of input
         * }
         * 
         * String s = "";
         * for (i = 0; i < arr.length; i++) {
         * if (Character.isUpperCase(arr[i])) {
         * arr[i] = Character.toLowerCase(arr[i]);
         * } else {
         * arr[i] = Character.toUpperCase(arr[i]);
         * }
         * }
         * 
         * for (i = 0; i < arr.length; i++) {
         * System.out.print(arr[i]);
         * }
         * sc.close();
         */

        String arr[] = new String[n];
        System.out.println("Enter String:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (String s : arr) {
            if (s.length() >= 4) {
                System.out.println(s.substring(0, 4));
            } else {
                System.out.println(s); // if string has < 4 characters
            }
        }

    }

}
