<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

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

<title>OPAS</title>
</head>
<body onload="linkClickAction2('convertLnk');">
<form id="loginFrm" >
<%
//System.out.println("path "+request.getContextPath());

%>
<a id="convertLnk" href="convert" style="display:none"></a>
</form>
</body>
</html>