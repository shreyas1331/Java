package Hash_Map3;

import java.util.*;
public class frequency_element
//we can use hashmap to get the answer but it will give us in random order
//so to get in the order as given use LinkedHashMap
{
    public static void main (String[] args) {
        int arr[] = new int[]{15, 16, 27, 27, 28, 15};
        int n = arr.length;
        
        countFreq(arr, n);
    }
    static void countFreq(int arr[], int n)
    {
        LinkedHashMap<Integer, Integer> hmp = new LinkedHashMap<Integer, Integer>();//created a map
        for(int i = 0; i < n; i++)
        {
//            int key = arr[i];
            if(hmp.containsKey(arr[i]) == true)
              hmp.put(arr[i], hmp.get(arr[i]) + 1);
            else
              hmp.put(arr[i], 1);    
        }
    
       for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
        System.out.println(itr.getKey() + " " + itr.getValue());
    }
}
//15 2
//16 1
//27 2
//28 1
