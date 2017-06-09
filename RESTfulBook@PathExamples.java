@Path("/users/{username}")
public class UserResource
{
  @GET
  public String handleGET(@PathParam("username")String username)
  {
    //We can use username however we like
  }

  @POST
  public String handlePOST(@PathParam("username")String username)
  {
    //Code goes here
  }

  @PUT
  public String handlePut(@PathParam("username")String username)
  {

  }

  @DELETE
  public String handleDelete (@PathParam("username")String username)
  {

  }

}
