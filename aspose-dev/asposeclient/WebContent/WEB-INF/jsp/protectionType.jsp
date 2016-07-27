<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<script>
function submitFunction() 
{
    
    var fileName=document.getElementById("fileName").value;
    
    if(fileName.trim()=='')
    {
        alert("Please provide name of protected document.");
        document.getElementById("fileName").focus();
        return;
    }
    //alert("fileName "+fileName);
    var frm= document.getElementById("data");
    frm.action = "http://localhost:8080/aspose/words/"+fileName+"/protection";
    frm.method = "get";
    frm.submit();
    
}
</script>
<meta charset="UTF-8">
<title>Spring MVC - DOC Protection Demo</title>
<meta name="description" content="Description of the content of this web page." />
</head>
<body>
<form id="data" action="/" method="get" enctype="multipart/form-data">
	<div align="left">
	<a id="CconvertDocument" href="convert" >Convert Document</a>&nbsp;
	<a id="protectDocument" href="protect" >Protect Document</a>&nbsp;
	</div>
	
    <div align="center">
        <h1>Spring MVC - Document Converter Demo</h1>
        
      
            <table border="0">
               
                <tr>
		        <td align="left">Protected File Name</td>
		        <td align="left"><input  name="fileName" maxlength="50" id="fileName" />
		        
		        </td>              		
        		
		        </tr>
		
	   
                <tr>
                    <td colspan="2" align="center"><input type="button" onclick="submitFunction()" value="Get Protection" /></td>
                </tr>
            </table>
            
       
            
        
    </div>
</form>
</body>
</html>