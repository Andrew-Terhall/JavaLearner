/*The application code resides in this structure
' /RestfulSwingClient/
    /RestfulSwingClientApp.java
    /RestfulSwingClientView.java
    /resources/
      /RestfulSwingClientApp.properties
      /RestfulSwingClientView.properties
*/


class MethodFactory
{
  public MethodFactory()
  {
    super();
  }

  public HttpMethod getMethod(String methodType, String URI)
  throws exception{
    HttpMethod method = null;
    if (methodType.equals("GET"))
    {
      method = new GetMethod(URI);
    }
    else if (methodType.equals("POST"))
    {
      method = new PostMethod(URI);
    }
    else if (methodType.equals("PUT"))
    {
      method = new PutMethod(URI);
    }
    else if (methodType.equals("DELETE"))
    {
      method = new DeleteMethod(URI);
    }

    if (method != null)
    {
      //if POST or PUT, we need "Content-Type"
      if (methodType.equals("POST") || methodType.equals("PUT"))
      {
        ((EntityEnclosingMethod)
        method).setRequestEntity(new
        StringRequestEntity(jTextAreaReqBody.getText().trim(),
        jTextFieldReqContentType.getText().trim(), "UTF-8"));
      }
      return method;
    }
    return null;
  }
}
