package mod8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.SpringContacts2022Application;
import dmacc.beans.Address;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ContactRepository;
import mod8.beans.TestGrade;

@SpringBootApplication
public class Module8Application {

	public static void main(String[] args) {
		SpringApplication.run(Module8Application.class, args);
		public static void main(String[] args) {
			SpringApplication.run(Module8Application.class, args);
		}
		
		@Autowired
		ContactRepository repo;

		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			//Using an existing bean
			TestGrade c = appContext.getBean("testGrade", TestGrade.class);
			c.setPercent(72);
			c.setStudentName("Chase");
			c.setTestName("Math");
		
			repo.save(c);
			
			//Create a bean to use - not managed by Spring
			Contact d = new Contact("Sandra Boyton", "555-555-5556", "friend");
			Address a = new Address("987 Elm Court", "Altoona", "IA");
			d.setAddress(a);
			repo.save(d);
			
			List<Contact> allMyContacts = repo.findAll();
			for(Contact people: allMyContacts) {
				System.out.println(people.toString());
			}
			
			//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
			((AbstractApplicationContext) appContext).close();
		
		}
	}

}
