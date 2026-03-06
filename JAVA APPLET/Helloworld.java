import java.applet.Applet;
import java.awt.Graphics;

//import javax.swing.JPanel;

public class Helloworld extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello World!", 150, 150);
    }
}