package abstractdemo;

public abstract class Animal {
	String name;
	int age;
	public Animal(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}
	abstract void makeSound();
	
}
