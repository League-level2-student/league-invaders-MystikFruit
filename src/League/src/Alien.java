package League.src;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
void update() {
	y+=speed;
}
void draw(Graphics g) {
	  g.setColor(Color.YELLOW);
      g.fillRect(X, y, Width, height);
}
public Alien(int X, int Y, int Width, int Height) {
	super(X, Y, Width, Height);
	speed = 1;
}
}
