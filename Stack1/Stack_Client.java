package Stack1;

public class Stack_Client {

	public static void main(String[] args) throws Exception {
		stackdemo st=new stackdemo();
		System.out.println(st.isFull());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.display();
//		System.out.println(st.isFull());
//		st.pop();
		
//		System.out.println(st.peek());
		
	}

}
