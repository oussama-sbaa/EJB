package src;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "auteur")
public class Auteur implements Serializable {

	@Id
	private int num;
	private String nom;
	@OneToMany(mappedBy = "auteur")
	public ArrayList<Livre> livres;

	public Auteur() {
	}

	public Auteur(String nom, int i) {
		this.num = i;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Livre> getLivres() {
		return livres;
	}
	@Override
	public String toString() {
		return this.nom;
	}

}
