package sorting;

public class MergeSort {

    public static void mergeSort(int[] arr, int low, int high) {

        // base case
        if (low < high) {

            int mid = (low + high) / 2;

            // divide into left half
            mergeSort(arr, low, mid);

            // divide into right half
            mergeSort(arr, mid + 1, high);

            // merge both sorted halves
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        // temporary arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // copy left half
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[low + i];
        }

        // copy right half
        for (int i = 0; i < n2; i++) {
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0;      // pointer for leftArr
        int j = 0;      // pointer for rightArr
        int k = low;    // pointer for original arr

        // compare both arrays
        while (i < n1 && j < n2) {

            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } 
            else {
                arr[k] = rightArr[j];
                j++;
            }

            k++;
        }

        // remaining elements from leftArr
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // remaining elements from rightArr
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 11, 13, 5, 6, 7};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}