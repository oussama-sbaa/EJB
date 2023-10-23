package oussama;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.PersistenceContextType;
import javax.annotation.Resource;
import java.io.*;
import javax.ejb.ApplicationException;

import oussama.Emprunteur;


@Stateful
public class GestionEmpruntsImplementation implements InterfaceGestionEmprunts {
    @PersistenceContext(unitName="PersitenceUnit",type=PersistenceContextType.EXTENDED)
    private EntityManager em;
    @Resource SessionContext ctx;
    private Emprunteur emprunteur;

    public void initSession(int numEmp) {
        emprunteur = em.find(Emprunteur.class, numEmp);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void emprunter(String isbn) throws NbMaxAtteintException,LivreEmpreinteException{
        LivreEmp livre = em.find(LivreEmp.class, isbn);
        livre.setEmpruntePar(emprunteur);
        try {
           emprunteur.emprunter();
        }
        catch(oussama.NbMaxAtteintException ex){
            if(emprunteur.numEmp == 17){
                ctx.setRollbackOnly();
                throw ex;
                System.out.println("Error")
            }
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public void rendre(String isbn) {
        LivreEmp livre = em.find(LivreEmp.class, isbn);
        livre.setEmpruntePar(null);
        emprunteur.desemprunter();
    }
}

class NbMaxAtteintException extends Exception {
    public NbMaxAtteintException (String errorMessage) {  
        super(errorMessage);  
    }  
}

public class LivreEmpreinteException extends Exception {
    public LivreEmpreinteException(String errorMessage) {  
        super(errorMessage);  
    }  
}