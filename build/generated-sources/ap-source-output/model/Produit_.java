package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Commande;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-12-12T11:44:31")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, String> etat;
    public static volatile SingularAttribute<Produit, Double> prix;
    public static volatile SingularAttribute<Produit, String> designation;
    public static volatile SingularAttribute<Produit, Double> quantite;
    public static volatile SingularAttribute<Produit, String> codeaBarre;
    public static volatile CollectionAttribute<Produit, Commande> commandeCollection;
    public static volatile SingularAttribute<Produit, Integer> reference;

}