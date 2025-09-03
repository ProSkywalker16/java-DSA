import java.util.*;

public class reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, t, r = 1, s = 0;
        System.out.println("enter number:");
        n = sc.nextInt();
        t = n;
        while (t > 0) {
            r = t % 10;
            s = (s * 10) + r;
            t = t / 10;

        }
        System.out.println("The reverse of " + n + " is " + s);
    }
}
