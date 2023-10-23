import javax.naming.*;
import src.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre32 gestionLivre32 = (IGestionLivre32) initcont
					.lookup("java:global/TP3EJB-2/GestionLivre32Imp");
			System.out.println("The book of the author is "+ gestionLivre32.getAuteur("89")+" : "+gestionLivre32.getLivresAuteur("89"));

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
