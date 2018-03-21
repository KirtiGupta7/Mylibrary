package allDesign;

import java.io.PrintWriter;

public class Allcomponent {

	public static void Header(PrintWriter out) {
		out.println("<head><title>login</title></head>" + "<link href=CSS/StyleSheet.css rel=stylesheet>"
				+ "<link href=CSS/login.css rel=stylesheet>" + "<body>" + "<div id=header>" + "<div id=logo>"
				+ "<a href=home.html>MY LIBRARIAN</a>" + "</div>" + "<div id=login>"
				+ "<a class=link href=register.html>Register</a>" + "</div>" + "<div id= nav>" + "<ul>"
				+ "<a  href=home.html><li id=navhome>Home</li></a>" + "<a href=services.html><li>Services</li></a>"
				+ "<a href=partners.html><li>Partners</li></a>" + "<a href=aboutus.html><li>About Us</li></a>"
				+ "<a  href=contactus.html><li id=navcontactus>Contact Us</li></a>" + "</ul>" + "</div>" + "</div>"
				+ "<br>"+"<div id=container>");
	}

	public static void Footer(PrintWriter out) {
		out.println("</div><br><div id=footer1>" + "<table>" + "<tr>" + "<td class=footl><a href=home.html>Home</a></td>"
				+ "<td class=footl><a href=services.html>Services</a></td>"
				+ "<td class=footl><a href=partners.html>Partners</a></td>"
				+ "<td class=footl><a href=aboutus.html>About Us</a></td>"
				+ "<td id=cs><a href=contactus.html>Contact Us</a></td>" + "</tr>" + "</table>"
				+ "<center><hr id=bottomhr width=70% color=#ffffff></center>" + "<font size=-1 color=#ffffff>"
				+ "<center>Copyright &copy; 2017 My Librarian. All Right Reserved</center>" + "</font>" + "</div>"
				+ "</body>" + "</html>");
	}

	public static void HeaderProfile(PrintWriter out) {
		out.println("<html><head><title>login</title></head>" + "<link href=CSS/StyleSheet.css rel=stylesheet>"
				+ "<link href=CSS/login.css rel=stylesheet>" + "<body>" + "<div id=header>" + "<div id=logo>"
				+ "<a href=home.html>MY LIBRARIAN</a>" + "</div>" + "<div id=login>"
				+ "<a class=link href=#>Logout</a>" + "</div>"
				+ "<div id=nav>"
				+ "<ul>"
				+ "<a href=profile><li id=navhome>Library</li></a>"
				+ "<a href=books><li>Books</li></a>"
				+ "<a href=StudentDetail><li>Students</li></a>"
				+ "<a href=BookIssue><li>Book Issue</li></a>"
				+ "<a href=BookReturn><li id=navcontactus>Book Return</li></a>"
				+ "</ul>"
				+ "</div> </div>"+"<div=container>");
	}
}
