package br.com.sistJCJ.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.sistJCJ.model.CadEsquema;
import br.com.sistJCJ.model.CadResult;

@Repository
@Transactional
public class CadResultDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(CadResult resultado){
		manager.persist(resultado);
	}


	public List<CadResult> buscarResult(int filtro) {
       String consulta = "select n from CadResult n where n.nunConcurso = :nuncerc";
          TypedQuery<CadResult> query = manager.createQuery(consulta, CadResult.class);
                                      query.setParameter("nuncerc", filtro);
      return  query.getResultList();
	}
	public List<CadResult> listResult() {
	       String consulta = "select n from CadResult n order by n.nunConcurso desc";
	          TypedQuery<CadResult> query = manager.createQuery(consulta, CadResult.class);

	      return  query.getResultList();
		}


}
