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
}
