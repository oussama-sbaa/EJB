package src;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class GestionLivre31Imp implements IGestionLivre31{
    @PersistenceContext(unitName="persistencecoursSN")
	private EntityManager entityManager;
   
    public int getNbPages(String isbn)
    {   
        Livre livre = entityManager.find(Livre.class,isbn);
        if(livre == null) throw new RuntimeException("Livre non trouvé !");   
        return livre.getDetails().getNbPages();
    }
    
}