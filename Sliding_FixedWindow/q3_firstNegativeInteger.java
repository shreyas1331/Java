package Sliding_FixedWindow;
import java.util.*;
public class q3_firstNegativeInteger {
    public static void f(int[]arr,int n,int k){
        ArrayList<Integer> al=new ArrayList<>();
        Deque<Integer> q=new LinkedList<>();
        int i=0,j=0;
        while(j<n){
            if(arr[j]<0) q.add(arr[j]);
            if(j-i+1<k) j++;
            else if(j-i+1==k){
                if(q.isEmpty()) al.add(0);
                else{
                    al.add(q.getFirst());
                    if(arr[i]==q.getFirst()){
                        q.removeFirst();
                    }
                }
                i++;
                j++;
            }
        }
        System.out.println(al);
    }
    public static void main(String[]args){
        int[]arr={12,-1,-7,8,-15,30,16,28};
        int k=3;
        f(arr,arr.length,k);
        solve(arr,arr.length,k);
    }
    public static void solve(int[]arr,int n,int k){
        Deque<Integer> q=new LinkedList<>();
        ArrayList<Integer> al=new ArrayList<>();
        int i=0,j=0;
        while(j<n){
            if(arr[j]<0){
                q.add(arr[j]);
            }
            if(j-i+1<k) j++;
            
            else if(j-i+1==k){
                if(q.isEmpty()){
                    al.add(0);
                }    
                else{
                    al.add(q.getFirst());
                    if(arr[i]==q.getFirst()){
                        q.removeFirst();
                    }
                }   
                i++;
                j++;
            }
        }
        System.out.println(al);
    }
}
