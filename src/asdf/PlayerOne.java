package asdf;

import java.awt.Color;
import java.awt.Graphics;

public class PlayerOne extends GameObjectB {
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
    	g.fillRect(X, Y, Width, Height);
    	g.setColor(Color.WHITE);
    	g.fillRect(X+5, Y+5, Width-10, Height-10);
		}
		
	public PlayerOne(int X, int Y, int Width, int Height) {
		super(X, Y, Width, Height);
		// TODO Auto-generated constructor stub
	}

	

	public void left() {
		if (X>=0) {
			X-=speed;
		}	
	}

	public void down() {
		// TODO Auto-generated method stub
		
	}

	public void right() {
		// TODO Auto-generated method stub
		
	}

	public void jump() {
		// TODO Auto-generated method stub
		
	}

}
