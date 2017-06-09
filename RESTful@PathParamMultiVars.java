//This example shows the handling of multiple variables in the URI

@Path("/users/{gender}/{age}/{address}")
public class UsersResource
{
  @GET
  public String handleGet(@PathParam("gender") String gender,
  @PathParam("age") int age, @PathParam("address") String address)
  {
    //Code goes here
  }
  //Same for POST, PUT, and DELETE

}
