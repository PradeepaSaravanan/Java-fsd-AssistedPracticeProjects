package EmployeeInfo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employeedetaila {
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
private int emp_id;
	@Column (length=30)
private String name, email;
	@OneToOne (targetEntity=Address.class,cascade=CascadeType.ALL)
private Address adress;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAdress() {
	return adress;
}
public void setAdress(Address adress) {
	this.adress = adress;
}

}
