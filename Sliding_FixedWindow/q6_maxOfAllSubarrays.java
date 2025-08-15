package Sliding_FixedWindow;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class q6_maxOfAllSubarrays {
    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        f(arr, arr.length, k);
    }

    public static void f(int[] arr, int n, int k) {
        int i = 0, j = 0;
        Deque<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        while (j < n) {
            while (!q.isEmpty() && arr[q.peekLast()] < arr[j]) {
                q.pollLast();// Remove elements small than cur element from back ofqueue
            }
            q.addLast(j);
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                ans.add(arr[q.getFirst()]);
                if (q.getFirst() == i) {
                    q.pollFirst();
                }
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
