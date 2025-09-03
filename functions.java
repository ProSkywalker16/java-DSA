import java.util.*;

public class functions {
    void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = sc.nextInt();
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is = " + sum);
        sc.close();
    }

    int sum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a:" + a + " b:" + b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        functions ob = new functions();
        System.out.println("Enter numbers to swap:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        ob.swap(x, y);

        /*
         * System.out.println("Enter name:");
         * String name=sc.next();
         * // ob.sum();
         * // int result = ob.sum2(5, 6);
         * // System.out.println(result);
         * 
         * String personalized = ob.myGreet(name);
         * System.out.println(personalized);
         */
    }
}
