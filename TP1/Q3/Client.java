import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import oussama.IGestionLivre;
import java.util.*;

public class Client {	


    public static void main(String args[]){

      
           Context context;
		   Scanner scanner = new Scanner(System.in);
		   

	        try {
	            context = new InitialContext();
				IGestionLivre iGestionLivre = (IGestionLivre)context.lookup("oussama.IGestionLivre");

				System.out.println("Bienvenue dans le client");
				System.out.println("Choisisez un numero SVP ( 1 : Creation livre; 2 : Suppression livre; 3 : Emprinter livre; 4 : Rendre livre)");

				String nombre = scanner.nextLine();;

				 switch(nombre)
				 {
					 case "1": 
					 iGestionLivre.nouveauLivre("1777","TestOS");
					 System.out.println("Livre ajouter avec succée!");
					 break;
					 case "2":
					 iGestionLivre.supprimerLivre("1777");
					 System.out.println("Livre supprimer avec succée!");
					 break;
					 case "3":
					 String etat = iGestionLivre.emprinterLivre("1777");
					 System.out.println(etat);
					 break;
					 case "4":
					 String etat2 = iGestionLivre.rendreLivre("1777");
					 System.out.println(etat2);
					 break;
					 }
	          
	        } catch (NamingException e) {
	            e.printStackTrace();    
	        }
    }
}
