import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int i = 0, j = 0;

        /*
         * // print first and last row of an array
         * for (i = 0; i < arr.length; i++) {
         * for (j = 0; j < arr[0].length; j++) {
         * if (i == 0 || i == arr.length - 1)// i=0 signifies when it is the first row,
         * the arr.length - 1
         * // signifies the last row
         * {
         * System.out.print(arr[i][j] + " ");
         * }
         * }
         * System.out.println();
         * }
         */

        /*
         * ////print first and last column of an array
         * for (i = 0; i < arr.length; i++) {
         * for (j = 0; j < arr[i].length; j++) {
         * if (j == 0 || j == arr[i].length - 1)// j=0 signifies when it is the first
         * col, the arr.length[i] - 1
         * // signifies the last col
         * {
         * System.out.print(arr[i][j] + " ");
         * }
         * }
         * System.out.println();
         * }
         */

        /*
         * // Print diagonal elements of a square 2D array
         * for (i = 0; i < arr.length; i++) {
         * for (j = 0; j < arr[i].length; j++) {
         * if (i == j || i + j == arr.length - 1) {
         * // i == j → main diagonal (top-left to bottom-right)
         * // i + j == arr.length - 1 → secondary diagonal (top-right to bottom-left)
         * System.out.print(arr[i][j] + " ");
         * } else {
         * System.out.print("  "); // spaces for alignment
         * }
         * }
         * System.out.println();
         * }
         */

        /*
         * // Swap first row with last row
         * int row1 = 0;
         * int row2 = arr.length - 1;
         * for (j = 0; j < arr[0].length; j++) {
         * int temp = arr[row1][j];
         * arr[row1][j] = arr[row2][j];
         * arr[row2][j] = temp;
         * 
         * }
         * 
         * for (i = 0; i < arr.length; i++) {
         * for (j = 0; j < arr[0].length; j++) {
         * System.out.print(arr[i][j] + " ");
         * }
         * System.out.println();
         * }
         */
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Rotate array by shift up
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i + 1][j]; // rotate the array by shifting up
                arr[i + 1][j] = temp;
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Shift down
        System.out.println();
        for (i = arr.length - 1; i > 0; i--) {
            for (j = 0; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i - 1][j]; // rotate the array by shifting down
                arr[i - 1][j] = temp;
            }
        }
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
