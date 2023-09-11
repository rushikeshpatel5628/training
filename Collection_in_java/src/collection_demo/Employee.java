package collection_demo;

public class Employee implements Comparable<Employee>{
	
	private int eno;
	private String ename;
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	
	public int compareTo(Employee other) {
        return Integer.compare(this.eno, other.eno);
    }
	
	public Employee() {
		
	}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	 public String toString() {
	        return "Employee{" +
	                "id=" + eno +
	                ", name='" + ename + '\'' +
	                '}';
	    }
	
	
	
}
