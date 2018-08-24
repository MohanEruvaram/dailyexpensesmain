package com.eyphm.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurationSelector;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.eyphm.*")
@EnableTransactionManagement
public class Servletconfiguration {
	@Bean
	public InternalResourceViewResolver internalresource() {
		InternalResourceViewResolver internalResourceviewresolver = new InternalResourceViewResolver();
		internalResourceviewresolver.setPrefix("/WEB-INF/jsp/");
		internalResourceviewresolver.setSuffix(".jsp");
		return internalResourceviewresolver;
	}
/*
	@Bean
	@Autowired
	public LocalSessionFactoryBean localsession() {
		LocalSessionFactoryBean localsession = new LocalSessionFactoryBean();
		localsession.setAnnotatedPackages("com.eyphm.model");
		localsession.setDataSource(datasource());
		localsession.setHibernateProperties(hiernateproperties());

		return localsession;

	}

	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		datasource.setUrl("jdbc:oracle:thin:@amazonportal.c2zoagnxyk96.ap-south-1.rds.amazonaws.com:1521/orcl");
		datasource.setUsername("Mohan");
		datasource.setPassword("Mohan1122");
		return datasource;
	}

	@Bean
	public Properties hiernateproperties() {
		Properties properties = new Properties();
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		return properties;
	}

	@Bean
	@Autowired
	public HibernateTransactionManager hib(SessionFactory session) {
		HibernateTransactionManager hiber = new HibernateTransactionManager();
		hiber.setSessionFactory(session);
		return hiber;

	}*/
}
