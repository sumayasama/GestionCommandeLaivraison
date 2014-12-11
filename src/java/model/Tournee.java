/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sumaya
 */
@Entity
@Table(name = "tournee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tournee.findAll", query = "SELECT t FROM Tournee t"),
    @NamedQuery(name = "Tournee.findByReference", query = "SELECT t FROM Tournee t WHERE t.reference = :reference"),
    @NamedQuery(name = "Tournee.findByDate", query = "SELECT t FROM Tournee t WHERE t.date = :date"),
    @NamedQuery(name = "Tournee.findByRefCamion", query = "SELECT t FROM Tournee t WHERE t.refCamion = :refCamion")})
public class Tournee implements Serializable {
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
    @Column(name = "refCamion")
    private int refCamion;
    @JoinColumn(name = "Commande", referencedColumnName = "Reference")
    @ManyToOne(optional = false)
    private Commande commande;
    @JoinColumn(name = "Chauffeur", referencedColumnName = "Reference")
    @ManyToOne(optional = false)
    private Chauffeur chauffeur;

    public Tournee() {
    }

    public Tournee(Integer reference) {
        this.reference = reference;
    }

    public Tournee(Integer reference, String date, int refCamion) {
        this.reference = reference;
        this.date = date;
        this.refCamion = refCamion;
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

    public int getRefCamion() {
        return refCamion;
    }

    public void setRefCamion(int refCamion) {
        this.refCamion = refCamion;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
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
        if (!(object instanceof Tournee)) {
            return false;
        }
        Tournee other = (Tournee) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tournee[ reference=" + reference + " ]";
    }
    
}
