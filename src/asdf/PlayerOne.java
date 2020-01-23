package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PlayerOne extends GameObjectB {
	boolean fist = false;
	public boolean up;
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
    	g.fillRect(X, Y, Width, Height);
    	g.setColor(Color.WHITE);
    	g.fillRect(X+5, Y+5, Width-10, Height-10);
    	g.setColor(Color.RED);
    	g.fillRect(X+5, Y+15, Width-10, 20);
    	//punch(g);
    	if(fist==true) {
    		g.setColor(Color.BLACK);
    		System.out.println(42);
        	g.fillRect(X+130, Y+80, 100, 60);
        	g.setColor(Color.WHITE);
        	g.fillRect(X+125, Y+85, 100, 50);
    	}
    	
		}
	
	public void move() {
		
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
	
public void punch(Graphics g) {
	

		
}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_C) {
			fist=true;
		}
	}
}

