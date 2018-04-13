package fr.exia.ws.zoo;
import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> animaux;
	
	public Zoo() {
		animaux = new ArrayList<Animal>();
	}
	
	public void ajouterAnimal(Animal a) {
		animaux.add(a);
	}
	
	@Override
	public String toString() {
		String s = "le zoo contient : \n";
		for (Animal animal : animaux) {
			s += animal.getNom() + "\n";
		}
		return s;
	}
}
