import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import oussama.Iejb;

public class ClsClient {	


    public static void main(String args[]){

           String name = "Oussama";
           Context context;
	        try {
	            context = new InitialContext();
	          Iejb proxyLocal = (Iejb)context.lookup("oussama.Iejb");
	            System.out.println(proxyLocal.sayHello(name));
	        } catch (NamingException e) {
	            e.printStackTrace();    
	        }
    }
    

}
