package quiz1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("Parle", 10, 10);
		Product p2 = new Product("Gooday", 20, 20);
		Product p3 = new Product("Fab", 30, 5);
		
		p1.sell(5);
		p2.sell(10);
		p3.sell(2);
		System.out.println("Total products sold : " + Product.getTotalSold());
		
		
	}

}
