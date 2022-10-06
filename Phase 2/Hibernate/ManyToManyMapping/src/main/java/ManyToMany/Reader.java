package ManyToMany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Reader")
public class Reader {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Readers_seq")
	@SequenceGenerator (name="reader_gen", sequenceName="Readers_seq")
	private int r_id;
	@Column(length=30)
	private String Rname;
	@ManyToMany( targetEntity=Subscription.class,cascade=CascadeType.ALL)
	@JoinTable(name="R_S", joinColumns= {@JoinColumn(name="r_id")},inverseJoinColumns= {@JoinColumn(name="Sub_id")})
	
	
	private Set<Subscription>subcripts;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getRname() {
		return Rname;
	}
	public void setRname(String rname) {
		Rname = rname;
	}
	public Set<Subscription> getSubcripts() {
		return subcripts;
	}
	public void setSubcripts(Set<Subscription> subcripts) {
		this.subcripts = subcripts;
	}
	
	
	

}
