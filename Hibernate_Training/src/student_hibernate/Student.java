package student_hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
@javax.persistence.Table(name="student")
public class Student {
	@Id
	private int id;
	private String name;
	
	public Student() {
     //Empty contructor
	}
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}
