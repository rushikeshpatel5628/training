package thread_demo;

public class Thread_Runnable_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass2 m2 = new MyClass2();
		Thread t1 = new Thread(m2);
		t1.start();
		System.out.println("Thread name : " + t1.getName());
		System.out.println("Thread ID : " + t1.getId());

	}

}
