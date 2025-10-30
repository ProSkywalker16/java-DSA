import java.util.*;

public class maze {

    // THIS RETURNS THE NUMBER OF PATHS
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);

        return left + right;
    }

    // THIS RETURNS THE PATHS TAKEN
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);

        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    // THIS RETURNS THE ARRAYLIST OF PATHS TAKEN
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + "D", r - 1, c));
        }
        if (c > 1) {
            list.addAll(pathRet(p + "R", r, c - 1));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter row and column position");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.println("The number of steps to solve is:" + count(r, c));
        System.out.println("Number of paths:");
        path(" ", r, c);

        System.out.println(pathRet(" ", r, c));
    }
}
