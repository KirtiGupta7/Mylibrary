function Submit(){

	var uname = document.getElementById("Name").value;
	var oname = document.getElementById("orgname").value;
	var eorg = document.getElementById("emailorg").value;
	var reorg = document.getElementById("remail").value;
	var pas = document.getElementById("pass").value;
	var rpas = document.getElementById("repass").value;
	var to = document.getElementById("typeorg").value;
	
	
	if(uname ==""){
		document.getElementById("Name").focus();
		document.getElementById("errorBox").innerHTML = "Enter Full Name";
		return false;	
	}
	if(oname ==""){
		document.getElementById("orgname").focus();
		document.getElementById("errorBox").innerHTML = "Enter Organization Name";
		return false;	
	}
	if(eorg ==""){
		document.getElementById("emailorg").focus();
		document.getElementById("errorBox").innerHTML = "Enter Email";
		return false;	
	}
	if(reorg ==""){
		document.getElementById("remail").focus();
		document.getElementById("errorBox").innerHTML = "Re-enter Email";
		return false;	
	}
	if(pas ==""){
		document.getElementById("pass").focus();
		document.getElementById("errorBox").innerHTML = "Enter Password";
		return false;	
	}
	if(rpas ==""){
		document.getElementById("repass").focus();
		document.getElementById("errorBox").innerHTML = "Re-Enter Password";
		return false;	
	}
	if(to =="***** Type Of Library *****"){
		document.getElementById("typeorg").focus();
		document.getElementById("errorBox").innerHTML = "Select An Organization";
		return false;	
	}
}
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
	if(bookname!=""&&authname!=""&&pubname!=""&&price!=""&&sl!="Select Book Section"){
		alert ( "Welcome User" );
		return true;
	}
	alert ( "xyz" );
	return false;
	
}