package asdf;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	public GamePanel() {

		final int MENU = 0;
		int currentState = MENU;
		Timer frameDraw;
	    frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	    }
	Font Start = new Font("Arial", Font.PLAIN, 24);
	void drawMenu(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(Start);	
		g.setColor(Color.RED);			
		g.drawString("Press ENTER to start", 300, 450);
	}
	void drawGame() {
		
	}
	void drawEnd() {
		
	}
	void updateMenu() {
		
	}
	void updateGame() {
		
	}
	void updateEnd() {
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
