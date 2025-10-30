
class Solution {
    int search(int [] arr, int target)
    {
        int peak=peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, )
    }



    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) { // note: strict < not <=
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
        }

        // loop ends when start == end, which is the peak index
        return start;
    }
}