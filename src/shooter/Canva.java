package shooter;
import java.awt.Dimension;
import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;

public class Canva {

	private static final int GL_DEPTH_TEST = 0;
	private static final int GL_LEQUAL = 0;
	private GLU glu;
	private float angle; 

	public static void main (String[] args) {
		JFrame frame = new JFrame(); 
		GLCanvas canvas = new GLCanvas();
		GLUHandler events = new GLUHandler();
		canvas.setPreferredSize(new Dimension(1000,600));
		canvas.addKeyListener(new keyBoard(events));
		canvas.addGLEventListener(events);
		//canvas.addMouseListener(events);
		frame.getContentPane().add(canvas);
		frame.setTitle("MINI SHOOTER - MARIA");
		frame.pack();
		frame.setVisible(true);
		FPSAnimator anim = new FPSAnimator(canvas,60);
		anim.start();

	}
		
}
