package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Shouhin;
import model.ShouhinDAO;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String tanka = request.getParameter("tanka");
		int t1=Integer.parseInt(tanka);

		if(name.length()==0) {
			request.setAttribute("mes","商品名を入力してください");
			request.setAttribute("url","insert.html");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
			return;
		}


		Shouhin s1= new Shouhin(0,name,t1);

		HttpSession session = request.getSession();
		session.setAttribute("shouhin", s1);

//	    request.setAttribute("shouhin", s1);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/kakunin.jsp");
		dispatcher.forward(request, response);
		}catch(NumberFormatException e) {
			request.setAttribute("mes","単価を入力してください");
			request.setAttribute("url","insert.html");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ShouhinDAO dao= new ShouhinDAO();

		HttpSession session = request.getSession();

		Shouhin s= (Shouhin)session.getAttribute("shouhin");
		dao.insert(s);


		response.sendRedirect("slist");


//		request.setAttribute("shouhin",s);
//
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/insert.jsp");
//		dispatcher.forward(request, response);



	}

}
