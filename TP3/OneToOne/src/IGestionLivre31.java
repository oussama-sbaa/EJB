package src;
import javax.ejb.Remote;
@Remote
public interface IGestionLivre31
{
	public int getNbPages(String isbn);	
}
