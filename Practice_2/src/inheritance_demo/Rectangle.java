package inheritance_demo;

public class Rectangle {
	
	int length, width;
	public Rectangle(int length, int width) {
		// TODO Auto-generated constructor stub
		this.length = length;
		this.width = width;
	}
	
	public void getArea() {
		int result = length * width;
		System.out.println("Rectangle area : " + result);
	}
}
