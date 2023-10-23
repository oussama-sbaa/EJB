import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import java.util.Scanner;
import oussama.GestionEmprunts;
import oussama.InfosLivre;
import java.util.List;
import java.util.ArrayList;

public class Client {

  public static void main(String[] args) throws NamingException {

    InitialContext context = new InitialContext();
    GestionEmprunts gestionEmprunts = (GestionEmprunts) context.lookup("oussama.GestionEmprunts");

      gestionEmprunts.initSession(17);

      gestionEmprunts.emprunter("124");

      //gestionEmprunts.rendre("124");

      InfosLivre infosLivre = (InfosLivre) context.lookup("oussama.InfosLivre");
      
      // Récupération du titre d'un livre par son ISBN
      //String titre = infosLivre.getTitreParISBN("666");
      //System.out.println("Titre du livre : " + titre);

      //List<String> titres = infosLivre.getLivresDisponibles();
        //System.out.println("Livres disponibles : ");
        //for (String titre2 : titres) {
          //  System.out.println("- " + titre2);
        //}
}
}
