package Exp;

class Student{
	String name;
	int rollno;
	String course;
	public Student(String name, int rollno, String course)
	{
		this.name=name;
		this.rollno=rollno;
		this.course=course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void StringtoString()
	{
		System.out.println("Name :"+this.getName()+"\n Rollno: "+this.getRollno()+"\n Course taken: "+this.getCourse());
	}
	
}
public class ClassObjects {

	public static void main(String[] args) {
		Student stud= new Student("Arun",234,"Computer");
		System.out.println("");
		
		stud.StringtoString();
	}

}
