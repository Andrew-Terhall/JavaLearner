//In this example we are telling the framework that the updateUser()
//accepts an input stream of MIME type application/xml, which is
//stored in the variable representation.This forces a client that
//connects to the web service through the URI to send an HTTP PUT
//method request containing the HTTP header Content-Type of
//application/xm;.

@Path("/users")
public class UserResource
{
  @PUT
  @Consumes("application/xml")
  public void updateUser(String representation)
  {

  }

  //This method handles JSON data being sent to it because the
  //resource can have different payloads.
  @PUT
  @Consumes("application/json")
  public void updateJSON(String representation)
  {

  }
}
