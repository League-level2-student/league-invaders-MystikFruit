package League.src;

import java.awt.Rectangle;

public class GameObject{
int X;
int y ;
int Width;
int height;
int speed;
boolean isActive;
Rectangle collisionBox = new Rectangle();
public GameObject(int X, int Y, int Width, int Height){
this.X=X;
this.y=Y;
this.Width=Width;
this.height=Height;
	speed = 7;
	isActive = true;
	}

void update(){
	collisionBox.setBounds(X, y, Width, height);
}
}
