<%@ page language="C#" autoeventwireup="true" inherits="web_convert, App_Web_g3iu1hu-" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Aspose Rest Client</title>
</head>
<body>
    <form id="form1" action="<%=ClientProperties.getRestURL()%>convert" method="post" enctype="multipart/form-data" >
    <input type="hidden" id="_method" name="_method"  value="PUT"  />
    
    <div >
    Welcome To Aspose rest client!
    <br />
    <asp:HyperLink ID="HyperLink1" runat="Server" Text="Get Protection" NavigateUrl="~/protectiontype.aspx" />&nbsp;
    <asp:HyperLink ID="HyperLink2" runat="Server" Text="Protect Document" NavigateUrl="~/protectDocument.aspx" />
                    
    
    
    </div>
    <div align="center">
    <table border="0" >
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
                    <td colspan="2" align="center"><input type="submit" value="Convert Document" /></td>
                </tr>
            </table>
         </div>
    </form>
</body>
</html>
