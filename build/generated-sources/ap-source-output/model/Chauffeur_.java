package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Tournee;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-12-12T11:44:31")
@StaticMetamodel(Chauffeur.class)
public class Chauffeur_ { 

    public static volatile SingularAttribute<Chauffeur, String> prenom;
    public static volatile SingularAttribute<Chauffeur, String> email;
    public static volatile SingularAttribute<Chauffeur, Integer> cin;
    public static volatile CollectionAttribute<Chauffeur, Tournee> tourneeCollection;
    public static volatile SingularAttribute<Chauffeur, String> telephone;
    public static volatile SingularAttribute<Chauffeur, Integer> reference;
    public static volatile SingularAttribute<Chauffeur, String> nom;

}