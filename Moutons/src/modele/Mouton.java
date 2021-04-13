  
package modele;

public class Mouton {
	
	protected String id;
	protected String nom;
	protected String couleur;
	protected double poids;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public void setId(String id2) {
		this.id = id2;
	}
	
	public String getId() {
		return id;
	}

}