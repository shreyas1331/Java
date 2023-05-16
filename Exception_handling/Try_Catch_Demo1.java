package Exception_handling;

public class Try_Catch_Demo1 {
	public static void main(String[] args) {

		int[] arr = new int[5];
//		int a = 10;
//		String s = null;

		try {
//			int k = a / 0;
			arr[7] = 13;
//			System.out.println(s.length());
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
			int b=9;
			System.out.println(b);
//			try {
//				arr[7] = 13;
//				System.out.println(s.length());
//			} catch (ArithmeticException e) {
//				e.printStackTrace();
//			} catch (NullPointerException e) {
//				e.printStackTrace();
//			} 
		}
	}
	}

