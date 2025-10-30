public class string_subset {
    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.err.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p + ch, up.substring(1));
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int i;
        for (i = 0; i < p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    public static void main(String[] args) {
        // subseq("", "abc");
        permutations(" ", "abc");
    }
}
