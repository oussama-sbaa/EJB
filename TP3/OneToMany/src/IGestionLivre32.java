package src;

import java.util.ArrayList;

import javax.ejb.Remote;

@Remote
public interface IGestionLivre32 {

	public String getAuteur(String isbn);

	public void setAuteur(String isbn, int auteur);

	public void unSetAuteur(String isbn);

	public ArrayList<Livre> getLivresAuteur(String isbn);

}
