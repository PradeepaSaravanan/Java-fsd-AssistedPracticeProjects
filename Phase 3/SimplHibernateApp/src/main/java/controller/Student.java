package  controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "student")
public class Student {
	
	public Student(int inputId, String inputName, String inputCity) {
		this.studentId = inputId;
		this.studentName = inputName;
		this.studentCity = inputCity;
	}
	
	
	@Id
	@Column (name = "student_id")
	int studentId;
	
	@Column (name = "student_name")
	String studentName;
	
	@Column (name = "student_city")
	String studentCity;
	
	
	

	public Student() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}


	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}


	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	/**
	 * @return the studentCity
	 */
	public String getStudentCity() {
		return studentCity;
	}


	/**
	 * @param studentCity the studentCity to set
	 */
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	@Override
    public String toString() {
		
		return "StudentId is : "+this.getStudentId()+" ,student name is : "+ this.getStudentName() + " and"
				+ " student is from : " +this.getStudentCity();
	}
}
