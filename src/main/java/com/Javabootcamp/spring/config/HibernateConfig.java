package com.Javabootcamp.spring.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;




@Configuration
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class HibernateConfig {

	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName(env.getRequiredProperty("jdbc.driverClassName"));
		datasource.setUrl(env.getRequiredProperty("jdbc.url"));
		datasource.setUsername(env.getRequiredProperty("jdbc.user"));
		datasource.setPassword(env.getRequiredProperty("jdbc.password"));
		
		return datasource;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan(new String[] { "com.Javabootcamp.spring" });
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
     }

	 private Properties hibernateProperties() {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", env.getRequiredProperty("hibernate.dialect"));
	        properties.put("hibernate.show_sql", env.getRequiredProperty("hibernate.show_sql"));
	        properties.put("hibernate.format_sql", env.getRequiredProperty("hibernate.format_sql"));
	        return properties;        
	    }
	    
	 	@Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory s) {
	       HibernateTransactionManager txManager = new HibernateTransactionManager();
	       txManager.setSessionFactory(s);
	       return txManager;
	    }

}
