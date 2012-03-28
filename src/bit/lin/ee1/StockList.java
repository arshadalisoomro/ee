package bit.lin.ee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class StockList {
	private ArrayList<String> analysts = new ArrayList<String>();
	private ArrayList<String> unratedStocks = new ArrayList<String>();
	private ArrayList<Vector<String>> ratings = new ArrayList<Vector<String>>();

	public ArrayList<String> getAnalysts() {
		return analysts;
	}

	public void setAnalysts(ArrayList<String> analysts) {
		this.analysts = analysts;
	}

	public ArrayList<String> getUnratedStocks() {
		return unratedStocks;
	}

	public void setUnratedStocks(ArrayList<String> unratedStocks) {
		this.unratedStocks = unratedStocks;
	}

	public ArrayList<Vector<String>> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Vector<String>> ratings) {
		this.ratings = ratings;
	}

}
