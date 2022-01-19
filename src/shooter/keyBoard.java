package shooter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyBoard  implements KeyListener{
	
	private GLUHandler events;
	
	public keyBoard (GLUHandler events) {
		this.events = events;
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyChar() == 'z')
			this.events.goUp();
		if (e.getKeyChar() == 'q')
			this.events.goLeft();
		if (e.getKeyChar() == 's')
			this.events.goDown();
		if (e.getKeyChar() == 'd')
			this.events.goRight();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
