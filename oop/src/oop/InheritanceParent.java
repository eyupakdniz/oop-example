package oop;

public class InheritanceParent {

	String firstName;
	String lastName;
	
	
	
	public InheritanceParent(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void greeting() {
		System.out.println("hello word from parent");
	}
	
	public void parentMethod() {
		System.out.println("parent method");
	}
}
