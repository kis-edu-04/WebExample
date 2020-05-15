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
 * Servlet implementation class ShouhinServlet
 */
@WebServlet("/sid")
public class ShouhinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShouhinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sid = request.getParameter("sid");
		int s1=Integer.parseInt(sid);
		ShouhinDAO dao= new ShouhinDAO();
		Shouhin s=dao.findBySid(s1);


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();




		out.println("<html>");
		out.println("<head>");
		out.println("<title>商品</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>商品ID検索結果</h1>");
		out.println("<p>商品ID:"+ s.getSid()+"</p>");
		out.println("<p>商品名:"+ s.getSname()+"</p>");
		out.println("<p>商品価格:"+ s.getTanka()+"</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
