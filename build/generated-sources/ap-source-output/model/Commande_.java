package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Client;
import model.Produit;
import model.Tournee;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-12-12T11:44:31")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, String> etat;
    public static volatile SingularAttribute<Commande, Client> client;
    public static volatile SingularAttribute<Commande, Double> quantite;
    public static volatile SingularAttribute<Commande, String> date;
    public static volatile CollectionAttribute<Commande, Tournee> tourneeCollection;
    public static volatile SingularAttribute<Commande, Produit> codeaBarre;
    public static volatile SingularAttribute<Commande, Integer> reference;

}