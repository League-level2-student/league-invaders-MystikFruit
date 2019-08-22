package League.src;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject {
	void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(X, y, Width, height);
	}
public Rocketship(int X, int Y, int Width, int Height) {
	super(X, Y, Width, Height);
	
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
}
