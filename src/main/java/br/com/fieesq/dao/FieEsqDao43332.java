package br.com.fieesq.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model43332.FieEsq23334;
import br.com.fieesq.model43332.FieEsq23343;
import br.com.fieesq.model43332.FieEsq23433;
import br.com.fieesq.model43332.FieEsq24333;
import br.com.fieesq.model43332.FieEsq32334;
import br.com.fieesq.model43332.FieEsq32343;
import br.com.fieesq.model43332.FieEsq32433;
import br.com.fieesq.model43332.FieEsq33243;
import br.com.fieesq.model43332.FieEsq33324;
import br.com.fieesq.model43332.FieEsq33342;
import br.com.fieesq.model43332.FieEsq33423;
import br.com.fieesq.model43332.FieEsq34233;
import br.com.fieesq.model43332.FieEsq34323;
import br.com.fieesq.model43332.FieEsq34332;
import br.com.fieesq.model43332.FieEsq42333;
import br.com.fieesq.model43332.FieEsq43233;
import br.com.fieesq.model43332.FieEsq43323;
import br.com.fieesq.model43332.FieEsq43332;
@Repository
@Transactional
public class FieEsqDao43332 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
		
		public List<FieEsq43332> listarFieEsq43332(String filtro) {
		       String consulta = "select l from FieEsq43332 l where l.numEsq43332 like :nuncerc";
		          TypedQuery<FieEsq43332> query = manager.createQuery(consulta, FieEsq43332.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		public List<FieEsq43323> listarFieEsq43323(String filtro) {
		       String consulta = "select l from FieEsq43323 l where l.numEsq43323 like :nuncerc";
		          TypedQuery<FieEsq43323> query = manager.createQuery(consulta, FieEsq43323.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		public List<FieEsq43233> listarFieEsq43233(String filtro) {
		       String consulta = "select l from FieEsq43233 l where l.numEsq43233 like :nuncerc";
		          TypedQuery<FieEsq43233> query = manager.createQuery(consulta, FieEsq43233.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		
		//para listar em tela 42333
		
		public List<FieEsq42333> listarFieEsq42333(String filtro) {
		       String consulta = "select l from FieEsq42333 l where l.numEsq42333 like :nuncerc";
		          TypedQuery<FieEsq42333> query = manager.createQuery(consulta, FieEsq42333.class).setMaxResults(10);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq23334> listarFieEsq23334(String filtro) {
		       String consulta = "select l from FieEsq23334 l where l.numEsq23334 like :nuncerc";
		          TypedQuery<FieEsq23334> query = manager.createQuery(consulta, FieEsq23334.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq23343> listarFieEsq23343(String filtro) {
		       String consulta = "select l from FieEsq23343 l where l.numEsq23343 like :nuncerc";
		          TypedQuery<FieEsq23343> query = manager.createQuery(consulta, FieEsq23343.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq23433> listarFieEsq23433(String filtro) {
		       String consulta = "select l from FieEsq23433 l where l.numEsq23433 like :nuncerc";
		          TypedQuery<FieEsq23433> query = manager.createQuery(consulta, FieEsq23433.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq24333> listarFieEsq24333(String filtro) {
		       String consulta = "select l from FieEsq24333 l where l.numEsq24333 like :nuncerc";
		          TypedQuery<FieEsq24333> query = manager.createQuery(consulta, FieEsq24333.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32343> listarFieEsq32343(String filtro) {
		       String consulta = "select l from FieEsq32343 l where l.numEsq32343 like :nuncerc";
		          TypedQuery<FieEsq32343> query = manager.createQuery(consulta, FieEsq32343.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32334> listarFieEsq32334(String filtro) {
		       String consulta = "select l from FieEsq32334 l where l.numEsq32334 like :nuncerc";
		          TypedQuery<FieEsq32334> query = manager.createQuery(consulta, FieEsq32334.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34323> listarFieEsq34323(String filtro) {
		       String consulta = "select l from FieEsq34323 l where l.numEsq34323 like :nuncerc";
		          TypedQuery<FieEsq34323> query = manager.createQuery(consulta, FieEsq34323.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34332> listarFieEsq34332(String filtro) {
		       String consulta = "select l from FieEsq34332 l where l.numEsq34332 like :nuncerc";
		          TypedQuery<FieEsq34332> query = manager.createQuery(consulta, FieEsq34332.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq32433> listarFieEsq32433(String filtro) {
		       String consulta = "select l from FieEsq32433 l where l.numEsq32433 like :nuncerc";
		          TypedQuery<FieEsq32433> query = manager.createQuery(consulta, FieEsq32433.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq34233> listarFieEsq34233(String filtro) {
		       String consulta = "select l from FieEsq34233 l where l.numEsq34233 like :nuncerc";
		          TypedQuery<FieEsq34233> query = manager.createQuery(consulta, FieEsq34233.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33243> listarFieEsq33243(String filtro) {
		       String consulta = "select l from FieEsq33243 l where l.numEsq33243 like :nuncerc";
		          TypedQuery<FieEsq33243> query = manager.createQuery(consulta, FieEsq33243.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33423> listarFieEsq33423(String filtro) {
		       String consulta = "select l from FieEsq33423 l where l.numEsq33423 like :nuncerc";
		          TypedQuery<FieEsq33423> query = manager.createQuery(consulta, FieEsq33423.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33324> listarFieEsq33324(String filtro) {
		       String consulta = "select l from FieEsq33324 l where l.numEsq33324 like :nuncerc";
		          TypedQuery<FieEsq33324> query = manager.createQuery(consulta, FieEsq33324.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}
		public List<FieEsq33342> listarFieEsq33342(String filtro) {
		       String consulta = "select l from FieEsq33342 l where l.numEsq33342 like :nuncerc";
		          TypedQuery<FieEsq33342> query = manager.createQuery(consulta, FieEsq33342.class).setMaxResults(limite);
		                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
		      return  query.getResultList();
			}

}
