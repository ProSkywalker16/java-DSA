import java.util.*;

public class switchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * System.out.println("Enter fruit:");
         * String fruit = sc.next();
         * switch (fruit) {
         * case "Mango":
         * System.out.println("King of all");
         * break;
         * case "Orange":
         * System.out.println("Class 2");
         * break;
         * case "Apple":
         * System.out.println("Category 3");
         * break;
         * default:
         * System.out.println("sorry unidentified");
         * 
         * }
         */

        System.out.print("Enter day:");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
}
