package ManyToMany;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="Subscription")
public class Subscription {
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE, generator="Subscript")
	@SequenceGenerator(name="Sub" , sequenceName="Subscript")
private int sub_id;
	@Column(length=30)
private String sub_name;
	@ManyToMany(mappedBy="subcripts")

private Set<Reader>readers;
public Set<Reader> getReaders() {
		return readers;
	}
	public void setReaders(Set<Reader> readers) {
		this.readers = readers;
	}
public int getSub_id() {
	return sub_id;
}
public void setSub_id(int sub_id) {
	this.sub_id = sub_id;
}
public String getSub_name() {
	return sub_name;
}
public void setSub_name(String sub_name) {
	this.sub_name = sub_name;
}



}
