package Collection;

import java.util.List;

public class Question {
 private int id;
 private String qn;
private List<String> answer;
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQn() {
	return qn;
}
public void setQn(String qn) {
	this.qn = qn;
}
}
