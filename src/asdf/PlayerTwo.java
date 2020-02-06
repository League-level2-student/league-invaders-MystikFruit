package asdf;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerTwo extends GameObjectB2 {
	boolean fist = false;
	public boolean up;
	void draw(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(X2, Y2, Width2, Height2);
	g.setColor(Color.WHITE);
	g.fillRect(X2+5, Y2+5, Width2-10, Height2-10);
	g.setColor(Color.BLUE);
	g.fillRect(X2+5, Y2+15, Width2-10, 20);
}
	public PlayerTwo(int X2, int Y2, int Height2, int Width2) {
		super(X2, Y2, Height2, Width2);
		// TODO Auto-generated constructor stub
	}

}
