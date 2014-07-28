/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionBeans;

import entidades.Respuestas;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SiperProg
 */
@Stateless
public class RespuestasFacade extends AbstractFacade<Respuestas> {
    @PersistenceContext(unitName = "EncuestaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RespuestasFacade() {
        super(Respuestas.class);
    }
    
    public List<Respuestas> getItemsRespuestas(Long eusCodigo){
        List<Respuestas> itemsResp = em.createQuery("SELECT r FROM Respuestas r WHERE r.eusCodigo = :eusCodigo").setParameter("eusCodigo", eusCodigo).getResultList();
        return itemsResp;
    }
    
}
