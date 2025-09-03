import java.util.Scanner;

public class repetition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int c = 0;
        System.out.println("Enter number to find instances of:");
        int m = sc.nextInt();
        while (n > 0) {
            int r = n % 10;
            if (r == m) {
                c++;
            }
            n = n / 10;
        }
        System.out.println("The number of instances of " + m + " are " + c);

    }
}
