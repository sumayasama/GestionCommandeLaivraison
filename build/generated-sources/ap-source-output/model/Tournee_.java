package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Chauffeur;
import model.Commande;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-12-12T11:44:31")
@StaticMetamodel(Tournee.class)
public class Tournee_ { 

    public static volatile SingularAttribute<Tournee, Chauffeur> chauffeur;
    public static volatile SingularAttribute<Tournee, Integer> refCamion;
    public static volatile SingularAttribute<Tournee, Commande> commande;
    public static volatile SingularAttribute<Tournee, String> date;
    public static volatile SingularAttribute<Tournee, Integer> reference;

}