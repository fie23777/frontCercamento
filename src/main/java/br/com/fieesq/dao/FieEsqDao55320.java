package br.com.fieesq.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.fieesq.model55320.FieEsq02355;
import br.com.fieesq.model55320.FieEsq02535;
import br.com.fieesq.model55320.FieEsq02553;
import br.com.fieesq.model55320.FieEsq03255;
import br.com.fieesq.model55320.FieEsq03525;
import br.com.fieesq.model55320.FieEsq03552;
import br.com.fieesq.model55320.FieEsq05235;
import br.com.fieesq.model55320.FieEsq05253;
import br.com.fieesq.model55320.FieEsq05325;
import br.com.fieesq.model55320.FieEsq05352;
import br.com.fieesq.model55320.FieEsq05523;
import br.com.fieesq.model55320.FieEsq05532;
import br.com.fieesq.model55320.FieEsq20355;
import br.com.fieesq.model55320.FieEsq20535;
import br.com.fieesq.model55320.FieEsq20553;
import br.com.fieesq.model55320.FieEsq23055;
import br.com.fieesq.model55320.FieEsq23505;
import br.com.fieesq.model55320.FieEsq23550;
import br.com.fieesq.model55320.FieEsq25035;
import br.com.fieesq.model55320.FieEsq25053;
import br.com.fieesq.model55320.FieEsq25305;
import br.com.fieesq.model55320.FieEsq25350;
import br.com.fieesq.model55320.FieEsq25503;
import br.com.fieesq.model55320.FieEsq25530;
import br.com.fieesq.model55320.FieEsq30255;
import br.com.fieesq.model55320.FieEsq30525;
import br.com.fieesq.model55320.FieEsq30552;
import br.com.fieesq.model55320.FieEsq32055;
import br.com.fieesq.model55320.FieEsq32505;
import br.com.fieesq.model55320.FieEsq32550;
import br.com.fieesq.model55320.FieEsq35025;
import br.com.fieesq.model55320.FieEsq35052;
import br.com.fieesq.model55320.FieEsq35205;
import br.com.fieesq.model55320.FieEsq35250;
import br.com.fieesq.model55320.FieEsq35502;
import br.com.fieesq.model55320.FieEsq35520;
import br.com.fieesq.model55320.FieEsq50235;
import br.com.fieesq.model55320.FieEsq50253;
import br.com.fieesq.model55320.FieEsq50325;
import br.com.fieesq.model55320.FieEsq50352;
import br.com.fieesq.model55320.FieEsq50523;
import br.com.fieesq.model55320.FieEsq50532;
import br.com.fieesq.model55320.FieEsq52035;
import br.com.fieesq.model55320.FieEsq52053;
import br.com.fieesq.model55320.FieEsq52305;
import br.com.fieesq.model55320.FieEsq52350;
import br.com.fieesq.model55320.FieEsq52503;
import br.com.fieesq.model55320.FieEsq52530;
import br.com.fieesq.model55320.FieEsq53025;
import br.com.fieesq.model55320.FieEsq53052;
import br.com.fieesq.model55320.FieEsq53205;
import br.com.fieesq.model55320.FieEsq53250;
import br.com.fieesq.model55320.FieEsq53502;
import br.com.fieesq.model55320.FieEsq53520;
import br.com.fieesq.model55320.FieEsq55023;
import br.com.fieesq.model55320.FieEsq55032;
import br.com.fieesq.model55320.FieEsq55203;
import br.com.fieesq.model55320.FieEsq55230;
import br.com.fieesq.model55320.FieEsq55302;
import br.com.fieesq.model55320.FieEsq55320;
@Repository
@Transactional
public class FieEsqDao55320 {
	@PersistenceContext
	private EntityManager manager;
	
	private int limite = 20;
	

	
	public List<FieEsq32550> listarFieEsq32550(String filtro) {
	       String consulta = "select l from FieEsq32550 l where l.numEsq32550 like :nuncerc";
	          TypedQuery<FieEsq32550> query = manager.createQuery(consulta, FieEsq32550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 32505
	
	public List<FieEsq32505> listarFieEsq32505(String filtro) {
	       String consulta = "select l from FieEsq32505 l where l.numEsq32505 like :nuncerc";
	          TypedQuery<FieEsq32505> query = manager.createQuery(consulta, FieEsq32505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 32055
	
	public List<FieEsq32055> listarFieEsq32055(String filtro) {
	       String consulta = "select l from FieEsq32055 l where l.numEsq32055 like :nuncerc";
	          TypedQuery<FieEsq32055> query = manager.createQuery(consulta, FieEsq32055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 35250
	
	public List<FieEsq35250> listarFieEsq35250(String filtro) {
	       String consulta = "select l from FieEsq35250 l where l.numEsq35250 like :nuncerc";
	          TypedQuery<FieEsq35250> query = manager.createQuery(consulta, FieEsq35250.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq53052> listarFieEsq53052(String filtro) {
	       String consulta = "select l from FieEsq53052 l where l.numEsq53052 like :nuncerc";
	          TypedQuery<FieEsq53052> query = manager.createQuery(consulta, FieEsq53052.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53025> listarFieEsq53025(String filtro) {
	       String consulta = "select l from FieEsq53025 l where l.numEsq53025 like :nuncerc";
	          TypedQuery<FieEsq53025> query = manager.createQuery(consulta, FieEsq53025.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53502> listarFieEsq53502(String filtro) {
	       String consulta = "select l from FieEsq53502 l where l.numEsq53502 like :nuncerc";
	          TypedQuery<FieEsq53502> query = manager.createQuery(consulta, FieEsq53502.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53520> listarFieEsq53520(String filtro) {
	       String consulta = "select l from FieEsq53520 l where l.numEsq53520 like :nuncerc";
	          TypedQuery<FieEsq53520> query = manager.createQuery(consulta, FieEsq53520.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53205> listarFieEsq53205(String filtro) {
	       String consulta = "select l from FieEsq53205 l where l.numEsq53205 like :nuncerc";
	          TypedQuery<FieEsq53205> query = manager.createQuery(consulta, FieEsq53205.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq53250> listarFieEsq53250(String filtro) {
	       String consulta = "select l from FieEsq53250 l where l.numEsq53250 like :nuncerc";
	          TypedQuery<FieEsq53250> query = manager.createQuery(consulta, FieEsq53250.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20553> listarFieEsq20553(String filtro) {
	       String consulta = "select l from FieEsq20553 l where l.numEsq20553 like :nuncerc";
	          TypedQuery<FieEsq20553> query = manager.createQuery(consulta, FieEsq20553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20535> listarFieEsq20535(String filtro) {
	       String consulta = "select l from FieEsq20535 l where l.numEsq20535 like :nuncerc";
	          TypedQuery<FieEsq20535> query = manager.createQuery(consulta, FieEsq20535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq20355> listarFieEsq20355(String filtro) {
	       String consulta = "select l from FieEsq20355 l where l.numEsq20355 like :nuncerc";
	          TypedQuery<FieEsq20355> query = manager.createQuery(consulta, FieEsq20355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25053> listarFieEsq25053(String filtro) {
	       String consulta = "select l from FieEsq25053 l where l.numEsq25053 like :nuncerc";
	          TypedQuery<FieEsq25053> query = manager.createQuery(consulta, FieEsq25053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25035> listarFieEsq25035(String filtro) {
	       String consulta = "select l from FieEsq25035 l where l.numEsq25035 like :nuncerc";
	          TypedQuery<FieEsq25035> query = manager.createQuery(consulta, FieEsq25035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25503> listarFieEsq25503(String filtro) {
	       String consulta = "select l from FieEsq25503 l where l.numEsq25503 like :nuncerc";
	          TypedQuery<FieEsq25503> query = manager.createQuery(consulta, FieEsq25503.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25530> listarFieEsq25530(String filtro) {
	       String consulta = "select l from FieEsq25530 l where l.numEsq25530 like :nuncerc";
	          TypedQuery<FieEsq25530> query = manager.createQuery(consulta, FieEsq25530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25305> listarFieEsq25305(String filtro) {
	       String consulta = "select l from FieEsq25305 l where l.numEsq25305 like :nuncerc";
	          TypedQuery<FieEsq25305> query = manager.createQuery(consulta, FieEsq25305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq25350> listarFieEsq25350(String filtro) {
	       String consulta = "select l from FieEsq25350 l where l.numEsq25350 like :nuncerc";
	          TypedQuery<FieEsq25350> query = manager.createQuery(consulta, FieEsq25350.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23505> listarFieEsq23505(String filtro) {
	       String consulta = "select l from FieEsq23505 l where l.numEsq23505 like :nuncerc";
	          TypedQuery<FieEsq23505> query = manager.createQuery(consulta, FieEsq23505.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23550> listarFieEsq23550(String filtro) {
	       String consulta = "select l from FieEsq23550 l where l.numEsq23550 like :nuncerc";
	          TypedQuery<FieEsq23550> query = manager.createQuery(consulta, FieEsq23550.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35052> listarFieEsq35052(String filtro) {
	       String consulta = "select l from FieEsq35052 l where l.numEsq35052 like :nuncerc";
	          TypedQuery<FieEsq35052> query = manager.createQuery(consulta, FieEsq35052.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35025> listarFieEsq35025(String filtro) {
	       String consulta = "select l from FieEsq35025 l where l.numEsq35025 like :nuncerc";
	          TypedQuery<FieEsq35025> query = manager.createQuery(consulta, FieEsq35025.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30552> listarFieEsq30552(String filtro) {
	       String consulta = "select l from FieEsq30552 l where l.numEsq30552 like :nuncerc";
	          TypedQuery<FieEsq30552> query = manager.createQuery(consulta, FieEsq30552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30525> listarFieEsq30525(String filtro) {
	       String consulta = "select l from FieEsq30525 l where l.numEsq30525 like :nuncerc";
	          TypedQuery<FieEsq30525> query = manager.createQuery(consulta, FieEsq30525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq30255> listarFieEsq30255(String filtro) {
	       String consulta = "select l from FieEsq30255 l where l.numEsq30255 like :nuncerc";
	          TypedQuery<FieEsq30255> query = manager.createQuery(consulta, FieEsq30255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35502> listarFieEsq35502(String filtro) {
	       String consulta = "select l from FieEsq35502 l where l.numEsq35502 like :nuncerc";
	          TypedQuery<FieEsq35502> query = manager.createQuery(consulta, FieEsq35502.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35520> listarFieEsq35520(String filtro) {
	       String consulta = "select l from FieEsq35520 l where l.numEsq35520 like :nuncerc";
	          TypedQuery<FieEsq35520> query = manager.createQuery(consulta, FieEsq35520.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq35205> listarFieEsq35205(String filtro) {
	       String consulta = "select l from FieEsq35205 l where l.numEsq35205 like :nuncerc";
	          TypedQuery<FieEsq35205> query = manager.createQuery(consulta, FieEsq35205.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	public List<FieEsq52350> listarFieEsq52350(String filtro) {
	       String consulta = "select l from FieEsq52350 l where l.numEsq52350 like :nuncerc";
	          TypedQuery<FieEsq52350> query = manager.createQuery(consulta, FieEsq52350.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52305
	
	public List<FieEsq52305> listarFieEsq52305(String filtro) {
	       String consulta = "select l from FieEsq52305 l where l.numEsq52305 like :nuncerc";
	          TypedQuery<FieEsq52305> query = manager.createQuery(consulta, FieEsq52305.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52530
	
	public List<FieEsq52530> listarFieEsq52530(String filtro) {
	       String consulta = "select l from FieEsq52530 l where l.numEsq52530 like :nuncerc";
	          TypedQuery<FieEsq52530> query = manager.createQuery(consulta, FieEsq52530.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	//para listar em tela 52503
	
	public List<FieEsq52503> listarFieEsq52503(String filtro) {
	       String consulta = "select l from FieEsq52503 l where l.numEsq52503 like :nuncerc";
	          TypedQuery<FieEsq52503> query = manager.createQuery(consulta, FieEsq52503.class).setMaxResults(10);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
//************************************************************************************************************************
	
	
	
	public List<FieEsq05532> listarFieEsq05532(String filtro) {
	       String consulta = "select l from FieEsq05532 l where l.numEsq05532 like :nuncerc";
	          TypedQuery<FieEsq05532> query = manager.createQuery(consulta, FieEsq05532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05253> listarFieEsq05253(String filtro) {
	       String consulta = "select l from FieEsq05253 l where l.numEsq05253 like :nuncerc";
	          TypedQuery<FieEsq05253> query = manager.createQuery(consulta, FieEsq05253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05235> listarFieEsq05235(String filtro) {
	       String consulta = "select l from FieEsq05235 l where l.numEsq05235 like :nuncerc";
	          TypedQuery<FieEsq05235> query = manager.createQuery(consulta, FieEsq05235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05352> listarFieEsq05352(String filtro) {
	       String consulta = "select l from FieEsq05352 l where l.numEsq05352 like :nuncerc";
	          TypedQuery<FieEsq05352> query = manager.createQuery(consulta, FieEsq05352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05325> listarFieEsq05325(String filtro) {
	       String consulta = "select l from FieEsq05325 l where l.numEsq05325 like :nuncerc";
	          TypedQuery<FieEsq05325> query = manager.createQuery(consulta, FieEsq05325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02553> listarFieEsq02553(String filtro) {
	       String consulta = "select l from FieEsq02553 l where l.numEsq02553 like :nuncerc";
	          TypedQuery<FieEsq02553> query = manager.createQuery(consulta, FieEsq02553.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02535> listarFieEsq02535(String filtro) {
	       String consulta = "select l from FieEsq02535 l where l.numEsq02535 like :nuncerc";
	          TypedQuery<FieEsq02535> query = manager.createQuery(consulta, FieEsq02535.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq02355> listarFieEsq02355(String filtro) {
	       String consulta = "select l from FieEsq02355 l where l.numEsq02355 like :nuncerc";
	          TypedQuery<FieEsq02355> query = manager.createQuery(consulta, FieEsq02355.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03552> listarFieEsq03552(String filtro) {
	       String consulta = "select l from FieEsq03552 l where l.numEsq03552 like :nuncerc";
	          TypedQuery<FieEsq03552> query = manager.createQuery(consulta, FieEsq03552.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03525> listarFieEsq03525(String filtro) {
	       String consulta = "select l from FieEsq03525 l where l.numEsq03525 like :nuncerc";
	          TypedQuery<FieEsq03525> query = manager.createQuery(consulta, FieEsq03525.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq03255> listarFieEsq03255(String filtro) {
	       String consulta = "select l from FieEsq03255 l where l.numEsq03255 like :nuncerc";
	          TypedQuery<FieEsq03255> query = manager.createQuery(consulta, FieEsq03255.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50523> listarFieEsq50523(String filtro) {
	       String consulta = "select l from FieEsq50523 l where l.numEsq50523 like :nuncerc";
	          TypedQuery<FieEsq50523> query = manager.createQuery(consulta, FieEsq50523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50532> listarFieEsq50532(String filtro) {
	       String consulta = "select l from FieEsq50532 l where l.numEsq50532 like :nuncerc";
	          TypedQuery<FieEsq50532> query = manager.createQuery(consulta, FieEsq50532.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50253> listarFieEsq50253(String filtro) {
	       String consulta = "select l from FieEsq50253 l where l.numEsq50253 like :nuncerc";
	          TypedQuery<FieEsq50253> query = manager.createQuery(consulta, FieEsq50253.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50235> listarFieEsq50235(String filtro) {
	       String consulta = "select l from FieEsq50235 l where l.numEsq50235 like :nuncerc";
	          TypedQuery<FieEsq50235> query = manager.createQuery(consulta, FieEsq50235.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq23055> listarFieEsq23055(String filtro) {
	       String consulta = "select l from FieEsq23055 l where l.numEsq23055 like :nuncerc";
	          TypedQuery<FieEsq23055> query = manager.createQuery(consulta, FieEsq23055.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50352> listarFieEsq50352(String filtro) {
	       String consulta = "select l from FieEsq50352 l where l.numEsq50352 like :nuncerc";
	          TypedQuery<FieEsq50352> query = manager.createQuery(consulta, FieEsq50352.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq50325> listarFieEsq50325(String filtro) {
	       String consulta = "select l from FieEsq50325 l where l.numEsq50325 like :nuncerc";
	          TypedQuery<FieEsq50325> query = manager.createQuery(consulta, FieEsq50325.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55023> listarFieEsq55023(String filtro) {
	       String consulta = "select l from FieEsq55023 l where l.numEsq55023 like :nuncerc";
	          TypedQuery<FieEsq55023> query = manager.createQuery(consulta, FieEsq55023.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55032> listarFieEsq55032(String filtro) {
	       String consulta = "select l from FieEsq55032 l where l.numEsq55032 like :nuncerc";
	          TypedQuery<FieEsq55032> query = manager.createQuery(consulta, FieEsq55032.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55203> listarFieEsq55203(String filtro) {
	       String consulta = "select l from FieEsq55203 l where l.numEsq55203 like :nuncerc";
	          TypedQuery<FieEsq55203> query = manager.createQuery(consulta, FieEsq55203.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55230> listarFieEsq55230(String filtro) {
	       String consulta = "select l from FieEsq55230 l where l.numEsq55230 like :nuncerc";
	          TypedQuery<FieEsq55230> query = manager.createQuery(consulta, FieEsq55230.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55302> listarFieEsq55302(String filtro) {
	       String consulta = "select l from FieEsq55302 l where l.numEsq55302 like :nuncerc";
	          TypedQuery<FieEsq55302> query = manager.createQuery(consulta, FieEsq55302.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq55320> listarFieEsq55320(String filtro) {
	       String consulta = "select l from FieEsq55320 l where l.numEsq55320 like :nuncerc";
	          TypedQuery<FieEsq55320> query = manager.createQuery(consulta, FieEsq55320.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52053> listarFieEsq52053(String filtro) {
	       String consulta = "select l from FieEsq52053 l where l.numEsq52053 like :nuncerc";
	          TypedQuery<FieEsq52053> query = manager.createQuery(consulta, FieEsq52053.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq52035> listarFieEsq52035(String filtro) {
	       String consulta = "select l from FieEsq52035 l where l.numEsq52035 like :nuncerc";
	          TypedQuery<FieEsq52035> query = manager.createQuery(consulta, FieEsq52035.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	public List<FieEsq05523> listarFieEsq05523(String filtro) {
	       String consulta = "select l from FieEsq05523 l where l.numEsq05523 like :nuncerc";
	          TypedQuery<FieEsq05523> query = manager.createQuery(consulta, FieEsq05523.class).setMaxResults(limite);
	                                    query.setParameter("nuncerc", "%" +filtro+ "%");	                                      
	      return  query.getResultList();
		}
	
	
}
