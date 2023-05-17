package String1;
public class StringBuildeers {
//1. SET CHAR AT   &   APPEND
//2. INSERT        &   DELETE CHAR AT
//3. REVERSE	   &   DELETE
	public static void main(String[] args) {
		StringBuilder str =new StringBuilder("hello");
		System.out.println(str);
		
		//hello -> mello
		str.setCharAt(0, 'm');
		System.out.println(str);
		
		//mello -> melloworld
		str.append("world");
		System.out.println(str);
		
		//melloworld -> meylloworld
		str.insert(2, 'y');
		System.out.println(str);
		
		//meylloworld -> eylloworld
		str.deleteCharAt(0);
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		str.reverse();
		System.out.println(str);

		str.delete(2,4);//2 to 3 delete
		System.out.println(str);
	}

}
