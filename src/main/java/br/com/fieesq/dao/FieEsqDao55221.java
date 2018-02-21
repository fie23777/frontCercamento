package br.com.fieesq.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model55221.FieEsq12255;
import br.com.fieesq.model55221.FieEsq12525;
import br.com.fieesq.model55221.FieEsq12552;
import br.com.fieesq.model55221.FieEsq15225;
import br.com.fieesq.model55221.FieEsq15252;
import br.com.fieesq.model55221.FieEsq15522;
import br.com.fieesq.model55221.FieEsq21255;
import br.com.fieesq.model55221.FieEsq21525;
import br.com.fieesq.model55221.FieEsq21552;
import br.com.fieesq.model55221.FieEsq22155;
import br.com.fieesq.model55221.FieEsq22515;
import br.com.fieesq.model55221.FieEsq22551;
import br.com.fieesq.model55221.FieEsq25125;
import br.com.fieesq.model55221.FieEsq25152;
import br.com.fieesq.model55221.FieEsq25215;
import br.com.fieesq.model55221.FieEsq25251;
import br.com.fieesq.model55221.FieEsq25512;
import br.com.fieesq.model55221.FieEsq25521;
import br.com.fieesq.model55221.FieEsq51225;
import br.com.fieesq.model55221.FieEsq51252;
import br.com.fieesq.model55221.FieEsq51522;
import br.com.fieesq.model55221.FieEsq52125;
import br.com.fieesq.model55221.FieEsq52152;
import br.com.fieesq.model55221.FieEsq52215;
import br.com.fieesq.model55221.FieEsq52251;
import br.com.fieesq.model55221.FieEsq52512;
import br.com.fieesq.model55221.FieEsq52521;
import br.com.fieesq.model55221.FieEsq55122;
import br.com.fieesq.model55221.FieEsq55212;
import br.com.fieesq.model55221.FieEsq55221;
@Repository
@Transactional
public class FieEsqDao55221 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	

	public List<FieEsq55122> listarFieEsq55122(String filtro) {
	       String consulta = "select l from FieEsq55122 l where l.numEsq55122 like :nuncerc";
	          TypedQuery<FieEsq55122> query = manager.createQuery(consulta, FieEsq55122.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55212
	
	public List<FieEsq55212> listarFieEsq55212(String filtro) {
	       String consulta = "select l from FieEsq55212 l where l.numEsq55212 like :nuncerc";
	          TypedQuery<FieEsq55212> query = manager.createQuery(consulta, FieEsq55212.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 55221
	
	public List<FieEsq55221> listarFieEsq55221(String filtro) {
	       String consulta = "select l from FieEsq55221 l where l.numEsq55221 like :nuncerc";
	          TypedQuery<FieEsq55221> query = manager.createQuery(consulta, FieEsq55221.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 51522
	
	public List<FieEsq51522> listarFieEsq51522(String filtro) {
	       String consulta = "select l from FieEsq51522 l where l.numEsq51522 like :nuncerc";
	          TypedQuery<FieEsq51522> query = manager.createQuery(consulta, FieEsq51522.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq25512> listarFieEsq25512(String filtro) {
	       String consulta = "select l from FieEsq25512 l where l.numEsq25512 like :nuncerc";
	          TypedQuery<FieEsq25512> query = manager.createQuery(consulta, FieEsq25512.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq25521> listarFieEsq25521(String filtro) {
	       String consulta = "select l from FieEsq25521 l where l.numEsq25521 like :nuncerc";
	          TypedQuery<FieEsq25521> query = manager.createQuery(consulta, FieEsq25521.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25152> listarFieEsq25152(String filtro) {
	       String consulta = "select l from FieEsq25152 l where l.numEsq25152 like :nuncerc";
	          TypedQuery<FieEsq25152> query = manager.createQuery(consulta, FieEsq25152.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25125> listarFieEsq25125(String filtro) {
	       String consulta = "select l from FieEsq25125 l where l.numEsq25125 like :nuncerc";
	          TypedQuery<FieEsq25125> query = manager.createQuery(consulta, FieEsq25125.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25251> listarFieEsq25251(String filtro) {
	       String consulta = "select l from FieEsq25251 l where l.numEsq25251 like :nuncerc";
	          TypedQuery<FieEsq25251> query = manager.createQuery(consulta, FieEsq25251.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25215> listarFieEsq25215(String filtro) {
	       String consulta = "select l from FieEsq25215 l where l.numEsq25215 like :nuncerc";
	          TypedQuery<FieEsq25215> query = manager.createQuery(consulta, FieEsq25215.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21552> listarFieEsq21552(String filtro) {
	       String consulta = "select l from FieEsq21552 l where l.numEsq21552 like :nuncerc";
	          TypedQuery<FieEsq21552> query = manager.createQuery(consulta, FieEsq21552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21525> listarFieEsq21525(String filtro) {
	       String consulta = "select l from FieEsq21525 l where l.numEsq21525 like :nuncerc";
	          TypedQuery<FieEsq21525> query = manager.createQuery(consulta, FieEsq21525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq21255> listarFieEsq21255(String filtro) {
	       String consulta = "select l from FieEsq21255 l where l.numEsq21255 like :nuncerc";
	          TypedQuery<FieEsq21255> query = manager.createQuery(consulta, FieEsq21255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22551> listarFieEsq22551(String filtro) {
	       String consulta = "select l from FieEsq22551 l where l.numEsq22551 like :nuncerc";
	          TypedQuery<FieEsq22551> query = manager.createQuery(consulta, FieEsq22551.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22515> listarFieEsq22515(String filtro) {
	       String consulta = "select l from FieEsq22515 l where l.numEsq22515 like :nuncerc";
	          TypedQuery<FieEsq22515> query = manager.createQuery(consulta, FieEsq22515.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq22155> listarFieEsq22155(String filtro) {
	       String consulta = "select l from FieEsq22155 l where l.numEsq22155 like :nuncerc";
	          TypedQuery<FieEsq22155> query = manager.createQuery(consulta, FieEsq22155.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12552> listarFieEsq12552(String filtro) {
	       String consulta = "select l from FieEsq12552 l where l.numEsq12552 like :nuncerc";
	          TypedQuery<FieEsq12552> query = manager.createQuery(consulta, FieEsq12552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12525> listarFieEsq12525(String filtro) {
	       String consulta = "select l from FieEsq12525 l where l.numEsq12525 like :nuncerc";
	          TypedQuery<FieEsq12525> query = manager.createQuery(consulta, FieEsq12525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq12255> listarFieEsq12255(String filtro) {
	       String consulta = "select l from FieEsq12255 l where l.numEsq12255 like :nuncerc";
	          TypedQuery<FieEsq12255> query = manager.createQuery(consulta, FieEsq12255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15225> listarFieEsq15225(String filtro) {
	       String consulta = "select l from FieEsq15225 l where l.numEsq15225 like :nuncerc";
	          TypedQuery<FieEsq15225> query = manager.createQuery(consulta, FieEsq15225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15252> listarFieEsq15252(String filtro) {
	       String consulta = "select l from FieEsq15252 l where l.numEsq15252 like :nuncerc";
	          TypedQuery<FieEsq15252> query = manager.createQuery(consulta, FieEsq15252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq15522> listarFieEsq15522(String filtro) {
	       String consulta = "select l from FieEsq15522 l where l.numEsq15522 like :nuncerc";
	          TypedQuery<FieEsq15522> query = manager.createQuery(consulta, FieEsq15522.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52215> listarFieEsq52215(String filtro) {
	       String consulta = "select l from FieEsq52215 l where l.numEsq52215 like :nuncerc";
	          TypedQuery<FieEsq52215> query = manager.createQuery(consulta, FieEsq52215.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52251> listarFieEsq52251(String filtro) {
	       String consulta = "select l from FieEsq52251 l where l.numEsq52251 like :nuncerc";
	          TypedQuery<FieEsq52251> query = manager.createQuery(consulta, FieEsq52251.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52125> listarFieEsq52125(String filtro) {
	       String consulta = "select l from FieEsq52125 l where l.numEsq52125 like :nuncerc";
	          TypedQuery<FieEsq52125> query = manager.createQuery(consulta, FieEsq52125.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52152> listarFieEsq52152(String filtro) {
	       String consulta = "select l from FieEsq52152 l where l.numEsq52152 like :nuncerc";
	          TypedQuery<FieEsq52152> query = manager.createQuery(consulta, FieEsq52152.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52521> listarFieEsq52521(String filtro) {
	       String consulta = "select l from FieEsq52521 l where l.numEsq52521 like :nuncerc";
	          TypedQuery<FieEsq52521> query = manager.createQuery(consulta, FieEsq52521.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52512> listarFieEsq52512(String filtro) {
	       String consulta = "select l from FieEsq52512 l where l.numEsq52512 like :nuncerc";
	          TypedQuery<FieEsq52512> query = manager.createQuery(consulta, FieEsq52512.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51225> listarFieEsq51225(String filtro) {
	       String consulta = "select l from FieEsq51225 l where l.numEsq51225 like :nuncerc";
	          TypedQuery<FieEsq51225> query = manager.createQuery(consulta, FieEsq51225.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq51252> listarFieEsq51252(String filtro) {
	       String consulta = "select l from FieEsq51252 l where l.numEsq51252 like :nuncerc";
	          TypedQuery<FieEsq51252> query = manager.createQuery(consulta, FieEsq51252.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}

