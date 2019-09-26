package League.src;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager implements ActionListener{
	Rocketship rocket;
	
	static ArrayList<Projectile> projectiles = new ArrayList<Projectile>();
	ArrayList<Alien> alien = new ArrayList<Alien>();
	Random random = new Random();
public ObjectManager(Rocketship rocket) {
	this.rocket=rocket;
}
static void addProjectile(Projectile projectile) {
	projectiles.add(projectile);
	
}
void addAlien() {
	alien.add(new Alien(random.nextInt(LeagueInvaders.WIDTH),0,50,50));
}
void update() {
	for (int i = 0; i < alien.size(); i++) {
		alien.get(i).update();	
	}
	for (int i = 0; i < projectiles.size(); i++) {
		projectiles.get(i).update();
	}
	if(LeagueInvaders.HEIGHT<=0||LeagueInvaders.HEIGHT>=700) {
		for (int i = 0; i < alien.size(); i++) {
			alien.get(i).isActive=false;
		} 
}
purgeObjects();
checkCollision();
}

void draw(Graphics g) {
	rocket.draw(g);
	for (int i = 0; i < alien.size(); i++) {
		alien.get(i).draw(g);
	}
	for (int i = 0; i < projectiles.size(); i++) {
		projectiles.get(i).draw(g);
	}
}

void purgeObjects() {
	for (int i = 0; i < alien.size(); i++) {
		
	}
}
@Override
public void actionPerformed(ActionEvent arg0) {
	addAlien();
	
}

void checkCollision() {
	for (int i = 0; i < alien.size(); i++) {
		if (rocket.collisionBox.intersects(alien.get(i).collisionBox)) {
			alien.get(i).isActive = false;
			//rocket.collisionBox.intersects(alien.collisionBox);
		}

	}
	
}
}
