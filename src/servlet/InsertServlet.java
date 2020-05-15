package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");
		String tanka = request.getParameter("tanka");

		int t1=Integer.parseInt(tanka);
		ShouhinDAO dao= new ShouhinDAO();
		Shouhin s= new Shouhin(0,name,t1);
		dao.insert(s);


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();




		out.println("<html>");
		out.println("<head>");
		out.println("<title>商品</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>商品を追加しました</h1>");
		out.println("<a href=\"slist\">商品一覧</a>");
		out.println("</body>");
		out.println("</html>");
	}

}
