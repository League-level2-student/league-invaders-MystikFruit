package League.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Rocketship extends GameObject {
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(X, y, Width, height);
        if (gotImage) {
        	g.drawImage(image, X, y, Width, height, null);
        } else {
        	g.setColor(Color.BLUE);
        	g.fillRect(X, y, Width, height);
        }
	}
public Rocketship(int X, int Y, int Width, int Height) {
	super(X, Y, Width, Height);
	if (needImage) {
	    loadImage ("rocket.png");
	}
}
public static BufferedImage image;
public static boolean needImage = true;
public static boolean gotImage = false;	

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

public void up() {
	if (y>=0) {
		y-=speed;
	}
}
public void down() {
	if (y<LeagueInvaders.HEIGHT-50) {
	y+=speed;
}
}
public void right() {
	if (X<LeagueInvaders.WIDTH-50) {
		X+=speed;
	}
}
public void left() {
	if (X>=0) {
	X-=speed;
}
}
public Projectile getProjectile() {
    return new Projectile(X+Width/2, y, 10, 10);
} 
}
