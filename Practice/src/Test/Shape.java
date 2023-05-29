package Test;

public abstract class Shape {
	double d1, d2;
	public Shape(double dim1, double dim2) {
		this.d1 = dim1;
		this.d1 = dim2;
	}
	public Shape(double dim1) {
		this.d1 = dim1;
	}
	
	abstract void area();
}

class Circle extends Shape{

	public Circle(double dim1) {
		super(dim1);
	}
	@Override
	void area() {
		System.out.println("Area is : "+d1*d1*Math.PI);
	}
	
}
class demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir = new Circle(2.00);
		cir.area();
	}
}



