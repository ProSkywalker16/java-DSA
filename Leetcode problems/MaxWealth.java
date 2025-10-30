import java.util.*;

public class MaxWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input rows and columns
        System.out.println("Enter number of customers (rows):");
        int rows = sc.nextInt();
        System.out.println("Enter number of banks (columns):");
        int cols = sc.nextInt();

        int[][] accounts = new int[rows][cols];

        System.out.println("Enter wealth matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }

        MaxWealth mw = new MaxWealth();
        int result = mw.maximumWealth(accounts);

        System.out.println("Maximum wealth = " + result);
    }

    public int maximumWealth(int[][] accounts) {
        int i, j;
        int ans = 0;
        for (i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
