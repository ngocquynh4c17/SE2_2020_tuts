package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String username = "quynh1611";
		String pass = req.getParameter("pass");
		String password ="123456";
		if(name.isEmpty() || pass.isEmpty() ) {
			RequestDispatcher re = req.getRequestDispatcher("LoginForm.jsp");
			re.include(req, res);
		}
		else if ((name.equals(username)) && (pass.equals(password))) {
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.println("<html>\n" +
		             "<body>" + 
		             "<h1> Successful!</h1>\n" +
		             "<p> This's just a demo Login Page!!! No more function!!! Thanks U!!! </p> \n" +
		             "</body>" +
		             "</html>"  );
			pw.close();
		}
		else {
			res.setContentType("text/html");
			PrintWriter pw = res.getWriter();
			pw.println("<html>\n" +
		             "<body>" + 
		             "<h1> Invalid User!</h1>\n" +
		             "<p> You have entered a wrong username and/or password!!! </p> \n" +
		             "</body>" +
		             "</html>"  );
			pw.close();
		}
	}
}
