package ie.itcarlow.lab7;

public class Vet {

	private String name;
	
	public Vet (String name) { 
		this.name = name;
	}
	
	public void vaccinate(Animal animal) {
		
		System.out.println(name + "Vaccinating...");
		if (animal instanceof Dog) {
			System.out.println("Dog is Vacinated: " + animal);
		}
		else if (animal instanceof Cat) {
			System.out.println("Cat is Vaccinated" + animal);
		}
		else {
			System.out.println("Vet can only vaccinate Dogs and Cats");
			
			
		}
	}
	
}
