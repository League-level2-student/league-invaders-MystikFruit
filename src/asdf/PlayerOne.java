package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PlayerOne extends GameObjectB {
	boolean fist;
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
    	g.fillRect(X, Y, Width, Height);
    	g.setColor(Color.WHITE);
    	g.fillRect(X+5, Y+5, Width-10, Height-10);
    	if(fist==true) {
    	g.setColor(Color.BLACK);
    	g.fillRect(X, Y, Width, Height);
    	}
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
		Height=85;
		Y=385;
		
	}

	public void right() {
		if (X>=0) {
			X+=speed;
		}	
	}
	
	//public void punch() {
//fist=true;

		
//}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_C) {
			fist=true;
			System.out.println(123);
		}
	}
}

