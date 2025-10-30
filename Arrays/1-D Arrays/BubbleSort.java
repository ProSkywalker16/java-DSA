class BubbleSort {
    static void BubbleSort(int arr[]) {
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 67, 4, 32, 43, 3 };
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}