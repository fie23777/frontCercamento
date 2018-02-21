package br.com.fieesq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model44331.FieEsq13344;
import br.com.fieesq.model44331.FieEsq13434;
import br.com.fieesq.model44331.FieEsq13443;
import br.com.fieesq.model44331.FieEsq14334;
import br.com.fieesq.model44331.FieEsq14343;
import br.com.fieesq.model44331.FieEsq14433;
import br.com.fieesq.model44331.FieEsq31344;
import br.com.fieesq.model44331.FieEsq31434;
import br.com.fieesq.model44331.FieEsq31443;
import br.com.fieesq.model44331.FieEsq33144;
import br.com.fieesq.model44331.FieEsq33414;
import br.com.fieesq.model44331.FieEsq33441;
import br.com.fieesq.model44331.FieEsq34134;
import br.com.fieesq.model44331.FieEsq34143;
import br.com.fieesq.model44331.FieEsq34314;
import br.com.fieesq.model44331.FieEsq34341;
import br.com.fieesq.model44331.FieEsq34413;
import br.com.fieesq.model44331.FieEsq34431;
import br.com.fieesq.model44331.FieEsq41334;
import br.com.fieesq.model44331.FieEsq41343;
import br.com.fieesq.model44331.FieEsq41433;
import br.com.fieesq.model44331.FieEsq43134;
import br.com.fieesq.model44331.FieEsq43143;
import br.com.fieesq.model44331.FieEsq43314;
import br.com.fieesq.model44331.FieEsq43341;
import br.com.fieesq.model44331.FieEsq43413;
import br.com.fieesq.model44331.FieEsq43431;
import br.com.fieesq.model44331.FieEsq44133;
import br.com.fieesq.model44331.FieEsq44313;
import br.com.fieesq.model44331.FieEsq44331;
@Repository
@Transactional
public class FieEsqDao44331 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	
	//para o esquema fie gravar em banco
	

	
	public List<FieEsq33144> listarFieEsq33144(String filtro) {
	       String consulta = "select l from FieEsq33144 l where l.numEsq33144 like :nuncerc";
	          TypedQuery<FieEsq33144> query = manager.createQuery(consulta, FieEsq33144.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33414
	
	public List<FieEsq33414> listarFieEsq33414(String filtro) {
	       String consulta = "select l from FieEsq33414 l where l.numEsq33414 like :nuncerc";
	          TypedQuery<FieEsq33414> query = manager.createQuery(consulta, FieEsq33414.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 33441
	
	public List<FieEsq33441> listarFieEsq33441(String filtro) {
	       String consulta = "select l from FieEsq33441 l where l.numEsq33441 like :nuncerc";
	          TypedQuery<FieEsq33441> query = manager.createQuery(consulta, FieEsq33441.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 31344
	
	public List<FieEsq31344> listarFieEsq31344(String filtro) {
	       String consulta = "select l from FieEsq31344 l where l.numEsq31344 like :nuncerc";
	          TypedQuery<FieEsq31344> query = manager.createQuery(consulta, FieEsq31344.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq43314> listarFieEsq43314(String filtro) {
	       String consulta = "select l from FieEsq43314 l where l.numEsq43314 like :nuncerc";
	          TypedQuery<FieEsq43314> query = manager.createQuery(consulta, FieEsq43314.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43341> listarFieEsq43341(String filtro) {
	       String consulta = "select l from FieEsq43341 l where l.numEsq43341 like :nuncerc";
	          TypedQuery<FieEsq43341> query = manager.createQuery(consulta, FieEsq43341.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43134> listarFieEsq43134(String filtro) {
	       String consulta = "select l from FieEsq43134 l where l.numEsq43134 like :nuncerc";
	          TypedQuery<FieEsq43134> query = manager.createQuery(consulta, FieEsq43134.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43143> listarFieEsq43143(String filtro) {
	       String consulta = "select l from FieEsq43143 l where l.numEsq43143 like :nuncerc";
	          TypedQuery<FieEsq43143> query = manager.createQuery(consulta, FieEsq43143.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43431> listarFieEsq43431(String filtro) {
	       String consulta = "select l from FieEsq43431 l where l.numEsq43431 like :nuncerc";
	          TypedQuery<FieEsq43431> query = manager.createQuery(consulta, FieEsq43431.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq43413> listarFieEsq43413(String filtro) {
	       String consulta = "select l from FieEsq43413 l where l.numEsq43413 like :nuncerc";
	          TypedQuery<FieEsq43413> query = manager.createQuery(consulta, FieEsq43413.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41334> listarFieEsq41334(String filtro) {
	       String consulta = "select l from FieEsq41334 l where l.numEsq41334 like :nuncerc";
	          TypedQuery<FieEsq41334> query = manager.createQuery(consulta, FieEsq41334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41343> listarFieEsq41343(String filtro) {
	       String consulta = "select l from FieEsq41343 l where l.numEsq41343 like :nuncerc";
	          TypedQuery<FieEsq41343> query = manager.createQuery(consulta, FieEsq41343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq41433> listarFieEsq41433(String filtro) {
	       String consulta = "select l from FieEsq41433 l where l.numEsq41433 like :nuncerc";
	          TypedQuery<FieEsq41433> query = manager.createQuery(consulta, FieEsq41433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44331> listarFieEsq44331(String filtro) {
	       String consulta = "select l from FieEsq44331 l where l.numEsq44331 like :nuncerc";
	          TypedQuery<FieEsq44331> query = manager.createQuery(consulta, FieEsq44331.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44313> listarFieEsq44313(String filtro) {
	       String consulta = "select l from FieEsq44313 l where l.numEsq44313 like :nuncerc";
	          TypedQuery<FieEsq44313> query = manager.createQuery(consulta, FieEsq44313.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq44133> listarFieEsq44133(String filtro) {
	       String consulta = "select l from FieEsq44133 l where l.numEsq44133 like :nuncerc";
	          TypedQuery<FieEsq44133> query = manager.createQuery(consulta, FieEsq44133.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14334> listarFieEsq14334(String filtro) {
	       String consulta = "select l from FieEsq14334 l where l.numEsq14334 like :nuncerc";
	          TypedQuery<FieEsq14334> query = manager.createQuery(consulta, FieEsq14334.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14343> listarFieEsq14343(String filtro) {
	       String consulta = "select l from FieEsq14343 l where l.numEsq14343 like :nuncerc";
	          TypedQuery<FieEsq14343> query = manager.createQuery(consulta, FieEsq14343.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq14433> listarFieEsq14433(String filtro) {
	       String consulta = "select l from FieEsq14433 l where l.numEsq14433 like :nuncerc";
	          TypedQuery<FieEsq14433> query = manager.createQuery(consulta, FieEsq14433.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13443> listarFieEsq13443(String filtro) {
	       String consulta = "select l from FieEsq13443 l where l.numEsq13443 like :nuncerc";
	          TypedQuery<FieEsq13443> query = manager.createQuery(consulta, FieEsq13443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13434> listarFieEsq13434(String filtro) {
	       String consulta = "select l from FieEsq13434 l where l.numEsq13434 like :nuncerc";
	          TypedQuery<FieEsq13434> query = manager.createQuery(consulta, FieEsq13434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq13344> listarFieEsq13344(String filtro) {
	       String consulta = "select l from FieEsq13344 l where l.numEsq13344 like :nuncerc";
	          TypedQuery<FieEsq13344> query = manager.createQuery(consulta, FieEsq13344.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34413> listarFieEsq34413(String filtro) {
	       String consulta = "select l from FieEsq34413 l where l.numEsq34413 like :nuncerc";
	          TypedQuery<FieEsq34413> query = manager.createQuery(consulta, FieEsq34413.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34431> listarFieEsq34431(String filtro) {
	       String consulta = "select l from FieEsq34431 l where l.numEsq34431 like :nuncerc";
	          TypedQuery<FieEsq34431> query = manager.createQuery(consulta, FieEsq34431.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34143> listarFieEsq34143(String filtro) {
	       String consulta = "select l from FieEsq34143 l where l.numEsq34143 like :nuncerc";
	          TypedQuery<FieEsq34143> query = manager.createQuery(consulta, FieEsq34143.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34134> listarFieEsq34134(String filtro) {
	       String consulta = "select l from FieEsq34134 l where l.numEsq34134 like :nuncerc";
	          TypedQuery<FieEsq34134> query = manager.createQuery(consulta, FieEsq34134.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34341> listarFieEsq34341(String filtro) {
	       String consulta = "select l from FieEsq34341 l where l.numEsq34341 like :nuncerc";
	          TypedQuery<FieEsq34341> query = manager.createQuery(consulta, FieEsq34341.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq34314> listarFieEsq34314(String filtro) {
	       String consulta = "select l from FieEsq34314 l where l.numEsq34314 like :nuncerc";
	          TypedQuery<FieEsq34314> query = manager.createQuery(consulta, FieEsq34314.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31443> listarFieEsq31443(String filtro) {
	       String consulta = "select l from FieEsq31443 l where l.numEsq31443 like :nuncerc";
	          TypedQuery<FieEsq31443> query = manager.createQuery(consulta, FieEsq31443.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq31434> listarFieEsq31434(String filtro) {
	       String consulta = "select l from FieEsq31434 l where l.numEsq31434 like :nuncerc";
	          TypedQuery<FieEsq31434> query = manager.createQuery(consulta, FieEsq31434.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
}
