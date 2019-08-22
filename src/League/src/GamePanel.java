package League.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer frameDraw;
	final int MENU = 0;
    final int GAME = 1;
    final int END = 2;
    int currentState = MENU;
    Rocketship ship = new Rocketship(250, 600, 50, 50);
	public GamePanel() {
	    frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	}
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	Font titleFont = new Font("Arial", Font.PLAIN, 48);
	Font Enter = new Font("Arial", Font.PLAIN, 24);
	
	
	
    
 void updateMenuState() {  
	 
 }
 void updateGameState() { 
	 
 }
 void updateEndState()  {  
	 
 }
 
 void drawMenuState(Graphics g) { 
	 g.setColor(Color.BLACK);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	 g.setFont(titleFont);
	 g.setColor(Color.GREEN);
	 g.drawString("League Invaders", 50, 60);
	 g.setFont(Enter);
	 g.drawString("Press ENTER to Start", 130, 300);
	 g.drawString("Press SPACE for instructions", 80, 600);
 }
 void drawGameState(Graphics g) { 
	 g.setColor(Color.BLACK);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	 ship.draw(g);
 }
 void drawEndState(Graphics g)  {  
	 g.setColor(Color.RED);
	 g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT); 
	 g.setFont(titleFont);
	 g.setColor(Color.BLACK);
	 g.drawString("GAME OVER", 90, 200);
	 
 }
@Override
public void actionPerformed(ActionEvent arg0) {
	if(currentState == MENU){
	    updateMenuState();
	}else if(currentState == GAME){
	   updateGameState();
	}else if(currentState == END){
	    updateEndState();
	}
	repaint();
}
@Override
public void keyPressed(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	        currentState++;
	    }
	}
	if (e.getKeyCode()==KeyEvent.VK_UP) {
	    System.out.println("UP");
	    ship.up();
}
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		ship.down();
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		ship.right();
	}
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		ship.left();
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}






