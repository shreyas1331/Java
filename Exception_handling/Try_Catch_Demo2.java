package Exception_handling;

public class Try_Catch_Demo2 {
	public static void main(String[] args) {

		int[] arr = new int[5];
		int a = 10;
//		String s = null;

		try {
			try {
				arr[7] = 13;
			} catch (Exception e) {
				e.printStackTrace();
			}
			int k = a / 0;
			System.out.println(k);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}