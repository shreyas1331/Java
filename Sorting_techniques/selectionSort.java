package Sorting_techniques;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 9, 6, 8 };
        solve(arr, arr.length);
    }

    public static void solve(int[] arr, int n) {    //find min and swap
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            if (min_idx != i) {
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
