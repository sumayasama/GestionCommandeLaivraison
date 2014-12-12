package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Commande;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-12-12T11:44:31")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, String> prenom;
    public static volatile SingularAttribute<Client, String> position;
    public static volatile SingularAttribute<Client, String> fax;
    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, String> libelle;
    public static volatile SingularAttribute<Client, String> email;
    public static volatile SingularAttribute<Client, String> telephone;
    public static volatile CollectionAttribute<Client, Commande> commandeCollection;
    public static volatile SingularAttribute<Client, Integer> reference;
    public static volatile SingularAttribute<Client, String> nom;

}