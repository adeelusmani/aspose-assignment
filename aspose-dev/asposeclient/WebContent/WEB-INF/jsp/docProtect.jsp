<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<script>
function submitFunction() 
{
    var protectionTypeIndex=document.getElementById("protectionType").selectedIndex;
    var password=document.getElementById("password").value;
    var confirm=document.getElementById("confirm").value;
    var fileName=document.getElementById("fileName").value;
    if(protectionTypeIndex<=0)
    {
        alert("Please select valid protection type.");
        document.getElementById("protectionType").focus();
        return;
    }
    if(password=='')
    {
        alert("Please provide password");
        document.getElementById("password").focus();
        return;
    }
    if(password!=confirm)
    {
        alert("Password & Confirm password should match.");
        document.getElementById("password").focus();
        return;
    }
    if(fileName.trim()=='')
    {
        alert("Please provide name of protected document.");
        document.getElementById("fileName").focus();
        return;
    }
    //alert("fileName "+fileName);
    var frm= document.getElementById("data");
    frm.action = "http://localhost:8080/aspose/words/"+fileName+"/protection";
    frm.submit();
    //document.getElementById("demo").innerHTML = "The value of the action attribute was changed to form_action.asp.";
}
</script>
<meta charset="UTF-8">
<title>Spring MVC - DOC Protection Demo</title>
<meta name="description" content="Description of the content of this web page." />
</head>
<body>
 <form id="data" action="/" method="post" enctype="multipart/form-data">
	<div align="left">
	<a id="convertDocument" href="convert" >Convert Document</a>&nbsp;
	<a id="getProtection" href="getType" >Get Protection Type</a>&nbsp;
	</div>
	
    <div align="center">
        <h1>Spring MVC - DOC Protection Demo</h1>
        
      
             <table border="0">
                <tr>
                    <td>Pick file :</td>
                    <td><input type="file" name="fileUpload" size="50" /></td>
                </tr>
                   <tr>
		<td>Protection Type:</td>
		<td>
		<select id="protectionType" name="protectionType">
		    <option value="-1">--Please Select--</option>
  			<option value="ALLOW_ONLY_COMMENTS">ALLOW ONLY COMMENTS</option>
  			<option value="ALLOW_ONLY_FORM_FIELDS">ALLOW ONLY FORM FIELDS</option>
  			<option value="ALLOW_ONLY_REVISIONS">ALLOW ONLY REVISIONS</option>
  			<option value="READ_ONLY">READ ONLY</option>
  			<option value="NO_PROTECTION">NO PROTECTION</option>
  			
  			
		</select>
		</td>
	       </tr>
                <tr>
		            <td align="left">Password</td>
		            <td align="left"><input type="password" name="password" maxlength="50" id="password" />
		            
		            </td>
		        </tr>
		        <tr>
		            <td align="left">Confirm Password</td>
		            <td align="left"><input type="password" name="confirm" maxlength="50" id="confirm" />
		            
		            </td>
		        </tr>
		        <tr>
		        <td align="left">Protected File Name</td>
		        <td align="left"><input  name="fileName" maxlength="50" id="fileName" />
		        
		        </td>              		
        		
		        </tr>
                <tr>
                    <td colspan="2" align="center"><input type="button" onclick="submitFunction()" value="Protect File" /></td>
                </tr>
            </table>
</form>
</body>
</html>