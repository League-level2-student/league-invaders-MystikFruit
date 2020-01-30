package asdf;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ObjectManagerB implements ActionListener{
PlayerOne  player;

	public void actionPerformed(ActionEvent arg0) {
	
		
	}
	public ObjectManagerB(PlayerOne player) {
		this.player=player;
	}
	public void draw(Graphics g) {
		player.draw(g);
	}
	
	public void update() {
		player.update();
		
	}

}
