package allDesign;

import java.io.PrintWriter;

public class BookDesign {

	public static void booksprofile(PrintWriter out){
		
		out.println("<html><link href=CSS/books.css rel=stylesheet");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=bkm behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Manage your Books Detail</p>");
		out.println("</marquee></center><br>");
		out.println("<div id=bkpnl>"
				+ "<center>"
				+ "<table>"
				+ "<tr>"
				+ "<td><a href=newbook><p class=bkbtn>Add New Book</p></a></td>"
				+ "<td><a href=#><p class=bkbtn>Remove Book</p></a></td>"
				+ "</tr>"
				+ "<tr>"
				+ "<td><a href=#><p class=bkbtn>Detail of Book</p></a></td>"
				+ "<td><a href=#><p class=bkbtn>All Books</p></a></td>"
				+ "</tr>"
				+ "</table>"
				+ "</center></div>");
		
		Allcomponent.Footer(out);
	}
}
