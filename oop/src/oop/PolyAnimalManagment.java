package oop;

public class PolyAnimalManagment {
	PolyAnimal polyAnimal;

	public PolyAnimalManagment(PolyAnimal polyAnimal) {
		this.polyAnimal = polyAnimal;
	}

	void make() {
		polyAnimal.makeNoise();
	}
	
}
