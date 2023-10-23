import javax.naming.*;
import src.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre32 gestionLivre32 = (IGestionLivre32) initcont
					.lookup("java:global/TP3EJB-2/GestionLivre32Imp");
			gestionLivre32.setAuteur("89",27);
			System.out.println("The author of the book 89 is : " + gestionLivre32.getAuteur("89"));
			//gestionLivre32.unSetAuteur("1799");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
