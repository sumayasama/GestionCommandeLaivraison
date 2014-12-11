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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findByReference", query = "SELECT c FROM Commande c WHERE c.reference = :reference"),
    @NamedQuery(name = "Commande.findByDate", query = "SELECT c FROM Commande c WHERE c.date = :date"),
    @NamedQuery(name = "Commande.findByQuantite", query = "SELECT c FROM Commande c WHERE c.quantite = :quantite"),
    @NamedQuery(name = "Commande.findByEtat", query = "SELECT c FROM Commande c WHERE c.etat = :etat")})
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reference")
    private Integer reference;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Date")
    private String date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantite")
    private double quantite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Etat")
    private String etat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande")
    private Collection<Tournee> tourneeCollection;
    @JoinColumn(name = "Code_a_Barre", referencedColumnName = "Code_a_Barre")
    @ManyToOne(optional = false)
    private Produit codeaBarre;
    @JoinColumn(name = "Client", referencedColumnName = "Reference")
    @ManyToOne(optional = false)
    private Client client;

    public Commande() {
    }

    public Commande(Integer reference) {
        this.reference = reference;
    }

    public Commande(Integer reference, String date, double quantite, String etat) {
        this.reference = reference;
        this.date = date;
        this.quantite = quantite;
        this.etat = etat;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
    public Collection<Tournee> getTourneeCollection() {
        return tourneeCollection;
    }

    public void setTourneeCollection(Collection<Tournee> tourneeCollection) {
        this.tourneeCollection = tourneeCollection;
    }

    public Produit getCodeaBarre() {
        return codeaBarre;
    }

    public void setCodeaBarre(Produit codeaBarre) {
        this.codeaBarre = codeaBarre;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reference != null ? reference.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Commande[ reference=" + reference + " ]";
    }
    
}
