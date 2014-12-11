/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.Camion;

/**
 *
 * @author sumaya
 */
@Stateless
public class CamionFacade extends AbstractFacade<Camion> {
    @PersistenceContext(unitName = "GestionCommandeLaivraisonPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CamionFacade() {
        super(Camion.class);
    }
    
}
