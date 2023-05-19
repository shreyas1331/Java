package Multi_threading;

//public class MultiThreading_Demo extends Thread {
//
//	public void run() {
//		System.out.println("Running.....");
//	}
//
//	public static void main(String[] args) {
//		MultiThreading_Demo m1 = new MultiThreading_Demo();
//		m1.start();
//
//	}
//
//}

//--------------------------------------------------//

//public class MultiThreading_Demo implements Runnable {
//
//	public void run() {
//		System.out.println("Running.....");
//	}
//
//	public static void main(String[] args) {
//		MultiThreading_Demo m1 = new MultiThreading_Demo();
//		Thread t1 = new Thread(m1);
//		Thread t2 = new Thread(m1);
//		t1.start();
//		t2.start();
//
//	}
//}

//--------------------------------------------------//

//public class MultiThreading_Demo implements Runnable {
//
//	public void run() {
//		for(int i=0;i<5;i++) {
//			try {
//				Thread.sleep(500);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//		
//		System.out.println("Running.....");
//	}
//

//--------------------------------------------------//

//	public static void main(String[] args) {
//		MultiThreading_Demo m1 = new MultiThreading_Demo();
//		Thread t1 = new Thread(m1);
//		Thread t2 = new Thread(m1);
//		t1.start();
//		t2.start();
//
//	}
//
//}

//--------------------------------------------------//

public class basic implements Runnable {

	public void run() {
		System.out.println("Running.....");
	}

	public static void main(String[] args) {
		basic m1 = new basic();
		Thread t1 = new Thread(m1,"A");
		Thread t2 = new Thread(m1,"B");
//		t1.setName("A");
//		t2.setName("B");
		System.out.println(t1.getName());
		System.out.println(t2.getName());

		System.out.println(t1.getPriority());
		
//		t1.setPriority(15);
		
		System.out.println(t1.isAlive());
		t1.start();
//		t1.start();
		System.out.println(t1.isAlive());
		t2.start();

	}

}