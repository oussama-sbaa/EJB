package oussama;
import javax.ejb.Stateful;
@Stateful
public class ClsEjb implements Iejb{
  public String name;
  @Override
  public String sayHello(String name){
     this.name=name;
     return "Hello " + name;
  }
  @Override
  public String sayHelloAgain(){
    return "HelloAgain "+this.name ;
  }

}
