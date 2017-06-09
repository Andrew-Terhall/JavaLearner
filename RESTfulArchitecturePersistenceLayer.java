/*
Presistence Layer CRUD function table list with implementation.
*/

//Create: Opens a db connection and stores a string builder Object
//If the file data doesn't exist, the engine creates it.
  ObjectContainer db = Db40.openFile("/tmp/db.data");
  db.store(new StringBuilder("REST"));
  db.close();

//Read: This retrieves the object we stored above.
  ObjectContainer db = Db40.openFile("/tmp/db.data");
  ObjectSet<MessageVO> result = db.queryByExample(new StringBuilder("REST"));
  db.close();

//Delete: To delete a record we have to retrieve it and then delete it.
  ObjectContainer db = Db4o.openFile("/tmp/db.data");
  ObjectSet<MessageVO> result = db.queryByExample(String("REST"));
  if (result.hasNext())
  {
    StringBuilder tmpString = result.next();
  }
  db.delete(tmpString);
  db.close();

//Update:To update, we retrieve a record, update it, and then we store it
  ObjectContainer db = Db4o.openFile("/tmp/db.data");
  ObjectSet<MessageVO> result = db.queryByExample(String("REST"));
  if (result.hasNext())
  {
    StringBuilder tmpString = result.next();
  }
  tmpString.append("ful Java");
  db.store(tmpString);
  db.close();
