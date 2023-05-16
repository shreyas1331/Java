package Exception_handling;

public class StudentClient {
	public static void main(String[] args)  {
		Student st = new Student();
//		st.age = 12;
//		st.name = "Ram";
		st.setName("Ram");
//		try {
//			st.setAge(-13);
//		}
//		catch (Exception e) {
////			System.out.println(e);
//			e.printStackTrace();
//		}
		st.setAge(-12);
		
		System.out.println(st.getAge());
		System.out.println(st.getName());

	}

}