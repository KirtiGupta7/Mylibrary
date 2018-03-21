package allDesign;

import java.io.PrintWriter;

public class Welcome {
	public static void welcome(PrintWriter out) {

		out.println("<html><link href=CSS/prof.css rel=stylesheet");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=wlcm behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Welcome To Your Library</p>");
		out.println("</marquee></center><br> " + "<div id=imgtbl><center>" + "<tr>"
				+ "<td><img src=proimage/1.JPG width=24% height=150></td> &nbsp;"
				+ "<td><img src=proimage/2.jpg width=24% height=150></td> &nbsp;"
				+ "<td><img src=proimage/3.jpg width=24% height=150></td> &nbsp;"
				+ "<td><img src=proimage/4.jpg width=24% height=150></td> &nbsp;" + "</tr></center></div>"

				+ "<br><br><div id=cn>"

				+ "<div id=lc>" + "<div id=si>" + "<img  src=proimage/4.jpg width=150>" + "</div> <div id=t1>"
				+ "<h4>Manage Student Detail</h4><br>"
				+ "<p><h5>Student data are the main element for any educational institute. The eduWare student management "
				+ "software provides better bulk data storage of student with easiness. The student information module helps"
				+ "</div></div>"

				+ "<div id=rc><div id=bi>" + "<img  src=images/books.jpg width=150>" + "</div>" + "<div id=t2>"
				+ "<h4>Manage Books Detail</h4><br>"
				+ "<p><h5>You Can Easily manupulate book data and can use all their function using our web site </h5></p>"
				+ "</div></div></div><br>");
		Allcomponent.Footer(out);
	}
}
