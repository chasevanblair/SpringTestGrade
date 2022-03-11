/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
package mod8.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TestGrade {
	@Id
	@GeneratedValue
	private long id;
	private int percent;
	private String studentName;
	private String testName;
	private boolean pass;
	
	public TestGrade() {
		super();
	}
	
	public TestGrade(String testName, String studentName, int percent) {
		this.percent = percent;
		this.testName = testName;
		this.studentName = studentName;
		this.pass = percent > 50;
	}
	public TestGrade(String testName, String studentName, int percent, boolean pass) {
		this.percent = percent;
		this.testName = testName;
		this.studentName = studentName;
		this.pass = pass;
	}
	
	public int getPercent() {
		return percent;
	}
	
	@Override
	public String toString() {
		return "TestGrade [testName = " + testName + ", studentName = " + studentName + ", percent = " + percent + "]";
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}
	
	
}
