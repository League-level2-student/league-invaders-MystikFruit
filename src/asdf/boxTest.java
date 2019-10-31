package asdf;

import java.awt.Component;

import javax.swing.JFrame;

public class boxTest {	
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;
	JFrame frame;
	GamePanel gpanel;
	boxTest(){
		frame = new JFrame();
		gpanel = new GamePanel();
	}
public static void main(String[] args) {
boxTest window = new boxTest();
window.setup();
}

void setup() {
frame.add(gpanel);
frame.setVisible(true);
frame.addKeyListener(gpanel);
frame.setSize(WIDTH, HEIGHT);
	
}
}
