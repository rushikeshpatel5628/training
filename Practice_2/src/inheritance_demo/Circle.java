package inheritance_demo;

public class Circle {
	int radius;
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	public void getArea() {

		double result = 3.14 * this.radius * this.radius;
		System.out.println("Circle area : " + result);
	}
}
