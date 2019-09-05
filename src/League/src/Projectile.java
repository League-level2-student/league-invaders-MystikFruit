package League.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Projectile extends GameObject {

	public Projectile(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		speed = 10;
		if (needImage) {
		    loadImage ("bullet.png");
		}
	}
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	
	void update() {
		y-=speed;
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
	
	void draw(Graphics g) {
		  g.setColor(Color.RED);
	      g.fillRect(X, y, Width, height);
	      if (gotImage) {
	    		g.drawImage(image, X, y, Width, height, null);
	    	} else {
	    		g.setColor(Color.BLUE);
	    		g.fillRect(X, y, Width, height);
	    	}
	      
	}
}
