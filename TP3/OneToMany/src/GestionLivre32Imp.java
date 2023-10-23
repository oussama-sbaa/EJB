package src;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class GestionLivre32Imp implements IGestionLivre32 {
	@PersistenceContext(unitName = "persistencecoursSN")
	protected EntityManager entityManager;

	public String getAuteur(String isbn) {
		Livre livre = entityManager.find(Livre.class, isbn);
		return livre.getAuteur().getNom();
	}

	public void setAuteur(String isbn, int auteurId) {
		Livre livre = entityManager.find(Livre.class, isbn);
		if (livre == null) throw new RuntimeException("livre inéxistant !");
		Auteur auteur = entityManager.find(Auteur.class, auteurId);
		if (auteur == null) throw new RuntimeException("auteur inéxistant !");
		livre.setAuteur(auteur);
		this.entityManager.merge(livre);
	}

	public void unSetAuteur(String isbn) {
		Livre livre = entityManager.find(Livre.class, isbn);
		if (livre == null) throw new RuntimeException("livre inexistant !");
		livre.unSetAuteur();
		entityManager.merge(livre);
	}

	public ArrayList<Livre> getLivresAuteur(String isbn){
    	Livre livre = entityManager.find(Livre.class,isbn);
        if(livre == null) throw new RuntimeException("livre inéxistant !");
        if(livre.getAuteur()==null) throw new RuntimeException("auteur inexistant pour ce livre !");
        return livre.getAuteur().getLivres();
    }
}