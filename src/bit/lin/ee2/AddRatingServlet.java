package bit.lin.ee;

import java.io.IOException;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddRatingServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		StockList list = StockListFactory.getDefsultInstance();
		list.getUnratedStocks().remove(request.getParameter("stocks"));
		Vector<String> v = new Vector<String>();
		v.add(request.getParameter("analysts"));
		v.add(request.getParameter("stocks"));
		v.add(request.getParameter("ratings"));
		list.getRatings().add(v);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.html");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
