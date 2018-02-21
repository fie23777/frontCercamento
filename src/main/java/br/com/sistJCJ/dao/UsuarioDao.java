package br.com.sistJCJ.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.sistJCJ.model.Usuario;

@Repository
public class UsuarioDao implements UserDetailsService {
     
	@PersistenceContext
	private EntityManager manager;
	
	public Usuario loadUserByUsername(String email){
		List<Usuario> usuario =manager.createQuery("select u from Usuario u where u.email = :email", Usuario.class)
		.setParameter("email", email)
		.getResultList();
		
		if(usuario.isEmpty()){
			throw new UsernameNotFoundException("Usuário "+email+" não encontrado");
		}
		return usuario.get(0);
	}


}
