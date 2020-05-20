package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Shouhin;
import model.ShouhinDAO;
import model.Uriage;
import model.UriageDAO;

/**
 * Servlet implementation class UriageServlet
 */
@WebServlet("/uriagesid")
public class UriageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UriageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sidStr = request.getParameter("sid");
		int sid =Integer.parseInt(sidStr);

		UriageDAO udao = new UriageDAO();
		ArrayList<Uriage> u= udao.findBySid(sid);
		request.setAttribute("list", u);

		ShouhinDAO sdao = new ShouhinDAO();
		Shouhin s =sdao.findBySid(sid);
		request.setAttribute("shouhin", s);


		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/uriagesid.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String sidStr = request.getParameter("sid");
		String kosuStr = request.getParameter("kosu");
		String url = "uriagesid?sid="+sidStr;
		int kosu =Integer.parseInt(kosuStr);
		int sid =Integer.parseInt(sidStr);
		UriageDAO dao= new UriageDAO();
		Uriage u= new Uriage (0,sid,kosu,null);
		dao.insert(u);
		response.sendRedirect(url);
	}

}
