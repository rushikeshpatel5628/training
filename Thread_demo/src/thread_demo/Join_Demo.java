package thread_demo;

public class Join_Demo {
	public static void main(String args[]) {
		final Thread t1 = new Thread() {
			public void run() {
				System.out.println("Printing 1 to 10");
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
			};
		};
		final Thread t2 = new Thread() {
			public void run() {
				try {
					t1.join(5000, 50000);
				} catch (Exception e) {
					System.out.println("error");
				}
				System.out.println("Printing 11 to 20");
				for (int i = 11; i <= 20; i++) {
					System.out.println(i);
				}
			};
		};
		
		t1.start();
		t2.start();
		
	}
}
