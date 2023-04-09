package oop;

public class InheritanceChild extends InheritanceParent{

	String email;

	public InheritanceChild(String firstName, String lastName , String email) {
		super(firstName, lastName);
		this.email = email;
	}
	
	
	
	/*@Override
	public void greeting() {
		System.out.println("hello word from child");
	}*/
}
