import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.imageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RESTfulServletClient extends HttpServlet
{
  pubLic void doGet(HttpServletRequest req, HttpServletResponse res)
  {
    //Set mime-type
    res.setContentType("image/jpeg");
    BufferedReader in = null;

    try
    {
      //create image
      BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
      Graphics g = bufferedImage.getGraphics();

      //change color and create rectangle
      g.setColor(Color.gray);
      g.fillOval(0,0,200,200);

      //Connect to Twitter API
      URL twitter = new URL("http://twitter.com/statuses/public_timeline.xml");
      URLConnection tc = twitter.openConnection();
      in = new BufferedReader(new InputStreamReader(tc.getInputStream()));
      String line;

      //Write each line in the rectangle.
      //Note that we are likely to have more lines than in the rectangle, but it's ok.
      int lineCount = 1;
      int vOffset = 20;
      g.setColor(Color.white);
      while((line = in.readLine()) != null)
      {
        g.drawString(line, 20, lineCount * yOffset);
        lineCount ++
      }
      //Free graphic resources
      g.dispose();
      //Close in
      in.close();
      //Write the image as a jpeg
      imageIO.write(bufferedImage, "jpg", res.getOutputStream());
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
