package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class PlayerOne extends GameObjectB {
	boolean fist = false;
	boolean crouch = false;
	public boolean up;
	boolean up1;
	boolean down;
	boolean left;
	boolean right;
	boolean punch;
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
    	g.fillRect(X, Y, Width, Height);
    	g.setColor(Color.WHITE);
    	g.fillRect(X+5, Y+5, Width-10, Height-10);
    	g.setColor(Color.RED);
    	g.fillRect(X+5, Y+15, Width-10, 20);
    	if(fist==true) {
    		g.setColor(Color.BLACK);
        	g.fillRect(X+180, Y+60, 90, 50);
        	g.setColor(Color.WHITE);
        	g.fillRect(X+175, Y+65, 90, 40);
    	} else if (crouch==true) {
    		g.setColor(Color.BLACK);
        	g.fillRect(X+180, Y+35, 90, 50);
        	g.setColor(Color.WHITE);
        	g.fillRect(X+175, Y+40, 90, 40);
        	//g.fillRect(X+175, Y+35, 40, 40);
    	}
    	if(Height<200) {
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
		Y=415;
		
	}

	public void right() {
		if (X>=0) {
			X+=speed;
		}	
	}
	
public void punch(Graphics g) {
	

		
}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_C&&Height<200) {
			fist=true;
		}
		if (e.getKeyCode()==KeyEvent.VK_V) {
			crouch = true;
			System.out.println("met");
		}
	}
}

