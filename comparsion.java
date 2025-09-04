public class comparsion {
    public static void main(String args[]) {

        comparator();
        comparator_object();

    }

    // reference variables will point to same object thus result must be true
    static void comparator() {
        String a = "James";
        String b = "James";
        System.out.println(a == b);

    }

    // reference variables will point to different objects, hence result will be
    // false
    static void comparator_object() {
        String a = new String("James");
        String b = new String("James");
        System.out.println(a == b);
        System.out.println(a.equals(b)); // This will return true as only checks for values and does not care about same
                                         // or diff object
    }
}
