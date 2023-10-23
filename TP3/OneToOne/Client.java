import javax.naming.*;
import src.*;

public class Client {

	public static void main(String[] args) {
		try {

			InitialContext initcont = new InitialContext();
			IGestionLivre31 gestionLivre31 = (IGestionLivre31) initcont
					.lookup("java:global/TP3EJB/GestionLivre31Imp");

			System.out.println("The number of page of this book is : " + gestionLivre31.getNbPages("1799"));

		} catch (Exception e) {

			System.out.println(e);

		}
	}
}
