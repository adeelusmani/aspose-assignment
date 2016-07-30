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
using System.IO;
using System.Drawing;
using System.Collections.Generic;

public partial class protectDocument : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        try
        {
            postData();
            //String url = ClientProperties.getRestURL();

            //WebRequest request = WebRequest.Create(url + txtType.Text + "/protection");
            //request.ContentType = "multipart/form-data; boundary=frontier";

            //request.Method = "POST";
            ////form1.Action = "";
                
            //WebResponse response = request.GetResponse();

            //Stream dataStream = response.GetResponseStream();
            //// Open the stream using a StreamReader for easy access.
            //StreamReader reader = new StreamReader(dataStream);
            //// Read the content.
            //string responseFromServer = reader.ReadToEnd();
            //// Display the content.
            ////Console.WriteLine(responseFromServer);

            ////String[] s = responseFromServer.Split(':');

            ////Label2.Text = s[s.Length - 1].Replace("}", "");//responseFromServer.Split(':');
            ////Label2.ForeColor = System.Drawing.ColorTranslator.FromHtml("#006600");

            //// Clean up the streams.
            //reader.Close();
            //dataStream.Close();
            //response.Close();
             
        }
        catch (Exception ex)
        {
            Console.WriteLine(ex.Message);
            Label2.Text = "No such document exists on server. ";
            Label2.ForeColor = Color.Red;
            //return null;
        }
    }

    private void postData()
    {
        //FileStream fs = new FileStream(fileUpload.FileContent, FileMode.Open, FileAccess.Read);
        //byte[] data = fileUpload.FileBytes;// new byte[fs.Length];
        ////fs.Read(data, 0, data.Length);
        ////fs.Close();

        //// Generate post objects
        //Dictionary<string, object> postParameters = new Dictionary<string, object>();
        //postParameters.Add("filename", fileUpload.FileName);
        ////postParameters.Add("fileformat", "doc");
        //postParameters.Add("file", new FormUpload.FileParameter(data,fileUpload.FileName, "multipart/form-data"));
        ////postParameters.Add("protectionType", protectionType.SelectedValue);
        ////postParameters.Add("password", password.Text);

        //// Create request and receive response
        //string postURL = ClientProperties.getRestURL()+ txtType.Text + "/protection";
        //string userAgent = "Someone";
        //HttpWebResponse webResponse = FormUpload.MultipartFormDataPost(postURL, userAgent, postParameters,"POST");

        //// Process response
        //StreamReader responseReader = new StreamReader(webResponse.GetResponseStream());
        //string fullResponse = responseReader.ReadToEnd();
        //webResponse.Close();
        //Response.Write(fullResponse);
    }
}
