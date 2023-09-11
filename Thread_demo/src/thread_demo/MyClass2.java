package thread_demo;

public class MyClass2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello - " + i);
		}
	}
}
