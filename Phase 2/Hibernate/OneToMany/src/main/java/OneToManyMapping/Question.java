package OneToManyMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Question")
public class Question {
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
 private int qid;
	@Column
 private String qn;
 @OneToMany (cascade=CascadeType.ALL)
 //@JoinTable(name="QA", joinColumns= {@joinColumns(name="qid")}, inverseJoinColumns= {@JoinColumn(name="aid")})
 
 @JoinTable (name="QA", joinColumns= {@JoinColumn(name="qid")},inverseJoinColumns= { @JoinColumn(name="aid")} )
 private List<Answer> answers;

public int getQid() {
	return qid;
}

public void setQid(int qid) {
	this.qid = qid;
}

public String getQn() {
	return qn;
}

public void setQn(String qn) {
	this.qn = qn;
}

public List<Answer> getAnswers() {
	return answers;
}

public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
 
}
