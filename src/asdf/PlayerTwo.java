package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class PlayerTwo extends GameObjectB2 {
	boolean fist2 = false;
	boolean crouch2 = false;
	public boolean up;
	void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(X2, Y2, Width2, Height2);
		g.setColor(Color.WHITE);
		g.fillRect(X2+5, Y2+5, Width2-10, Height2-10);
		g.setColor(Color.BLUE);
		g.fillRect(X2+5, Y2+15, Width2-10, 20);
		if(fist2==true) {
			g.setColor(Color.BLACK);
			g.fillRect(X2-50, Y2+80, 90, 50);
			g.setColor(Color.WHITE);
			g.fillRect(X2-45, Y2+85, 90, 40);
		} else if (crouch2==true) {
			g.setColor(Color.BLACK);
			g.fillRect(X2+130, Y2+35, 90, 50);
			g.setColor(Color.WHITE);
			g.fillRect(X2+125, Y2+40, 90, 40);
			g.fillRect(X2+125, Y2+35, 40, 40);  	
		}
		if(Height2<200) {
		fist2 = false;
		}
	}
	
	public void move() {
		
	}
	
	public PlayerTwo(int X2, int Y2, int Height2, int Width2) {
		super(X2, Y2, Height2, Width2);
		// TODO Auto-generated constructor stub
	}
	
	
	public void left() {
		if (X2>=0) {
			X2-=speed;	
		}
	}
	
	public void right() {
		if (X2>=0) {
			X2+=speed;
		}	
	}
	public void down() {
		Height2=85;
		Y2=415;
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_NUMPAD2&&Height2<200) {
			fist2=true;
			System.out.println(123);
		}
		if (e.getKeyCode()==KeyEvent.VK_V) {
			crouch2 = true;
			System.out.println("met");
		}
	}
}
