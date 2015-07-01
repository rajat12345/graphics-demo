import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by cerebro on 01/07/15.
 */
public class GraphicsDemo extends Canvas {
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.blue);

        g.fillArc(0, 0, 150, 150, 0, 270);

        //image from url
        try {
            URL imageUrl = new URL("http://actionflickchick.com/superaction/wp-content/uploads/2015/05/rajinikanth.jpg");
            BufferedImage image = ImageIO.read(imageUrl);
            g.drawImage(image,10,10,100,100,null);
        } catch (MalformedURLException e) {
            System.out.println("Not a valid url!");
            return;
        } catch (IOException e) {
            System.out.println("Can't read the url");
        }

        //image from file
        File file = new File("images/shark.jpeg");
        try {
            BufferedImage imageFromFile = ImageIO.read(file);
            g.drawImage(imageFromFile,10,10,50,50,null);
        } catch (IOException e) {
            System.out.println("can't read image");
        }
    }
}
