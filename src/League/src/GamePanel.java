package League.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.sql.Time;

import javax.swing.Timer;
import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer frameDraw;
	final int MENU = 0;
	boolean up;
	boolean down;
	boolean left;
	boolean right;
    final int GAME = 1;
    final int END = 2;
    Timer alienSpawn;
    int currentState = MENU;
    Rocketship ship = new Rocketship(250, 600, 50, 50);
    ObjectManager objectman = new ObjectManager(ship);
	public GamePanel() {
	    frameDraw = new Timer(1000/60,this);
	    frameDraw.start();
	    if (needImage) {
	        loadImage ("space.png");
	    }

	}
	
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
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
	 objectman.update();
	 move();
 }
 void updateEndState()  {  
	 
 }
 
 void drawMenuState(Graphics g) { 
	 g.setColor(Color.BLACK);
	 //g.fillRect(0, 0, down = true,LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	 g.setFont(titleFont);
	 g.setColor(Color.GREEN);
	 g.drawString("League Invaders", 50, 60);
	 g.setFont(Enter);
	 g.drawString("Press ENTER to Start", 130, 300);
	 g.drawString("Press SPACE for instructions", 80, 600);
	 
 }
 void drawGameState(Graphics g) {
	 if (gotImage) {
			g.drawImage(image, 0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT, null);
		} else {
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		}
	 
	 objectman.draw(g);
 }
 
 void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
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
void startGame() {
	 alienSpawn = new Timer(1000 , objectman);
	    alienSpawn.start();
}

void move() {
	if (up==true) {
		ship.up();
	}
	if (down==true) {
		ship.down();
	}
	if (right==true) {
		ship.right();
	}
	if(left==true) {
		ship.left();
	}
}
	
@Override
public void keyPressed(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_ENTER) {
	    if (currentState == END) {
	        currentState = MENU;
	    } else {
	    	startGame();
	        currentState++;
	    }
	    
	}
	if (e.getKeyCode()==KeyEvent.VK_UP) {
		up=true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		down = true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		right = true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		left=true;
	}
	
	if (e.getKeyCode()==KeyEvent.VK_SPACE) {
		ObjectManager.addProjectile(ship.getProjectile());
}
}
@Override
public void keyReleased(KeyEvent e) {
	if (e.getKeyCode()==KeyEvent.VK_LEFT) {
		left=false;
	}
	if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
		right=false;
	}
	if (e.getKeyCode()==KeyEvent.VK_UP) {
		up=false;
	}
	if (e.getKeyCode()==KeyEvent.VK_DOWN) {
		down=false;
	}
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}






