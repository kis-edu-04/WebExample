package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.keisan;

/**
 * Servlet implementation class keisanServlet
 */
@WebServlet("/keisan")
public class keisanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public keisanServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String modeStr = request.getParameter("mode");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int mode =Integer.parseInt(modeStr);

		int kotae=0;
		if (mode==0) {
			kotae = n1 + n2;
		}else {
			kotae = n1 - n2;
		}


		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head>");
		out.println("<title>フォーム</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>計算</h1>");
		out.println("<p>"+num1+"</p>");
		out.println("<p>"+num2+"</p>");
		out.println("<p>"+kotae+"</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String modeStr = request.getParameter("mode");
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		int mode =Integer.parseInt(modeStr);

		
		
		 keisan k =new keisan(n1,n2,mode);
		request.setAttribute("keisan", k);
		

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/keisan.jsp");
		dispatcher.forward(request, response);

		
	}

}
