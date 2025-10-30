public class QuickSort {
    static void quickSort(int arr[], int low, int high) {

        if (low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];
        while (s <= e) {
            while (arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp;
                temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, low, e); // for left side
        quickSort(arr, s, high); // for right side

    }

    static void QuickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 67, 4, 32, 43, 3 };
        QuickSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
