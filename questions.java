import java.util.*;

public class questions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        questions ob = new questions();
        int result = ob.armstrong(n);
        if (result == 1) {
            System.out.println(n + " is armstrong ");
        } else {
            System.out.println(n + " is not armstrong");
        }
        /*
         * boolean result = ob.isPrime(n);
         * if (result == false) {
         * System.out.println("is not a prime number");
         * 
         * } else {
         * System.out.println("is a prime number");
         * }
         */
    }

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

    int armstrong(int n) {
        int r, t, s = 0;
        t = n;
        while (t > 0) {
            r = t % 10;
            s = s + (r * r * r);
            t = t / 10;

        }
        if (s == n) {
            return 1;
        } else {
            return 0;
        }
    }
}