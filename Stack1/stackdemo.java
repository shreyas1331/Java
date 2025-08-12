package Stack1;

public class stackdemo {

	int[] arr = new int[5];
	int tos = -1;
	int size = 0;

	public boolean isEmpty() {
		if (tos == -1) {
			return true;
		}
		return false;
	}

	public void push(int val) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		arr[tos] = val;
		size++;
	}

	public void pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		tos--;
		size--;
	}

	public int peek() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		return arr[tos];
	}

	public boolean isFull() {
		return tos == arr.length - 1;
	}

	public void display() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is empty");
		}
		for (int i = tos; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) throws Exception {
		stackdemo st = new stackdemo();
		System.out.println(st.isFull());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		// st.push(60);
		st.display();
		System.out.println();
		System.out.println(st.isFull());
		st.pop();

		System.out.println(st.peek());

	}
}