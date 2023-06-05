package Test;

public class Aca_stu extends Student_par{
	
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
		
		
	
}
