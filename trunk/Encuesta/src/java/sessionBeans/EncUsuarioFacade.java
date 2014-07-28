/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionBeans;

import entidades.EncUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SiperProg
 */
@Stateless
public class EncUsuarioFacade extends AbstractFacade<EncUsuario> {
    @PersistenceContext(unitName = "EncuestaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EncUsuarioFacade() {
        super(EncUsuario.class);
    }
    
}
