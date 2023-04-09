package oop;

public class Main {


	public static void main(String[] args) {
		
		//Encapsulation
		/*Encapsulation encapsulation = new Encapsulation();
		encapsulation.setFirstName("Ali");
		encapsulation.setLastName("Yılmaz");
		encapsulation.setAge(50);*/
		
		Encapsulation encapsulation = new Encapsulation("osman", "alp", 20);
		System.out.println(encapsulation.getFirstName() + " " + encapsulation.getLastName() + " " + encapsulation.getAge());
		
		
		//Inheritance
		InheritanceChild child = new InheritanceChild("ali", "veli","aliveli@gmail.com");
		child.greeting();
		System.out.println(child.firstName + " " + child.lastName + " " + child.email);
		child.parentMethod();
		
		//Abstract
		AbstractChild abstractt= new AbstractChild();
		abstractt.methodFirst();
		abstractt.methodSecend();
		
		//Polymorphism 
		/*PolyAnimal animal = new PolyAnimal();
		PolyDog dog =new PolyDog();
		PolyCaddy caddy = new PolyCaddy();*/
		
		PolyAnimal animal = new PolyCaddy();  //PolyDog();  PolyCaddy();  PolyAnimal();
		
		PolyAnimalManagment managment = new PolyAnimalManagment(animal);
		
		managment.make();
	}
}



















