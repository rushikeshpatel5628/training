package inheritance_demo;

public class Triangle implements Shape{
	
	int base;
	int height; 
	
	public Triangle(int base, int height) {
		// TODO Auto-generated constructor stub
		this.base = base;
		this.height = height;
	}
	
	public void getArea() {
		int result = (this.base * this.height ) / 2;
		System.out.println("Triangle area : " + result);
	}
}
