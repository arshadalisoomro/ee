package bit.lin.ee;

import java.util.Iterator;
import java.util.Vector;

public class FaqCategories {
	private Vector categories = new Vector();
	
	public FaqCategories(){
		categories.add("Dates and Times");
		categories.add("Strings and StringBuffers");
		categories.add("Threading");
	}
	
	public Iterator iterator(){
		return categories.iterator();
	}
}