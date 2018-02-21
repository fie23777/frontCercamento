package br.com.sistJCJ.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model44322.FieEsq22344;
import br.com.fieesq.model44322.FieEsq44232;
import br.com.fieesq.model55320.FieEsq55320;

@Repository
@Transactional
public class FieEsqDao {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
//para listar em tela 22344
	
	public List<FieEsq22344> listarFieEsq22344(String filtro) {
	       String consulta = "select l from FieEsq22344 l where l.numEsq22344 like :nuncerc";
	          TypedQuery<FieEsq22344> query = manager.createQuery(consulta, FieEsq22344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq44232> listarFieEsq44232(String filtro) {
	       String consulta = "select l from FieEsq44232 l where l.numEsq44232 like :nuncerc";
	          TypedQuery<FieEsq44232> query = manager.createQuery(consulta, FieEsq44232.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq55320> listarFieEsq55320(String filtro) {
	       String consulta = "select l from FieEsq55320 l where l.numEsq55320 like :nuncerc";
	          TypedQuery<FieEsq55320> query = manager.createQuery(consulta, FieEsq55320.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	
	public List<FieEsq22344> listar() {
	       String consulta = "select l from FieEsq22344 l ";
	          TypedQuery<FieEsq22344> query = manager.createQuery(consulta, FieEsq22344.class).setMaxResults(25000);
	         
	                                   	                                      
	      return  query.getResultList();
		}
}
