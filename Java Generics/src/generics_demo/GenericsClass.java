package generics_demo;

public class GenericsClass<T> {
	private T data;
	
	public GenericsClass(T data){
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}

	public static void main(String[] args) {
		//Integer class 
		GenericsClass<Integer> intObj = new GenericsClass<Integer>(5);
		System.out.println("Generic Integer class returns : " + intObj.getData());
		//String Class
		GenericsClass<String> strObj = new GenericsClass<String>("String class");
		System.out.println("Generics String class returns : " + strObj.getData());
		
	}
}
