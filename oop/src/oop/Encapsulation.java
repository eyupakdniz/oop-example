package oop;

public class Encapsulation {

	private String firstName;
	private String lastName;
	private int age;
	
	
	public Encapsulation(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	/*public void setAge(int age) {
		age = _age;
	}*/
	
	public void getSummer() {
		System.out.println(this.firstName + " " + this.lastName + " " + this.age);
	}
	

}
