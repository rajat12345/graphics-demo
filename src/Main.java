import javax.swing.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String args[]) {
        JFrame window = new JFrame("My graphics demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsDemo myCanvas = new GraphicsDemo();

        window.setSize(500,500);
        window.add(myCanvas);

        window.setVisible(true);




    }
}
