package Test;

public class Acc_info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		
		Account ac1 = new Account("john", 50000);
		System.out.println(ac.getAccHolder());
		System.out.println(ac.getBalance());
		
		System.out.println(ac1.getAccHolder());
		System.out.println(ac1.getBalance());
		

		
//		Account[] acc_arr = new Account[2];
//				
//		acc_arr[0] = new Account();
//		acc_arr[1] = new Account();
//		
//		acc_arr[0].setAccHolder("John");
//		acc_arr[0].setBalance(5000);
//
//		acc_arr[1].setAccHolder("Mary");
//		acc_arr[1].setBalance(1000);
//		
		
//		ac.setAccHolder("Abc");
//		System.out.println(ac.getAccHolder());
//		ac.setBalance(10000);
//		System.out.println(ac.getBalance());
//		ac.withdrawal(3000);
//		ac.deposite(5000);
//		
//		acc_arr[0].deposite(10000);
//		acc_arr[0].withdrawal(5000);
//		
//		acc_arr[1].deposite(4000);
//		acc_arr[1].withdrawal(2000);

	}

}
