public class mergesort {
    static void mergesort(int arr[]) {
        if (arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;

        // split into two halves
        int left[] = new int[mid];
        int right[] = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergesort(left);
        mergesort(right);
        merge(arr, left, right);
    }

    static void merge(int arr[], int left[], int right[]) {
        int i = 0, j = 0, k = 0;

        // compare and merge
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // copy remaining elements from left
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // copy remaining elements from right
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 10, 65, 5, 87, 3, 80, 67, 7 };
        mergesort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
