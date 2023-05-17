package Queue;
public class Queueee {

//	public static void main(String[] args) {
		int front=0;
		int rear=0;
		int size=0;
		int[]data;
		public Queueee() {
			data =new int[5];
		}
		public Queueee(int val) {
			data=new int[val];
		}
		public boolean isEmpty() {
			return size==0;
		}
		public void add(int val) throws Exception {
			if(isFull()) {
				throw new Exception("queue is full");
			}
			int idx=(front+size)%data.length;
			data[idx]=val;
			size++;
		}
		public int remove() throws Exception{
			if(isEmpty()) {
				throw new Exception ("Queue is empty");
			}
			int val=data[front];
			front=(front+1)%data.length;
			size--;
			return val;
		}
		private boolean isFull() {
			// TODO Auto-generated method stub
			return size==data.length;
		}
	}


