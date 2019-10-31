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
	final int INSTRUCT = -1;
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	Timer frameDraw;
		
	   public GamePanel(){
		   frameDraw = new Timer(1000/60,this);
		    frameDraw.start();  
	   }
	Font Start = new Font("Arial", Font.PLAIN, 24);
	
	@Override
	public void paintComponent(Graphics g) {
		if(currentState == MENU){
		    drawMenu(g);
		}else if(currentState == GAME){
		    drawGame(g);
		}else if(currentState == END){
		    drawEnd(g);
		}else if(currentState == INSTRUCT) {
			drawInstruct(g);
		}
	}
	void drawGame(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 900, 600);
		g.setColor(Color.BLACK);
		g.fillRect(20, 20, 300, 50 );
		g.setColor(Color.GREEN);
		g.fillRect(25, 25, 290, 40 );
	}
	void drawMenu(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 900, 600);
		g.setFont(Start);	
		g.setColor(Color.RED);			
		g.drawString("Press ENTER to start", 330, 450);
		g.drawString("Press SHIFT for instructions", 290, 490);
	}
	void drawEnd(Graphics g) {
		
	}
	void drawInstruct(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 900, 600);
		g.setFont(Start);	
		g.setColor(Color.RED);			
		g.drawString("Player 1:", 10, 60);
		g.drawString(".Use A and D to move left and right", 10, 100);
		g.drawString(".Use W to jump and S to duck", 10, 140);
		g.drawString(".Use C to punch and V to kick", 10, 180);
		g.drawString("Player 2:", 10, 260);
		g.drawString(".Use <- and -> to move left and right", 10, 300);
		g.drawString(".Use the UP arrow to jump and the DOWN arrow to duck", 10, 340);
		g.drawString(".Use 2 to punch and 3 to kick", 10, 380);
		g.drawString("Press SHIFT to return to menu", 290, 490);
	}
	void updateMenu() {
		
	}
	void updateGame() {
		
	}
	void updateEnd() {
		
	}
	void updateInstruct() {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
			if(currentState == MENU){
			    updateMenu();
			}else if(currentState == GAME){
			   updateGame();
			}else if(currentState == END){
			    updateEnd();
			}else if (currentState == INSTRUCT) {
				updateInstruct();
			}
			repaint();
		}

	void startGame() {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_ENTER) {
		    if (currentState == END) {
		        currentState = MENU;
		    } else if(currentState == MENU) {
		    	currentState = GAME;
		    	startGame();
		    } else if(currentState == GAME) {
		    	currentState = END;
		    }
		    
		}
		if (e.getKeyCode()==KeyEvent.VK_SHIFT){
			if (currentState == MENU) {
				currentState = INSTRUCT;
			} else if (currentState == INSTRUCT) {
				currentState = MENU;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
	