package oussama;
import javax.ejb.Stateless;
import javax.persistence.*;
import java.io.*;

@Entity
@Table(name="livre")
public class Livre implements Serializable{


  @Id
  private String isbn;

  private String titre;

  private int  dispo;

  public Livre(){}

  public Livre(String isbn, String titre){
    this.isbn=isbn;
    this.titre=titre;
    this.dispo=1;
  }
  
    public String getIsbn(){
      return this.isbn;
    }

    public String getTitre(){
      return this.titre;
    }

    public int getDispo(){
      return this.dispo;
    }

    public void setIsbn(String isbn){
      this.isbn = isbn;
    }

    public void setTitre(String titre){
      this.titre = titre;
    }

    public void setDispo(int dispo){
      this.dispo = dispo;
    }
  
}


