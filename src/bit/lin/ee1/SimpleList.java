package bit.lin.ee;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleList extends SimpleTagSupport {
	private String topic;

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void doTag() throws IOException, JspException {
		Questions questions = new Questions();
		questions.setTopic(topic);

		Map map = questions.getQuestions();
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry e = (Entry) it.next();
			getJspContext().setAttribute("qid", e.getKey());
			getJspContext().setAttribute("question", e.getValue());
			getJspBody().invoke(null);

		}
	}
}
