
import java.util.ArrayList;

public class linear {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 67, 65, 121, 3, 43, 56, 3 };
        // System.out.println(find(arr, 3, 0));
        // System.out.println(findIndex(arr, 3, 0));
        findAllIndex(arr, 3, 0); // populate list
        System.out.println(list);
    }

    static boolean find(int arr[], int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return ((arr[index] == target) || (find(arr, target, index + 1)));
    }

    static int findIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }

        return (findIndex(arr, target, index + 1));
    }

    // list all instances of target element
    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }

}
