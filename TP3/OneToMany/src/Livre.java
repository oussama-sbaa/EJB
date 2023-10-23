package src;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "livre_tp32")
public class Livre implements Serializable {

	@Id
	private String isbn;
	private String titre;
	@ManyToOne
	public Auteur auteur;

	public Livre() {
	}

	public Livre(String isbn, int i, String titre) {
		this.titre = titre;
		this.isbn = isbn;

	}

	public Auteur getAuteur() {
		return auteur;
	}

	public void setAuteur(Auteur a) {
		auteur = a;
	}

	public void unSetAuteur() {
		auteur = null;
	}
	@Override
	public String toString() {
		
		return this.titre;
	}
}
