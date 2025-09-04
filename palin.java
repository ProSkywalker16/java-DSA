import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        boolean state = isPalin(str);
        if (state == true) {
            System.out.println(str + " is palindrome");

        } else {
            System.out.println(str + " is not palindrome");
        }

    }

    static boolean isPalin(String str) {
        str = str.toLowerCase();
        int n = str.length();
        for (int i = 0; i <= n / 2; i++) // This signifies that loop will stop at middle of string
        {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i); // This line finds the mirror character from the end for the
                                                         // current index i

            if (start != end) {
                return false;
            }
        }

        return true;
    }
}
