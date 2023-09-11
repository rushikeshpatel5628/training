package generics_demo;

class demo{
	
	public <T> void genericMethod(T data) {
		System.out.println("Data : " + data);
	}
	
}


public class GenericsMethos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo demo = new demo();
		demo.<Integer>genericMethod(5);
		demo.<String>genericMethod("Generic Method");
	}

}
