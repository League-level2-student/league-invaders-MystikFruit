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

import League.src.ObjectManager;
import League.src.Rocketship;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	final int INSTRUCT = -1;
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	boolean up;
	boolean down;
	boolean left;
	boolean right;
	boolean punch;
	float YVelocity = 0;
	double gravity = .2;
	boolean jEnd = false;
	int currentState = MENU;
	Timer frameDraw;
	PlayerOne player = new PlayerOne(150, 300, 170, 170);
	PlayerTwo player2 = new PlayerTwo(500, 300, 170, 170);
    ObjectManagerB objectmanB = new ObjectManagerB(player, player2);
    
	   public GamePanel(){
		   frameDraw = new Timer(1000/60,this);
		    frameDraw.start();  
	   }
	Font Start = new Font("Arial", Font.PLAIN, 24);
	
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
		YVelocity += gravity;
		player.Y = (int) (player.Y + YVelocity);
		if(player.Y>300) {
			gravity = 0;
			YVelocity = 0;
		}
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 900, 600);
		g.setColor(Color.BLACK);
		g.fillRect(20, 20, 300, 50 );
		g.setColor(Color.RED);
		g.fillRect(25,25, 290, 40);
		g.setColor(Color.GREEN);
		g.fillRect(25, 25, 290, 40 );
		g.setColor(Color.BLACK);
		g.fillRect(580, 20, 300, 50 );
		g.setColor(Color.RED);
		g.fillRect(585,25, 290, 40);
		g.setColor(Color.GREEN);
		g.fillRect(585, 25, 290, 40 );
		objectmanB.draw(g);
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
	// player.update();
		// move();
	}
	void updateEnd() {
		
	}
	void updateInstruct() {
		
	}
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
		if (e.getKeyCode()==KeyEvent.VK_W) {
			up=true;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_S) {
			down = true;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_D) {
			right = true;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_A) {
			left=true;
		}
		
		if (e.getKeyCode()==KeyEvent.VK_C) {
			punch=true;
			System.out.println(123);
		}
	}
	
	public void move(Graphics g) {
		if (up==true) {
			jump();
		}
		if (down==true) {
			player.down();
		}
		if (right==true) {
			player.right();
		}
		if(left==true) {
			player.left();
		}
	//	if(punch==true) {
		//	player.punch();
		///	}
	
	}
	public void jump() {
		if(player.Y<=100) {
			jEnd = true;
		}
		if(jEnd = true) {
			gravity = .2; 
			YVelocity = 1;
		}
		YVelocity = -7;
		if(player.Y>300) {
			gravity = 0;
			YVelocity = 0;
			jEnd = false;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_A) {
			left=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_D) {
			right=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_W) {
			up=false;
		}
		if (e.getKeyCode()==KeyEvent.VK_S) {
			down=false;
			player.Height=170;
			player.Y=300;
		}
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
	