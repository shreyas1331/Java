// Java program to demonstrate 
// working of HashSet 
package Hash_Map2;
import java.util.*; 

public class working_HashSet 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 

        h.add("gfg"); 
        h.add("courses"); 
        h.add("ide"); 

        System.out.println(h);
        
   
        System.out.println(h.contains("ide"));
        h.remove("ide");
        System.out.println(h.size());
        
        
        Iterator<String> i = h.iterator();
        //printing through iterartor
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        //printing through for each loop
        for(String s:h) {
        	System.out.print(s+" ");
        }   
    } 
} 
