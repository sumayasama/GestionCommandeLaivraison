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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sumaya
 */
@Entity
@Table(name = "camion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Camion.findAll", query = "SELECT c FROM Camion c"),
    @NamedQuery(name = "Camion.findByNumerodeSerie", query = "SELECT c FROM Camion c WHERE c.numerodeSerie = :numerodeSerie")})
public class Camion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Numero_de_Serie")
    private Integer numerodeSerie;

    public Camion() {
    }

    public Camion(Integer numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }

    public Integer getNumerodeSerie() {
        return numerodeSerie;
    }

    public void setNumerodeSerie(Integer numerodeSerie) {
        this.numerodeSerie = numerodeSerie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numerodeSerie != null ? numerodeSerie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Camion)) {
            return false;
        }
        Camion other = (Camion) object;
        if ((this.numerodeSerie == null && other.numerodeSerie != null) || (this.numerodeSerie != null && !this.numerodeSerie.equals(other.numerodeSerie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Camion[ numerodeSerie=" + numerodeSerie + " ]";
    }
    
}
