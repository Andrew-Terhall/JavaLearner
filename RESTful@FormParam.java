/*
This annotation lets us read the values o fname/ value pairs
passed in as part of a POST or PUT request. For example,
say we have an HTML form containing the elements name,
 age and address as follows in this code example.
*/

/*HTML FORM Code
  <form action = "/users" method = "POST">
  Name: <input type = "text" name - "name">
  Age: <input type = "text" name = "age">
  Address: <input type = "text" name = "address">
  </form>
*/
//@FormParam annotation Code

@Path("/users")
public class UserResource
{
  @POST
  @Consumes("application/x-www-form-urlencoded")
  public coid addUser(@FormParam("name") String name,
  @FormParam("age") String age, @FormParam("address") String address)
  {
    //Put code here :)
  }
}
/*
Now we have access to the form data as it is passed to our URI
giving the name value set defined in the form element. The request
is handled by the framework we have access to all the values
we defined in the addUser() method just like the @PathParam annotation. 
*/
