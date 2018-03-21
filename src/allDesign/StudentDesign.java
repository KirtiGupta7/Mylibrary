package allDesign;

import java.io.PrintWriter;

public class StudentDesign {
	
	public static void studentDetail(PrintWriter out){
		
		out.println("<html><link href=CSS/stud.css rel=stylesheet");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=stm behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Manage Student Detail</p>");
		out.println("</marquee></center><br>");
		out.println("<div id=stpnl>"
				+ "<center>"
				+ "<table>"
				+ "<tr>"
				+ "<td><a href=#><p class=stbtn>Add New Student</p></a></td>"
				+ "<td><a href=#><p class=stbtn>Remove Student</p></a></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td><a href=#><p class=stbtn>Detail of Student</p></a></td>"
				+ "<td><a href=#><p class=stbtn>All Students</p></a></td>"
				+ "</tr>"
				+ "</table>"
				+ "</center></div>");
		Allcomponent.Footer(out);

	}
}
