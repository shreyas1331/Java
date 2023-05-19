package Exception_handling;

public class Exception_test {

	public static void main(String[] args) throws Exception {
		System.out.println("main methid started");
		int a=9,b=0,c;
		int[] arr=new int[5];
		
		if(a==9) {
			throw new Exception("helo");}
		c=8;
		System.out.println(c);
			arr[7]=5;
		
		System.out.println("main method ended");
	}

}
