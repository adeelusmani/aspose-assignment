<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
function linkClickAction2(idVal)
{
	
	//alert("AA");
	//alert("A "+<%=request.getContextPath()%>);
	var obj=document.getElementById(idVal);
	//alert("B");
	if(obj!=null)
	{
		//alert("C");
		obj.click();
		//alert("D");
	}
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aspose Service</title>
</head>
<body >
<p>Welcome to aspose service</p>
<form id="loginFrm" >
<%
//System.out.println("path "+request.getContextPath());

%>
<a id="loginLnk" href="index" style="display:none"></a>
</form>
</body>
</html>