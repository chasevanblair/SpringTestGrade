/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
package mod8.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mod8.beans.TestGrade;

@Configuration
public class BeanConfiguration {

	@Bean
	public TestGrade testGrade() {
		TestGrade bean = new TestGrade();
		return bean;
	}
}
