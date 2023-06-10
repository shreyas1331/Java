package Hash_Map1;
import java.util.*;
public class demo1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

	    hm.put(1, "Java");
	    hm.put(2, "Python");
	    hm.put(3, "JavaScript");
	    System.out.println("HashMap: " + hm);

	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + hm.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + hm.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + hm.entrySet());
	    String value=hm.remove(2);
	    System.out.println(hm);
	}

}
