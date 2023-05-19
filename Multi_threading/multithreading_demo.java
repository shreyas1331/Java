package Multi_threading;

public class multithreading_demo implements Runnable {
	
 		public void run() {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
	
	public static void main(String[] args) {
		multithreading_demo n1=new multithreading_demo();
		
		Thread t1=new Thread(n1);
		Thread t2=new Thread(n1);
		Thread t3=new Thread(n1);
		t2.start();
		t1.start();
//		try {
////			t1.join();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
		
		t3.start();
	}

}
