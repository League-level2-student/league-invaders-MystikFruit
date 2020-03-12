package asdf;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ObjectManagerB implements ActionListener{
PlayerOne  player;
PlayerTwo player2;
int Health1 = 290;
int Health2 = 290;
int HealthX2 = 585;
	public void actionPerformed(ActionEvent arg0) {
	
		
	}
	public ObjectManagerB(PlayerOne player, PlayerTwo player2) {
		this.player=player;
		this.player2=player2;
	}
	
	public void draw(Graphics g) {
		player.draw(g);
		player2.draw(g);
		g.setColor(Color.BLACK);
		g.fillRect(20, 20, 300, 50);
		g.setColor(Color.RED);
		g.fillRect(25,25, 290, 40);
		g.setColor(Color.GREEN);
		g.fillRect(25, 25, Health1, 40);
		g.setColor(Color.BLACK);
		g.fillRect(580, 20, 300, 50);
		g.setColor(Color.RED);
		g.fillRect(585,25, 290, 40);
		g.setColor(Color.GREEN);
		g.fillRect(HealthX2, 25, Health2, 40);
	}
	
	public void update() {
		player.update();
		player2.update();
	
	}
	
	public void checkCollision() {
		if(player.Box.intersects(player2.Box2)){
			player.right = false;
			player2.left2 = false;
		
	}
		if(player.Box.intersects(player2.fistC2)&&(player.X>0)) {
			player.X -=50;
			Health1 -=15;
		}
		if(player2.Box2.intersects(player.fistC)&&(player2.X2<700)&&(player.fist = true)) {
			player2.X2 +=50;
			Health2 -=15;
			HealthX2 +=15;
			System.out.println(1234);
		}
	}
}
