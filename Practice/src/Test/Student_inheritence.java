package Test;

public class Student_inheritence extends Student_par{
	String EnrN0;
	String result;
	
	public String getEnr() {
		return EnrN0;
	}
	public void setEnr(String enr) {
		this.EnrN0 = enr;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String res) {
		this.result = res;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return EnrN0;
	}
	public void setAdd(String add) {
		this.adress = add;
	}
	
	@Override
	public String toString() {
		return ("Name : " + getName() + " Address : " + getAdd() +   "Enr no : " + getEnr() + " Result : " + getResult());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_inheritence si = new Student_inheritence();
		si.setAdd("Modasa");
		si.setEnr("20002");
		si.setName("John");
		si.setResult("95");
		System.out.println(si);
		}

}
