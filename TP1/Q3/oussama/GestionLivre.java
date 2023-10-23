package oussama;
import javax.ejb.*;
import javax.persistence.*;

@Stateless
public class GestionLivre implements IGestionLivre{
	
	@PersistenceContext(unitName="MonLivrePersistence")
	protected EntityManager em;
	
	@Override
	public void nouveauLivre(String isbn, String titre ){
        Livre livre =new Livre(isbn , titre);
        em.persist(livre);
    }
    
	@Override
  	public void supprimerLivre(String isbn){

  		Livre livre = em.find(Livre.class,isbn);
  		if(livre!=null)
  		{
  			em.remove(livre);
  		}
  		}
  		
	@Override
  	public String emprinterLivre(String isbn){
		  Livre livre = em.find(Livre.class,isbn); 
		  if(livre != null){ 
	       if(livre.getDispo() == 1){
			   livre.setDispo(0);
			   return "The book was successfully borrowed";
	       }else{
	      	  return "This book is not available, you cannot borrow it";
	       }
        }else{
           return "The book is not available in database";
        }
  }


    @Override
  public String rendreLivre(String isbn){
      Livre livre = em.find(Livre.class , isbn);
       if(livre != null){
	      if(livre.getDispo() == 0){         
               livre.setDispo(1);  
               return "The book was returned";	             
	      }else{
	           return "This book is already available";
	      }
       }else{
       	    return "This book does not exist";
       }
}
}

