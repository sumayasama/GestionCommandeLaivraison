/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Chauffeur;

/**
 *
 * @author sumaya
 */
@Stateless
public class ChauffeurFacade extends AbstractFacade<Chauffeur> {
    @PersistenceContext(unitName = "GestionCommandeLaivraisonPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ChauffeurFacade() {
        super(Chauffeur.class);
    }
    
}
