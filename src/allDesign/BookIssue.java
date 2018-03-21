package allDesign;

import java.io.PrintWriter;

public class BookIssue {
	public static void bookIssue(PrintWriter out)
	{
		out.println("<html><link href=CSS/bkisue.css rel=stylesheet");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=bism behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Issue A Book</p>");
		out.println("</marquee></center><br>");
		out.println("<center><div id=stdserc>"
				+ "<form action=bkis method=post>"
				+ "<input class=logform type=text name=stdid placeholder=Enter&nbsp;Student&nbsp;ID>"
				+ "<input id=signin type=submit value=Search>"
				+ "</form>"
				+ "</div></center>");
		
	}
}
