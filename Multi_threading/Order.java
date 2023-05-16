package Multi_threading;
//
//public class Syncro_Demo extends Thread {
//	int t=10;
//	public void run() {
//		t=t-5;
//		System.out.println("Running");
//		for(int i=0;i<5;i++) {
//			try {
//				Thread.sleep(500);
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//			System.out.println(i);
//		}
//	}
//	public static void main(String[] args) {
//		Syncro_Demo t1=new Syncro_Demo();
//		Syncro_Demo t2=new Syncro_Demo();
//		t1.start();
//		t2.start();
//	}
//
//}
class shop {
    int totalitems = 10;

    public void getitems(int n) {
        if (totalitems >= n) {
            System.out.println("Order sucess");
            totalitems -= n;
        } else {
            System.out.println("Order fail");
        }
    }
}

public class Order extends Thread {
    int n;
    static shop p;

    public void run() {
        p.getitems(n);
    }

    public static void main(String[] args) {
        p = new shop();

        Order t1 = new Order();
        t1.n = 7;

        Order t2 = new Order();
        t2.n = 5;

        t1.start();
        t2.start();
        }
}
