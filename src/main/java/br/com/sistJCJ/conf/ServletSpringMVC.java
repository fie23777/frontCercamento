package br.com.sistJCJ.conf;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import br.com.fieesq.dao.FieEsqDao33333;
import br.com.fieesq.dao.FieEsqDao43332;
import br.com.fieesq.dao.FieEsqDao44322;
import br.com.fieesq.dao.FieEsqDao44331;
import br.com.fieesq.dao.FieEsqDao44421;
import br.com.fieesq.dao.FieEsqDao44430;
import br.com.fieesq.dao.FieEsqDao53322;
import br.com.fieesq.dao.FieEsqDao53331;
import br.com.fieesq.dao.FieEsqDao54222;
import br.com.fieesq.dao.FieEsqDao54321;
import br.com.fieesq.dao.FieEsqDao54330;
import br.com.fieesq.dao.FieEsqDao55221;
import br.com.fieesq.dao.FieEsqDao55311;
import br.com.fieesq.dao.FieEsqDao55320;
import br.com.fieesq.dao.FieEsqDao55410;
import br.com.fieesq.dao.FieEsqDao55500;
import br.com.sistJCJ.dao.CadResultDao;
import br.com.sistJCJ.dao.FieEsqDao;
import br.com.sistJCJ.dao.UsuarioDao;
import br.com.sistJCJ.regra.ResultRegra;

public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[]{SecurityConfiguration.class,WebAppConfiguration.class,
				           JPAConfiguration.class,CadResultDao.class,
				           UsuarioDao.class,ResultRegra.class,
			               FieEsqDao.class,
			               FieEsqDao33333.class,FieEsqDao43332.class, FieEsqDao44322.class,
			               FieEsqDao44331.class,FieEsqDao44421.class, FieEsqDao44430.class,
			               FieEsqDao53322.class,FieEsqDao53331.class,FieEsqDao54222.class,
			               FieEsqDao54321.class,FieEsqDao54330.class,FieEsqDao55221.class,
			               FieEsqDao55311.class,FieEsqDao55320.class,FieEsqDao55410.class,
			               FieEsqDao55500.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[]{"/"};
	}
	protected Filter[] getServletFilter(){
		CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
		encodingFilter.setEncoding("UTF-8");
		return new Filter[]{(Filter) encodingFilter};
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setMultipartConfig(new MultipartConfigElement(""));
	}

}
