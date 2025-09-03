package OOPS;


//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods 

class Account{
	int acc_no;
	String name;
	int amt;
	
	void insert(int a,String n,int p) {
		acc_no=a;
		name=n;
		amt=p;
	}
	void deposit(int paise) {
		amt+=paise;
		System.out.println(paise+"amt desposited");
	}
	void withraw(int paise) {
		amt-=paise;
		System.out.println(paise+"amt debited");
	}
	void checkBalance() {
		System.out.println("the balance in ur acc is :"+amt);
	}
	void display() {
		System.out.println(acc_no+name+amt);
	}
}
public class L2_class_realWorldPrblm {

	public static void main(String[] args) {
		Account ac1=new Account();
		ac1.insert(1331, "Shreyas", 50000);
		ac1.display();
		ac1.deposit(10000);
		ac1.checkBalance();
		ac1.withraw(5000);
		ac1.display();
		ac1.checkBalance();
	}

}
