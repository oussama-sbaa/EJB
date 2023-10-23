package oussama;
import javax.ejb.Remote;
import java.io.*;
@Remote
public interface Iejb
{
    public String sayHello(String name);
}
