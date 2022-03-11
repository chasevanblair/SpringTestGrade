/**
 * @author Chase Van Blair - crvanblair
 * CIS175 - Fall 2021
 * Mar 10, 2022
 */
package mod8.beans;

public class TestGrade {
	private long id;
	private int percent;
	private String studentName;
	private String testName;
	
	public TestGrade() {
		super();
	}
	
	public TestGrade(String testName, String studentName, int percent) {
		this.percent = percent;
		this.testName = testName;
		this.studentName = studentName;
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
	
	
}
