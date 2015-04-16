/**
 * Janine Jay and Brittany Bohn
 * 04-15-2015
 * Brick Game
 **/

//Import Statements
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPanel {

	//Instance Variables
	private Ball _ball;
	private Paddle _paddle1, _paddle2;
	private Brick _brick;
	private AnimationTimer _timer;
	
	//Constructor
	public DrawingPanel () {
		
	}
	
	//Instance Methods
	
	//Move Method
	public void move() {
		
	}
	
	//Paint Method
	public void paintComponent (Graphics2D g) {
		
	}
	
	//ClickListener class
	private class ClickListener implements MouseListener {

		//Mouse Clicked Method
		public void mouseClicked(MouseEvent e) {

		}

		//Other Methods
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		
	}
	
}
