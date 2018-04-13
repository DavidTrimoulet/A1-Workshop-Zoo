package fr.exia.ws.zoo;

public abstract class Animal {
	protected String nom;
	public static String DESCRIPTION = "Un animal, c'est un truc sympa";
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Je suis " + this.nom;
	}
	
	public abstract String son();
}
