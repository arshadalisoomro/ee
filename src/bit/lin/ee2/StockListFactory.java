package bit.lin.ee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class StockListFactory {
	static StockList list;
	public static StockList getDefsultInstance(){
		if(list!=null)
			return list;
		list = new StockList();
		ArrayList<String> analysts = new ArrayList<String>();
		ArrayList<String> unratedStocks = new ArrayList<String>();
		ArrayList<Vector<String>> ratings = new ArrayList<Vector<String>>();

		analysts.add("Linshuang");
		analysts.add("Fred");
		analysts.add("Jim");
		analysts.add("Tom");
		analysts.add("Nacy");
		list.setAnalysts(analysts);
		
		unratedStocks.add("ABC");
		unratedStocks.add("SHELL");
		unratedStocks.add("SHANDA");
		unratedStocks.add("TECENT");
		unratedStocks.add("GOOGLE");
		unratedStocks.add("BAIDU");
		unratedStocks.add("NEXTP");
		unratedStocks.add("APPLE");
		unratedStocks.add("ZAP");
		list.setUnratedStocks(unratedStocks);
		
		Vector<String> v = new Vector<String>();
		v.add("Linshuang");
		v.add("google");
		v.add("excellent");
		ratings.add(v);
		list.setRatings(ratings);
		
		return list;
	}
}
