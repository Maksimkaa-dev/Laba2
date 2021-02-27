package Laba2;
import java.awt.Graphics;
import java.awt.Image;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {
		Image image;
        public void paintComponent (Graphics g) {
            
			try {
				image = new ImageIcon(new URL("http://xn--e1afhkfagivn.xn--p1ai/media/foto/logo.jpg")).getImage();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            g.drawImage(image, 3, 4, this);
        }
    }