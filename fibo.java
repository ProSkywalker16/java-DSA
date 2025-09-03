import java.util.*;

public class fibo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1;
        System.out.println("Enter nth term:");
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("The number is: " + a);
            return;
        } else if (n == 2) {
            System.out.println("The number is: " + b);
            return;
        }

        for (int c = 3; c <= n; c++) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println("The number is: " + b);
    }
}
