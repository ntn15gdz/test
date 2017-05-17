package se.hig.ntn15gdz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestTomApp
 */
@WebServlet("/TestTomApp")
public class TestTomApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestTomApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		try(PrintWriter out = response.getWriter()){
			out.println("<html><head><title>testsida</title></head>");
			out.println("<body><h1>testsida för Tomcat</h1>");
			out.println("<hr><h2>Gianfranco och Natthakons testsida</h2><p>");
			out.println("Parametrar a och b är int, op är en sträng (+(%2b),-,*,/)</p>");
			
			String a = request.getParameter("a");
			String b = request.getParameter("b");
			String op = request.getParameter("op");
			double result = 0;
			
			if(op.equals("+")){
				result = Integer.parseInt(b) + Integer.parseInt(a);
			}
			else if (op.equals("-")){
				result = Integer.parseInt(a) - Integer.parseInt(b);
			}
			else if (op.equals("*")){
				result = Integer.parseInt(a) * Integer.parseInt(b);
			}
			else if (op.equals("/")){
				result = Integer.parseInt(a) / Integer.parseInt(b);
			}
			out.println("Resultat: " + result);
			out.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
