package allDesign;

import java.io.PrintWriter;

public class BookReturnDesign {
	public static void bookret(PrintWriter out)
	{
		out.println("<html><link href=CSS/bkrt.css rel=stylesheet");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=brtm behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Return Your Book</p>");
		out.println("</marquee></center><br>");
		out.println("<center><div id=bkdserc>"
				+ "<form action=retreq method=post>"
				+ "<input class=logform type=text name=stdid placeholder=Enter&nbsp;Book&nbsp;ID>"
				+ "<input id=signin type=submit value=Search>"
				+ "</form>"
				+ "</div></center>");
	}
	public static void bookdetail(PrintWriter out)
	{
		String bookid="xyz";
		out.println("<center><div id=bkdserc>"
				+ "<font color=#8011CC size=5><p>Book Has Been Contain By Xyz</p><br></font>"
				+ "<form action=return.jsp>"
				+ "<input type=hidden value="+bookid+">"
				+ "<input id=signin type=submit value=Return>"
				+ "</form></div></center>");
	}
}
