public class recursion {
    static int s = 0;

    static int rev(int n) {
        if (n == 0) {
            return s;
        }
        int r = n % 10;
        s = (s * 10) + r;
        return rev(n / 10);

    }

    static boolean isPalin(int n) {
        s = 0;
        return n == rev(n);
    }

    public static void main(String[] args) {
        System.out.println(isPalin(121));
    }
}
