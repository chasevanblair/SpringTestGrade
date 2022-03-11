package mod8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import mod8.controller.BeanConfiguration;
import mod8.repository.TestGradeRepository;
import mod8.beans.TestGrade;

@SpringBootApplication
public class Module8Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Module8Application.class, args);
	}
		@Autowired
		TestGradeRepository repo;

		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
			//Using an existing bean
			TestGrade a = appContext.getBean("testGrade", TestGrade.class);
			a.setPercent(72);
			a.setStudentName("Chase");
			a.setTestName("Math");
		
			repo.save(a);
			
			List<TestGrade> allTests = repo.findAll();
			for(TestGrade tests: allTests) {
				System.out.println(tests.toString());
			}
			//closes the ApplicationContext resource leak - not imperative to add but nice to clean it up
			((AbstractApplicationContext) appContext).close();
		
		}
	}


