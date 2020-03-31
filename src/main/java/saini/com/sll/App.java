package saini.com.sll;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
 
public class App {    
public static void main(String[] args) {    
	
	
	alien al=new alien();
	

	
	
	
	Configuration con=new Configuration().configure().addAnnotatedClass(alien.class);
	
	
	ServiceRegistry sr=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	
	SessionFactory sf=con.buildSessionFactory(sr);
	

	Session ses1=sf.openSession();
	
	ses1.beginTransaction();


	Query q1=ses1.createQuery("from alien where id=111");
	q1.setCacheable(true);

	al=(alien)q1.uniqueResult();
	System.out.println(al);

	ses1.getTransaction().commit();
	
	ses1.close();
	

	Session ses2=sf.openSession();
	
	ses2.beginTransaction();



	Query q2=ses2.createQuery("from alien where id=111");
	q2.setCacheable(true);

	al=(alien)q2.uniqueResult();

	System.out.println(al);
	
	ses2.getTransaction().commit();
	
	ses2.close();

	
	
	
	
	
//	
// StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure()  
// Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
//   
// SessionFactory factory=meta.getSessionFactoryBuilder().build();  
//     
// Session session1=factory.openSession();    
// Employee emp1=(Employee)session1.load(Employee.class,121);    
// System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());    
// session1.close();    
//     
// Session session2=factory.openSession();    
// Employee emp2=(Employee)session2.load(Employee.class,121);    
// System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());    
// session2.close();    
     
}    
}    