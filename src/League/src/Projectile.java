package League.src;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject {

	public Projectile(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		speed = 10;
	}
	void update() {
		y-=speed;
	}
	
	void draw(Graphics g) {
		  g.setColor(Color.RED);
	      g.fillRect(X, y, Width, height);
	}
}
