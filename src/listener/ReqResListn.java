package listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ReqResListn implements ServletRequestListener {
	
	String Drivername,url,user,pass;
	Connection con;

    public ReqResListn() {
    }

    public void requestDestroyed(ServletRequestEvent arg0)  { 
    	
    }

    public void requestInitialized(ServletRequestEvent arg0)  { 
    	
    	ServletContext conobj = arg0.getServletContext();
    	
    	Drivername = conobj.getInitParameter("keyDriverName");
    	url = conobj.getInitParameter("keyDriverUrl");
    	user = conobj.getInitParameter("keyUser");
    	pass = conobj.getInitParameter("keyPass");
    	
    	
    	try {
			Class.forName(Drivername);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			con = DriverManager.getConnection(url,user,pass);
			
			ServletRequest brocastobj = arg0.getServletRequest();
			brocastobj.setAttribute("keycon", con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
	
}
