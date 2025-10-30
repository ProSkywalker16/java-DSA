import java.util.*;

public class Even_digits {
    static int findNumbers(int[] nums) {
        int c = 0;
        for (int num : nums) {
            if (even(num)) {
                c++;
            }
        }
        return c;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int num) {
        int count = 0;
        if (num < 0) {
            num *= -1;
        }
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

}
