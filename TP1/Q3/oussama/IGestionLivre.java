package oussama;
import javax.ejb.Remote;


@Remote
public interface IGestionLivre{
	
	public void nouveauLivre(String isbn, String titre);
	public void supprimerLivre(String isbn);
	public String emprinterLivre(String isbn);
	public String rendreLivre(String isbn);
	
}

