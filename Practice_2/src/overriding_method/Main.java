package overriding_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;
		rbi = new AXIS();
		System.out.println(rbi.getRateOfInterest());
		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());
	}

}
