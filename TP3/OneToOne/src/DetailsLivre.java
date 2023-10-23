package src;
import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "details_livre")
public class DetailsLivre implements Serializable{

	@Id
	private String isbn;
	private int nbpages;
	private int annee_parution;

	public DetailsLivre() {
	}

	public DetailsLivre(String isbn, int nbpages, int annee_parution) {
		this.isbn = isbn;
		this.nbpages = nbpages;
		this.annee_parution = annee_parution;
	}

	public int getNbPages() {
		return nbpages;
	}
}
