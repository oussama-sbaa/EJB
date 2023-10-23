package src;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "livre_tp31")
public class Livre implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	private String isbn;
	private String titre;
	@OneToOne
	@PrimaryKeyJoinColumn(name = "isbn", referencedColumnName = "isbn")
	private DetailsLivre detailsLivre;

	public Livre() {
	}

	public Livre(String isbn, String titre) {
		this.isbn = isbn;
		this.titre = titre;
	}

	public DetailsLivre getDetails() {
		return detailsLivre;
	}
}
