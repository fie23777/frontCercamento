package br.com.fieesq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model53331.FieEsq13335;
import br.com.fieesq.model53331.FieEsq13353;
import br.com.fieesq.model53331.FieEsq13533;
import br.com.fieesq.model53331.FieEsq15333;
import br.com.fieesq.model53331.FieEsq31335;
import br.com.fieesq.model53331.FieEsq31353;
import br.com.fieesq.model53331.FieEsq31533;
import br.com.fieesq.model53331.FieEsq33153;
import br.com.fieesq.model53331.FieEsq33315;
import br.com.fieesq.model53331.FieEsq33351;
import br.com.fieesq.model53331.FieEsq33513;
import br.com.fieesq.model53331.FieEsq35133;
import br.com.fieesq.model53331.FieEsq35313;
import br.com.fieesq.model53331.FieEsq35331;
import br.com.fieesq.model53331.FieEsq51333;
import br.com.fieesq.model53331.FieEsq53133;
import br.com.fieesq.model53331.FieEsq53313;
import br.com.fieesq.model53331.FieEsq53331;
@Repository
@Transactional
public class FieEsqDao53331 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	

	
	public List<FieEsq53331> listarFieEsq53331(String filtro) {
	       String consulta = "select l from FieEsq53331 l where l.numEsq53331 like :nuncerc";
	          TypedQuery<FieEsq53331> query = manager.createQuery(consulta, FieEsq53331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53313
	
	public List<FieEsq53313> listarFieEsq53313(String filtro) {
	       String consulta = "select l from FieEsq53313 l where l.numEsq53313 like :nuncerc";
	          TypedQuery<FieEsq53313> query = manager.createQuery(consulta, FieEsq53313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 53133
	
	public List<FieEsq53133> listarFieEsq53133(String filtro) {
	       String consulta = "select l from FieEsq53133 l where l.numEsq53133 like :nuncerc";
	          TypedQuery<FieEsq53133> query = manager.createQuery(consulta, FieEsq53133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51333
	
	public List<FieEsq51333> listarFieEsq51333(String filtro) {
	       String consulta = "select l from FieEsq51333 l where l.numEsq51333 like :nuncerc";
	          TypedQuery<FieEsq51333> query = manager.createQuery(consulta, FieEsq51333.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	
	public List<FieEsq13335> listarFieEsq13335(String filtro) {
	       String consulta = "select l from FieEsq13335 l where l.numEsq13335 like :nuncerc";
	          TypedQuery<FieEsq13335> query = manager.createQuery(consulta, FieEsq13335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13353> listarFieEsq13353(String filtro) {
	       String consulta = "select l from FieEsq13353 l where l.numEsq13353 like :nuncerc";
	          TypedQuery<FieEsq13353> query = manager.createQuery(consulta, FieEsq13353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13533> listarFieEsq13533(String filtro) {
	       String consulta = "select l from FieEsq13533 l where l.numEsq13533 like :nuncerc";
	          TypedQuery<FieEsq13533> query = manager.createQuery(consulta, FieEsq13533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15333> listarFieEsq15333(String filtro) {
	       String consulta = "select l from FieEsq15333 l where l.numEsq15333 like :nuncerc";
	          TypedQuery<FieEsq15333> query = manager.createQuery(consulta, FieEsq15333.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31353> listarFieEsq31353(String filtro) {
	       String consulta = "select l from FieEsq31353 l where l.numEsq31353 like :nuncerc";
	          TypedQuery<FieEsq31353> query = manager.createQuery(consulta, FieEsq31353.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31335> listarFieEsq31335(String filtro) {
	       String consulta = "select l from FieEsq31335 l where l.numEsq31335 like :nuncerc";
	          TypedQuery<FieEsq31335> query = manager.createQuery(consulta, FieEsq31335.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35313> listarFieEsq35313(String filtro) {
	       String consulta = "select l from FieEsq35313 l where l.numEsq35313 like :nuncerc";
	          TypedQuery<FieEsq35313> query = manager.createQuery(consulta, FieEsq35313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35331> listarFieEsq35331(String filtro) {
	       String consulta = "select l from FieEsq35331 l where l.numEsq35331 like :nuncerc";
	          TypedQuery<FieEsq35331> query = manager.createQuery(consulta, FieEsq35331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31533> listarFieEsq31533(String filtro) {
	       String consulta = "select l from FieEsq31533 l where l.numEsq31533 like :nuncerc";
	          TypedQuery<FieEsq31533> query = manager.createQuery(consulta, FieEsq31533.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35133> listarFieEsq35133(String filtro) {
	       String consulta = "select l from FieEsq35133l where l.numEsq35133like :nuncerc";
	          TypedQuery<FieEsq35133> query = manager.createQuery(consulta, FieEsq35133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33153> listarFieEsq33153(String filtro) {
	       String consulta = "select l from FieEsq33153 l where l.numEsq33153 like :nuncerc";
	          TypedQuery<FieEsq33153> query = manager.createQuery(consulta, FieEsq33153.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33513> listarFieEsq33513(String filtro) {
	       String consulta = "select l from FieEsq33513 l where l.numEsq33513 like :nuncerc";
	          TypedQuery<FieEsq33513> query = manager.createQuery(consulta, FieEsq33513.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33315> listarFieEsq33315(String filtro) {
	       String consulta = "select l from FieEsq33315 l where l.numEsq33315 like :nuncerc";
	          TypedQuery<FieEsq33315> query = manager.createQuery(consulta, FieEsq33315.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq33351> listarFieEsq33351(String filtro) {
	       String consulta = "select l from FieEsq33351 l where l.numEsq33351 like :nuncerc";
	          TypedQuery<FieEsq33351> query = manager.createQuery(consulta, FieEsq33351.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}

}
