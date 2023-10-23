package src;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import src.Auteur;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2020-02-14T10:28:24")
@StaticMetamodel(Livre.class)
public class Livre_ { 

    public static volatile SingularAttribute<Livre, String> titre;
    public static volatile SingularAttribute<Livre, String> isbn;
    public static volatile SingularAttribute<Livre, Auteur> auteur;

}