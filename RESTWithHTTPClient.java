import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

public class RESTWithHTTPClient
{
  public static void main(String[] args)
  {
    HttpClient client = new HttpClient();
    GetMethod method = new GetMethod("http://twitter.com/statuses/public_timeline.xml");

    try
    {
      int statusCode = client.executeMethod(method);
      if(statusCode == HttpStaus.SC_OK)
      {
        system.out.println(new String(method.getResponseBody()));
      }
    }
    catch(HttpException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      method.releaseConnection();
    }
  }
}
