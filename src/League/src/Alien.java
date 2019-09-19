package League.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Alien extends GameObject{
void update() {
	y+=speed;
}
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	

void draw(Graphics g) {
	  g.setColor(Color.YELLOW);
      g.fillRect(X, y, Width, height);
      if (gotImage) {
    		g.drawImage(image, X, y, Width, height, null);
    	} else {
    		g.setColor(Color.BLUE);
    		g.fillRect(X, y, Width, height);
    	}
}

void loadImage(String imageFile) {
    if (needImage) {
        try {
            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
	    gotImage = true;
        } catch (Exception e) {
            
        }
        needImage = false;
    }
}

public Alien(int X, int Y, int Width, int Height) {
	super(X, Y, Width, Height);
	speed = 1;
	if (needImage) {
	    loadImage ("alien.png");
	}
}
}

