package quiz1;

public class Product {
	String name;
	double price;
	int quantity;
	static int totalSold = 0;
	
	Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
	
	void sell(int quantity) {
		if (quantity <= this.quantity ) {
			this.quantity -= quantity;
			totalSold += quantity;
			System.out.println(quantity + " " + this.name + "(s) sold successfully.");
		}else {
			System.out.println("Insufficient quantity of " + name + " to sell.");
		}
	}
	
	static int getTotalSold() {
		return totalSold;
	}
	
	
	
}
