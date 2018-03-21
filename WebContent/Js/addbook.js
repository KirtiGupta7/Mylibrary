function addbook(){
	var bookname = document.getElementById("bname").value;
	var authname = document.getElementById("aname").value;
	var pubname = document.getElementById("pname").value;
	var price = document.getElementById("price").value;
	var sl = document.getElementById("section").value;
	
	if(bookname=="")
	{
		document.getElementById("bname").focus();
		document.getElementById("errorbox").innerHTML = "Enter Book Name";
		return false;
	}
	if(authname=="")
	{
		document.getElementById("aname").focus();
		document.getElementById("errorbox").innerHTML = "Enter Auther Name";
		return false;
	}
	if(pubname=="")
	{
		document.getElementById("pname").focus();
		document.getElementById("errorbox").innerHTML = "Enter Publisher Name";
		return false;
	}
	if(price=="")
	{
		document.getElementById("price").focus();
		document.getElementById("errorbox").innerHTML = "Enter Price";
		return false;
	}
	if(sl=="Select Book Section")
	{
		document.getElementById("section").focus();
		document.getElementById("errorbox").innerHTML = "Select Section";
		return false;
	}
	alert ( "Welcome User" );
	return true;
}