package net.km.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"net.km.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/onlineshoppng";
	private final static String DATABASE_DRIVER="org.h2.Driver";

	private final static String DATABASE_DIALECT ="org.hibernate.dialect.H2Dialect";

	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";
	
	//DataSource Bean 
	@Bean
	 DataSource getDataSource()
	{
		BasicDataSource dataSource=new BasicDataSource();//BasicDataSource coming from dbcp2 that we are using for conection poling
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}
	
	//SessionFactory Bean
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);//look for the version of the hibernate to import the class
		sessionBuilder.addProperties(getHibernateProperties());
		sessionBuilder.scanPackages("net.km.shoppingbackend.dto");
		return sessionBuilder.buildSessionFactory();
	}

	
	//All Hibernate properties will be returned 
	
	
private Properties getHibernateProperties() {
Properties properties= new Properties();
properties.put("hibernate.dialect", DATABASE_DIALECT);
properties.put("hibernate.show_sql", "true");
properties.put("hibernate.format_sql","true");
		
		
		return properties;
	}
	
	//Transation manager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)//use the session factory from thr previous bean created

{
	HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
	return transactionManager;
		


}
	

}
