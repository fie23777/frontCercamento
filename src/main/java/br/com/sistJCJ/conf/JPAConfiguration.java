package br.com.sistJCJ.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		   LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
		
		 JpaVendorAdapter verderAdapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(verderAdapter);
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
			dataSource.setUsername("root");
			dataSource.setPassword("");
			dataSource.setUrl("jdbc:mysql://localhost:3306/cercamento");
			dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		factoryBean.setDataSource(dataSource);
		
		Properties prop = new Properties();
			prop.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
			prop.setProperty("hibernate.show_sql", "true");
			prop.setProperty("hibernate.hbm2ddl.auto", "update");
		factoryBean.setJpaProperties(prop);
		
		factoryBean.setPackagesToScan("br.com.sistJCJ.model",
				                        "br.com.fieesq.model33333",
										"br.com.fieesq.model43332",
										"br.com.fieesq.model44322",
										"br.com.fieesq.model44331",
										"br.com.fieesq.model44421",
										"br.com.fieesq.model44430",
										"br.com.fieesq.model53322",
										"br.com.fieesq.model53331",
										"br.com.fieesq.model54222",
										"br.com.fieesq.model54321",
										"br.com.fieesq.model54330",
										"br.com.fieesq.model55221",
										"br.com.fieesq.model55311",
										"br.com.fieesq.model55320",
										"br.com.fieesq.model55410",
										"br.com.fieesq.model55500"
										                      );

		return factoryBean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf){
		return new JpaTransactionManager(emf);
	}

}
