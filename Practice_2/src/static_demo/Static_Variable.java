package static_demo;

public class Static_Variable {
	
	static int counter = 0; //will get memory once and retains its value
	
	public Static_Variable() {
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Static_Variable sv1 = new Static_Variable();
	Static_Variable sv2 = new Static_Variable();
	Static_Variable sv3 = new Static_Variable();
	

	}

}
