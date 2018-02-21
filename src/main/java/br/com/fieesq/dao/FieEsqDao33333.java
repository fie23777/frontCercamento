package br.com.fieesq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model33333.FieEsq33333;
@Repository
@Transactional
public class FieEsqDao33333 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	public List<FieEsq33333> listarFieEsq33333(String filtro) {
	       String consulta = "select l from FieEsq33333 l where l.numEsq33333 like :nuncerc";
	          TypedQuery<FieEsq33333> query = manager.createQuery(consulta, FieEsq33333.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
