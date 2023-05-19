package Exception_handling;

public class Exception_test {

	public static void main(String[] args) {
		System.out.println("main methid started");
		int a=9,b=0,c;
		int[] arr=new int[5];
		try {
			c=a/b;
			System.out.println(c);
			arr[7]=5;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("main method ended");
	}

}
