/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author sumaya
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByReference", query = "SELECT p FROM Produit p WHERE p.reference = :reference"),
    @NamedQuery(name = "Produit.findByDesignation", query = "SELECT p FROM Produit p WHERE p.designation = :designation"),
    @NamedQuery(name = "Produit.findByPrix", query = "SELECT p FROM Produit p WHERE p.prix = :prix"),
    @NamedQuery(name = "Produit.findByCodeaBarre", query = "SELECT p FROM Produit p WHERE p.codeaBarre = :codeaBarre"),
    @NamedQuery(name = "Produit.findByQuantite", query = "SELECT p FROM Produit p WHERE p.quantite = :quantite"),
    @NamedQuery(name = "Produit.findByEtat", query = "SELECT p FROM Produit p WHERE p.etat = :etat")})
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reference")
    private int reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Designation")
    private String designation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Prix")
    private double prix;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "Code_a_Barre")
    private String codeaBarre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantite")
    private double quantite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Etat")
    private String etat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeaBarre")
    private Collection<Commande> commandeCollection;

    public Produit() {
    }

    public Produit(String codeaBarre) {
        this.codeaBarre = codeaBarre;
    }

    public Produit(String codeaBarre, int reference, String designation, double prix, double quantite, String etat) {
        this.codeaBarre = codeaBarre;
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
        this.etat = etat;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getCodeaBarre() {
        return codeaBarre;
    }

    public void setCodeaBarre(String codeaBarre) {
        this.codeaBarre = codeaBarre;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeaBarre != null ? codeaBarre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.codeaBarre == null && other.codeaBarre != null) || (this.codeaBarre != null && !this.codeaBarre.equals(other.codeaBarre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Produit[ codeaBarre=" + codeaBarre + " ]";
    }
    
}
