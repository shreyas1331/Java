package Sorting_techniques;

import java.util.Arrays;

//inplace algo, stable algo
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 5, 1 };
        bubbleSort(arr, arr.length);
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) { // n-1 itrations
            for (int j=0;j<n-i-1;j++) { // last i elements are already in sorted manner
                if (arr[j]>arr[j + 1]) {
                    int temp = arr[j]; // swap
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}