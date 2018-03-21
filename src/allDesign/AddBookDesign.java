package allDesign;

import java.io.PrintWriter;

public class AddBookDesign {
	public static void addbook(PrintWriter out)
	{
		out.println("<html><link href=CSS/newbook.css rel=stylesheet>"
				+ "<script type=text/javascript src=Js/reg.js></script>");
		Allcomponent.HeaderProfile(out);
		out.println("<br><center><marquee id=nbk behavior=alternate SCROLLAMOUNT=7>");
		out.println("<p>Add New Book</p>");
		out.println("</marquee></center><br>");
		
		out.println("<div id=newbkform>"
				+ "<form action=newbook.jsp method=get>"
				+ "<div id=errorbox></div>"
				+ "<input id=bname type=text name=bookname placeholder=Enter&nbsp;Book&nbsp;Name>"
				+ "<input id=aname type=text name=authname placeholder=Enter&nbsp;Author&nbsp;Name>"
				+ "<input id=pname type=text name=publishername placeholder=Enter&nbsp;Publisher&nbsp;Name>"
				+ "<input id=price type=text name=bkprice placeholder=Enter&nbsp;Book&nbsp;Price><br>"
				+ "<center><select id=section name=section>"
				+ "<option><center>Select Book Section</center></option>"
				+ "<option>CSE</option>"
				+ "<option>IT</option>"
				+ "<option>ECE</option>"
				+ "<option>MCE</option>"
				+ "<option>EEE</option>"
				+ "</select></center>"
				+ "<center><input id=addbkbtn type=submit onClick=addbook(); value=ADD NEW BOOK>"
				+ "</center></form></div>");
		
		
		
		Allcomponent.Footer(out);

	}

}
