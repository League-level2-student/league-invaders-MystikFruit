import javax.swing.JFrame;

public class LeagueInvaders {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	JFrame frame;
	GamePanel gamep;
	LeagueInvaders(){
		frame = new JFrame();
		gamep = new GamePanel();
	}
public static void main(String[] args) {
LeagueInvaders window = new LeagueInvaders();
window.setup();
}

void setup() {
frame.add(gamep);
frame.setSize(WIDTH, HEIGHT);
frame.setVisible(true);
}
}
