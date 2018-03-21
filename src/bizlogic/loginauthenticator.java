package bizlogic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import allDesign.LoginFail;



public class loginauthenticator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public loginauthenticator() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		if(true){
			RequestDispatcher imbibe = request.getRequestDispatcher("/profile");
			imbibe.forward(request, response);
		}
		else{
			LoginFail.userpassincorrect(out);
		}
			
		
		//RequestDispatcher imbibe = request.getRequestDispatcher("login.html");
		//imbibe.include(request, response);
	}

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		service(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		service(request, response);
	}

}
