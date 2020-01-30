package asdf;

import java.awt.Graphics;
import java.awt.event.ActionEvent;

public class ObjectManagerB2 {
	PlayerTwo player2;

		public void actionPerformed(ActionEvent arg0) {
		
			
		}
		public ObjectManagerB2(PlayerTwo player2) {
			this.player2=player2;
		}
		public void draw2(Graphics g) {
			player2.draw(g);
		}
		public void update() {
			player2.update();
			
		}

	}