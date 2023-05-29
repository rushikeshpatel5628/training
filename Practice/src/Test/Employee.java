package Test;

class Employee_info{
	private String name;  
	private String yearOfJoining;
	private String address;
	 
	public Employee_info(String name, String yearOfJoining, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getYear() {
		return yearOfJoining;
	}
	public String getAddress() {
		return address;
	}
	
}
public class Employee {

	public static void main(String[] args) {
		//	 TODO Auto-generated method stub
		Employee_info[] ei = new Employee_info[3];
		ei[0] = new Employee_info("Robert", "1994", " 64C- WallsStreat");
		ei[1] = new Employee_info("Sam", "2000", " 64D- WallsStreat");
		ei[2] = new Employee_info("John", "1999", " 26B- WallsStreat");

		System.out.println("Name \t Year of Joining \t  Address");
		for (int i = 0; i < ei.length; i++) {
			System.out.println(ei[i].getName() + " \t " + ei[i].getYear() + " \t \t" + ei[i].getAddress());
		}
	}

}
