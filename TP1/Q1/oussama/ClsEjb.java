package oussama;
import javax.ejb.Stateless;
@Stateless
public class ClsEjb implements Iejb{
    public String sayHello(String name){
        return "Hello "+name;
    }
}
