package oussama;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "LivreEmp.findTitreByISBN", query = "SELECT l.titre FROM LivreEmp l WHERE l.isbn = :isbn")

@Table(name = "Livre_Emp")
public class Livre {
    @Id
    public String isbn;
    public String titre;
    public int empruntepar;


    public LivreEmp() {
    }

    public LivreEmp(String isbn, String titre) {
        this.isbn = isbn;
        this.titre = titre;
        this.empruntepar = empruntepar;
    }

    public void setEmpruntePar(Emprunteur emprunteur) {
    if (emprunteur == null) this.empruntepar = 0; 
    else this.empruntepar = emprunteur.numEmp;
    }
}
