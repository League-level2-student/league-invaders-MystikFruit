package asdf;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ObjectManagerB implements ActionListener{
PlayerOne  player;
PlayerTwo player2;
	public void actionPerformed(ActionEvent arg0) {
	
		
	}
	public ObjectManagerB(PlayerOne player, PlayerTwo player2) {
		this.player=player;
		this.player2=player2;
	}
	
	public void draw(Graphics g) {
		player.draw(g);
		player2.draw(g);
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
		if(player.Box.intersects(player2.fistC2)) {
			player.X +=-30;
			
		}
		if(player2.Box2.intersects(player.fistC)) {
			player2.X2 +=+30;
		}
	}
}
