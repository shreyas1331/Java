package Multi_threading;

public class Create_Thread_Class extends Thread {

	Create_Thread_Class(){
		super("Thread_thread");
		System.out.println(Thread.currentThread());
	}
	public void run(){
		try{
			Thread.sleep(1000);
			
			System.out.println(Thread.currentThread());
		}
		catch(InterruptedException e){
			System.out.println("Child Thread Interrupted");
		}
		System.out.println("Child thread ending");
	}
	public static void main(String[] args) {
		Create_Thread_Class ThreadOb = new Create_Thread_Class(); 
		System.out.println(Thread.currentThread());
		ThreadOb.start();
		try{
			System.out.println(ThreadOb);
			Thread.sleep(1000);
			ThreadOb.interrupt();
			System.out.println(Thread.currentThread());
			System.out.println(ThreadOb);
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread ended");
	}

}