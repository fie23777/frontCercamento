package br.com.fieesq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model54222.FieEsq22245;
import br.com.fieesq.model54222.FieEsq22254;
import br.com.fieesq.model54222.FieEsq22452;
import br.com.fieesq.model54222.FieEsq22542;
import br.com.fieesq.model54222.FieEsq24225;
import br.com.fieesq.model54222.FieEsq24252;
import br.com.fieesq.model54222.FieEsq24522;
import br.com.fieesq.model54222.FieEsq25224;
import br.com.fieesq.model54222.FieEsq25242;
import br.com.fieesq.model54222.FieEsq25422;
import br.com.fieesq.model54222.FieEsq42225;
import br.com.fieesq.model54222.FieEsq42252;
import br.com.fieesq.model54222.FieEsq42522;
import br.com.fieesq.model54222.FieEsq45222;
import br.com.fieesq.model54222.FieEsq52224;
import br.com.fieesq.model54222.FieEsq52242;
import br.com.fieesq.model54222.FieEsq52422;
import br.com.fieesq.model54222.FieEsq54222;
@Repository
@Transactional
public class FieEsqDao54222 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	
		
		public List<FieEsq52224> listarFieEsq52224(String filtro) {
		       String consulta = "select l from FieEsq52224 l where l.numEsq52224 like :nuncerc";
		          TypedQuery<FieEsq52224> query = manager.createQuery(consulta, FieEsq52224.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 52242
		
		public List<FieEsq52242> listarFieEsq52242(String filtro) {
		       String consulta = "select l from FieEsq52242 l where l.numEsq52242 like :nuncerc";
		          TypedQuery<FieEsq52242> query = manager.createQuery(consulta, FieEsq52242.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 52422
		
		public List<FieEsq52422> listarFieEsq52422(String filtro) {
		       String consulta = "select l from FieEsq52422 l where l.numEsq52422 like :nuncerc";
		          TypedQuery<FieEsq52422> query = manager.createQuery(consulta, FieEsq52422.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 54222
		
		public List<FieEsq54222> listarFieEsq54222(String filtro) {
		       String consulta = "select l from FieEsq54222 l where l.numEsq54222 like :nuncerc";
		          TypedQuery<FieEsq54222> query = manager.createQuery(consulta, FieEsq54222.class).setMaxResults(10);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
	//************************************************************************************************************************
		
		
		
		
		public List<FieEsq42225> listarFieEsq42225(String filtro) {
		       String consulta = "select l from FieEsq42225 l where l.numEsq42225 like :nuncerc";
		          TypedQuery<FieEsq42225> query = manager.createQuery(consulta, FieEsq42225.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq42252> listarFieEsq42252(String filtro) {
		       String consulta = "select l from FieEsq42252 l where l.numEsq42252 like :nuncerc";
		          TypedQuery<FieEsq42252> query = manager.createQuery(consulta, FieEsq42252.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24522> listarFieEsq24522(String filtro) {
		       String consulta = "select l from FieEsq24522 l where l.numEsq24522 like :nuncerc";
		          TypedQuery<FieEsq24522> query = manager.createQuery(consulta, FieEsq24522.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq45222> listarFieEsq45222(String filtro) {
		       String consulta = "select l from FieEsq45222 l where l.numEsq45222 like :nuncerc";
		          TypedQuery<FieEsq45222> query = manager.createQuery(consulta, FieEsq45222.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24252> listarFieEsq24252(String filtro) {
		       String consulta = "select l from FieEsq24252 l where l.numEsq24252 like :nuncerc";
		          TypedQuery<FieEsq24252> query = manager.createQuery(consulta, FieEsq24252.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24225> listarFieEsq24225(String filtro) {
		       String consulta = "select l from FieEsq24225 l where l.numEsq24225 like :nuncerc";
		          TypedQuery<FieEsq24225> query = manager.createQuery(consulta, FieEsq24225.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25242> listarFieEsq25242(String filtro) {
		       String consulta = "select l from FieEsq25242 l where l.numEsq25242 like :nuncerc";
		          TypedQuery<FieEsq25242> query = manager.createQuery(consulta, FieEsq25242.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25224> listarFieEsq25224(String filtro) {
		       String consulta = "select l from FieEsq25224 l where l.numEsq25224 like :nuncerc";
		          TypedQuery<FieEsq25224> query = manager.createQuery(consulta, FieEsq25224.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq42522> listarFieEsq42522(String filtro) {
		       String consulta = "select l from FieEsq42522 l where l.numEsq42522 like :nuncerc";
		          TypedQuery<FieEsq42522> query = manager.createQuery(consulta, FieEsq42522.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq25422> listarFieEsq25422(String filtro) {
		       String consulta = "select l from FieEsq25422l where l.numEsq25422like :nuncerc";
		          TypedQuery<FieEsq25422> query = manager.createQuery(consulta, FieEsq25422.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22452> listarFieEsq22452(String filtro) {
		       String consulta = "select l from FieEsq22452 l where l.numEsq22452 like :nuncerc";
		          TypedQuery<FieEsq22452> query = manager.createQuery(consulta, FieEsq22452.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22542> listarFieEsq22542(String filtro) {
		       String consulta = "select l from FieEsq22542 l where l.numEsq22542 like :nuncerc";
		          TypedQuery<FieEsq22542> query = manager.createQuery(consulta, FieEsq22542.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22245> listarFieEsq22245(String filtro) {
		       String consulta = "select l from FieEsq22245 l where l.numEsq22245 like :nuncerc";
		          TypedQuery<FieEsq22245> query = manager.createQuery(consulta, FieEsq22245.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq22254> listarFieEsq22254(String filtro) {
		       String consulta = "select l from FieEsq22254 l where l.numEsq22254 like :nuncerc";
		          TypedQuery<FieEsq22254> query = manager.createQuery(consulta, FieEsq22254.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}

}
