<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC - DOC Converter Demo</title>
<meta name="description" content="Description of the content of this web page." />
</head>
<body>
	<div align="left">
	<a id="protectDocument" href="protect" >Protect Document</a>&nbsp;
	<a id="getProtection" href="getType" >Get Protection Type</a>&nbsp;
	</div>
	
    <div align="center">
        <h1>Spring MVC - Document Converter Demo</h1>
        <form:form id="data" method="PUT" action="http://localhost:8080/aspose/words/convert" enctype="multipart/form-data">
      
            <table border="0">
                <tr>
                    <td>Pick file :</td>
                    <td><input type="file" id="fileUpload" name="fileUpload"  /></td>
                </tr>
               <tr>
		<td>Pick format</td>
		<td>
		<select id="cmbFormat" name="cmbFormat">
		    <option value="-1">--Please Select--</option>
  			<option value="DOCM">DOCM</option>
  			<option value="DOTX">DOTX</option>
  			<option value="DOTM">DOTM</option>
  			<option value="RTF">RTF</option>
  			<option value="WORD_ML">WORD_ML</option>
  			<option value="PDF">PDF</option>
  			<option value="XPS">XPS</option>
  			<option value="HTML">HTML</option>
  			<option value="MHTML">MHTML</option>
  			<option value="EPUB">EPUB</option>
  			<option value="PNG">PNG</option>
  			<option value="BMP">BMP</option>
  			<option value="EMF">EMF</option>
  			<option value="JPEG">JPEG</option>
		</select>
		</td>
	       </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Upload File" /></td>
                </tr>
            </table>
            
        </form:form>
    </div>
</body>
</html>