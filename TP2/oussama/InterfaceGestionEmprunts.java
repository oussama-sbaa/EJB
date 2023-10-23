package oussama;

import javax.ejb.Remote;

@Remote
public interface InterfaceGestionEmprunts {
    void initSession(int numEmp);
    void emprunter(String isbn);
    void rendre(String isbn) ;
}
