package asdf;

import java.awt.Rectangle;

public class GameObjectB {
int X;
int Y;
int Height;
int Width;
int speed;
public GameObjectB(int X, int Y, int Height, int Width) {
	this.X=X;
	this.Y=Y;
	this.Width=Width;
	this.Height=Height;
	speed = 5;
}
Rectangle fistC = new Rectangle();
Rectangle lfist = new Rectangle();
Rectangle Box = new Rectangle();

public void update() {	
	lfist.setBounds(X+180, Y+35, 90, 50);
	Box.setBounds(X, Y, Width, Height);
}

public void updateF() {
	fistC.setBounds(X+180, Y+65, 90, 50);
}

public void updateLF(){
	
	}
}
