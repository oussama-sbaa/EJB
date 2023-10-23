package oussama;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.PersistenceContextType;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
import java.util.ArrayList;
import javax.persistence.TypedQuery;

@Stateless
public class InfosLivreImplementation implements InterfaceInfosLivre {
  
    @PersistenceContext
    EntityManager em;

    public String getTitreParISBN(String isbn) {
        TypedQuery<String> query = em.createNamedQuery("LivreEmp.findTitreByISBN", String.class);
        query.setParameter("isbn", isbn);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public List<String> getLivresDisponibles() {
    Query query = em.createQuery("SELECT l.titre FROM LivreEmp l WHERE l.empruntepar = 0");
    List<Object> resultList = query.getResultList();
    List<String> titres = new ArrayList<String>();
    for (Object obj : resultList) {
        titres.add((String) obj);
    }
    return titres;
}
}
