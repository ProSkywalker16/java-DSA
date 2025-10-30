public class stepscount {
    static int steps(int n, int count) {

        // Base case
        if (n == 1) {
            return count;
        }

        // Recursive case
        if (n % 2 == 0) {
            return steps(n / 2, count + 1);
        } else {
            return steps(n - 1, count + 1);
        }
    }

    public static void main(String[] args) {
        int n = 8;
        int totalSteps = steps(n, 1);
        System.out.println(totalSteps);

    }
}
