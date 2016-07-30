<%@ page language="C#" autoeventwireup="true" inherits="web_protectionType, App_Web_g3iu1hu-" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
 <head id="Head1" runat="server">
 <title>Untitled Page</title>
 </head>
 <body>
 <form id="form1" runat="server">
 <div align="left">
	<asp:HyperLink ID="HyperLink1" runat="Server" Text="Protect Document" NavigateUrl="~/protectDocument.aspx" />&nbsp;
    <asp:HyperLink ID="HyperLink2" runat="Server" Text="Convert Document" NavigateUrl="~/convert.aspx" />
	</div>
 <asp:ScriptManager EnablePartialRendering="true"
 ID="ScriptManager1" runat="server"></asp:ScriptManager>
 <div>
 <asp:UpdatePanel ID="UpdatePanel1" runat="server">
 <ContentTemplate>
 <asp:Label ID="Label1" runat="server"
 Text="File Name"></asp:Label>
     <asp:TextBox ID="txtType" runat="server"></asp:TextBox>
 <asp:Button ID="Button1" runat="server"
 Text="Submit" OnClick="Button1_Click" />
     <asp:Label ID="Label2" runat="server" ForeColor="#006600" ></asp:Label>
 </ContentTemplate>
 </asp:UpdatePanel>
 </div>
 </form>
</body>
</html>
