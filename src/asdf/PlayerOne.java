package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PlayerOne extends GameObjectB {
	boolean fist = false;
	boolean lfist = false;
	boolean crouch = false;
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
        	g.fillRect(X+130, Y+80, 90, 50);
        	g.setColor(Color.WHITE);
        	g.fillRect(X+125, Y+85, 90, 40);
    	} else if (crouch==true) {
    		g.setColor(Color.BLACK);
        	g.fillRect(X+130, Y+35, 90, 50);
        	g.setColor(Color.WHITE);
        	g.fillRect(X+125, Y+40, 90, 40);
        	g.fillRect(X+125, Y+35, 40, 40);
        	
        	
    	}
    	if(Height<170) {
    	fist = false;
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
		if (e.getKeyCode()==KeyEvent.VK_C&&Height<170) {
			fist=true;
		}
		if (e.getKeyCode()==KeyEvent.VK_V) {
			crouch = true;
			System.out.println("met");
		}
	}
}

