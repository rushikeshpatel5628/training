package demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.address = "New York";
		employee.age = 21;
		employee.name = "John";
		employee.phone = "3142545";
		employee.salary = 76000;
		employee.specialization = "Customer Suport";
		
		System.out.println(employee);
		employee.printSalary();

	}

}
