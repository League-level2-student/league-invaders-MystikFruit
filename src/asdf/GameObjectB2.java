package asdf;

import java.awt.Rectangle;

public class GameObjectB2 {
	int X2;
	int Y2;
	int Height2;
	int Width2;
	int speed;
	public GameObjectB2(int X, int Y, int Height, int Width) {
		this.X2=X;
		this.Y2=Y;
		this.Width2=Width;
		this.Height2=Height;
		speed = 5;
	}
	Rectangle fistC2 = new Rectangle();
	Rectangle lfist2 = new Rectangle();
	Rectangle Box2 = new Rectangle();
	
public void update() {
	lfist2.setBounds(X2-70, Y2+40, 90, 50);
	Box2.setBounds(X2, Y2, Width2, Height2);	
}

public void updateF2() {
	fistC2.setBounds(X2-70, Y2+65, 90, 50);
}
}
