package br.com.sistJCJ.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.fieesqControllers.FieEsq33333Controller;
import br.com.sistJCJ.conroller.HomeController;
import br.com.sistJCJ.regra.ResultRegra;
@EnableWebMvc
@ComponentScan(basePackageClasses={ResultRegra.class, FieEsq33333Controller.class, HomeController.class})
public class WebAppConfiguration extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	InternalResourceViewResolver resolver = 	new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/views/");
	resolver.setSuffix(".jsp");
	resolver.setExposedContextBeanNames("fieBoloes");

	return resolver;
	}
	
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configure){
		configure.enable();
	}



}
