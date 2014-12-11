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
@Table(name = "chauffeur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Chauffeur.findAll", query = "SELECT c FROM Chauffeur c"),
    @NamedQuery(name = "Chauffeur.findByReference", query = "SELECT c FROM Chauffeur c WHERE c.reference = :reference"),
    @NamedQuery(name = "Chauffeur.findByEmail", query = "SELECT c FROM Chauffeur c WHERE c.email = :email"),
    @NamedQuery(name = "Chauffeur.findByTelephone", query = "SELECT c FROM Chauffeur c WHERE c.telephone = :telephone"),
    @NamedQuery(name = "Chauffeur.findByNom", query = "SELECT c FROM Chauffeur c WHERE c.nom = :nom"),
    @NamedQuery(name = "Chauffeur.findByPrenom", query = "SELECT c FROM Chauffeur c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "Chauffeur.findByCin", query = "SELECT c FROM Chauffeur c WHERE c.cin = :cin")})
public class Chauffeur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Reference")
    private Integer reference;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Telephone")
    private String telephone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nom")
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Prenom")
    private String prenom;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CIN")
    private int cin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chauffeur")
    private Collection<Tournee> tourneeCollection;

    public Chauffeur() {
    }

    public Chauffeur(Integer reference) {
        this.reference = reference;
    }

    public Chauffeur(Integer reference, String email, String telephone, String nom, String prenom, int cin) {
        this.reference = reference;
        this.email = email;
        this.telephone = telephone;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
    }

    public Integer getReference() {
        return reference;
    }

    public void setReference(Integer reference) {
        this.reference = reference;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    @XmlTransient
    public Collection<Tournee> getTourneeCollection() {
        return tourneeCollection;
    }

    public void setTourneeCollection(Collection<Tournee> tourneeCollection) {
        this.tourneeCollection = tourneeCollection;
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
        if (!(object instanceof Chauffeur)) {
            return false;
        }
        Chauffeur other = (Chauffeur) object;
        if ((this.reference == null && other.reference != null) || (this.reference != null && !this.reference.equals(other.reference))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Chauffeur[ reference=" + reference + " ]";
    }
    
}
