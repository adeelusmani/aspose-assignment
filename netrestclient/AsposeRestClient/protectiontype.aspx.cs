using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;
using System.Net;
using System.Xml.Serialization;
using System.Runtime.Serialization.Json;
using System.IO;
using System.Drawing;

public partial class web_protectionType : System.Web.UI.Page
{
    //private const string BASE_URL = "http://localhost:8080/aspose/words/";

    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        
        try
        {
            
            String url = ClientProperties.getRestURL();
            
            WebRequest request = WebRequest.Create(url + txtType.Text + "/protection");
           
            request.Method = "GET";
            WebResponse response = request.GetResponse();
            
            Stream dataStream = response.GetResponseStream();
            // Open the stream using a StreamReader for easy access.
            StreamReader reader = new StreamReader(dataStream);
            // Read the content.
            string responseFromServer = reader.ReadToEnd();
            // Display the content.
            //Console.WriteLine(responseFromServer);
            
            String[] s = responseFromServer.Split(':');

            Label2.Text = s[s.Length - 1].Replace("}","");//responseFromServer.Split(':');
            Label2.ForeColor = System.Drawing.ColorTranslator.FromHtml("#006600");
            
            // Clean up the streams.
            reader.Close();
            dataStream.Close();
            response.Close();
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
            Label2.Text = "No such document exists on server. ";
            Label2.ForeColor = Color.Red;
            //return null;
        }
        //Label1.Text = "END";

    }
}
