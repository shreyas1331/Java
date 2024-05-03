package Hash_Map3;
import java.util.*;
public class pair_sum
{
    public static void main (String[] args) {
        int arr[] = new int[]{3, 8, 4, 7, 6, 1};
        int len = arr.length;
        int x = 14;
        System.out.println(pairWithSumX(arr, len, x));
    }
    static int pairWithSumX(int arr[],int n, int X)
    {
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < n; i++)
        {
            if(hs.contains(X - arr[i]))//14-6
              return 1;
              
            hs.add(arr[i]);
        }
        return 0;
       // hs->3->10->7
//        1
    }
}
