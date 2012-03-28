package bit.lin.ee;

import java.util.HashMap;
import java.util.Map;

public class Questions {
	private String topic;
	private int numQuestions;
	public int getNumQuestions() {
		return numQuestions;
	}

	public void setNumQuestions(int numQuestions) {
		this.numQuestions = numQuestions;
	}

	private Map<String, Map> questions = new HashMap<String, Map>();

	public Questions() {
		Map<String, String> topic = new HashMap<String, String>();
		topic.put("EL_1", "How do i use implicit objects?");
		topic.put("EL_2", "How do i use JSTL?");
		topic.put("EL_3", "How do i use the empty operator?");
		questions.put("EL", topic);
		setNumQuestions(questions.size());
	}

	public Map<String, Map> getQuestions() {
		return (Map)questions.get("EL");
	}

	public void setQuestions(Map<String, Map> questions) {
		this.questions = questions;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
