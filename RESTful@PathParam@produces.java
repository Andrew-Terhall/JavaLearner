/*
This annotation works with @GET, @POST, and @PUT. It lets the framework
know what type of representation to send back to the client.
The client sends an http request together with an accept http header that
maps directly to the Content-Type the method produces. So, if the value
of the header Accept is an application/xml then the method handling request
returns a stream of MIME type application/xml. This annotation can be used
in multiple methods in the same resource class.
*/

@Path("/users")
public classUserResource
{
  @GET
  @Produces("application/xml")
  public String getXML(String representation)
  {
    //Code goes here
  }

  @GET
  @Produces("application/json")
  public String getJSON(String representation)
  {
    //Code goes here
  }
}
