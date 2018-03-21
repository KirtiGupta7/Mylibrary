<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection con = (Connection)request.getAttribute("keycon");
		String bname,aname,pname,price,section;
		
		bname=request.getParameter("bookname");
		aname  =request.getParameter("authname");
		pname =request.getParameter("publishername");
		price=request.getParameter("bkprice");
		section=request.getParameter("section");
		
		String msg = "insert into book(section,bookname,author,price,publisher) values(?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(msg);
		ps.setString(1,section);
		ps.setString(2,bname);
		ps.setString(3,aname);
		ps.setString(4,price);
		ps.setString(5,pname);
		int s=ps.executeUpdate();
		
		
		if(s==1)
		{
			ResultSet virtbl;
			msg = "select * from book";
			Statement stmt = (Statement) con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			virtbl= stmt.executeQuery(msg);
			virtbl.last();
			String bookid = virtbl.getString("bookid");
			out.println("the book has Entered "+bookid);
		}
		else
		{
			out.println("Something goes Wrong");
		}
	%>
</body>
</html>