package bit.lin.ee;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockListServlet extends HttpServlet {
	private StockList list;

	public void init() {
		list = StockListFactory.getDefsultInstance();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			String type = request.getPathInfo().substring(1);

			if (type.equals("AnalystForm")) {
				request.setAttribute("analysts", list.getAnalysts());
			} else if (type.equals("RatingForm")) {
				request.setAttribute("rating", list.getRatings());
				request.setAttribute("analysts", list.getAnalysts());
				request.setAttribute("unratedStocks", list.getUnratedStocks());
			} else if (type.equals("AddRating")) {
//				request.setAttribute("rating", list.getRatings());
//				request.setAttribute("analysts", list.getAnalysts());
//				request.setAttribute("unratedStocks", list.getUnratedStocks());
			} else if (type.equals("ProcessAnalyst")) {
				String[] deletedAnalysts = (String[]) request
						.getParameterValues("deletedAnalysts");
				String addAnalysts = (String) request
						.getParameter("addAnalysts");
				if (deletedAnalysts != null) {
					list.getAnalysts()
							.removeAll(Arrays.asList(deletedAnalysts));
				}
				if (addAnalysts != null && !addAnalysts.equals(""))
					list.getAnalysts().add(addAnalysts);
			} else {
				type = "Error";
			}

			System.out.println("To " + type);
			RequestDispatcher dispatcher = this.getServletContext()
					.getNamedDispatcher(type);
			if (dispatcher == null) {
				dispatcher = this.getServletContext().getNamedDispatcher(
						"Error");
				System.out.println("ERROR");
			}
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		doGet(request, response);
	}
}
