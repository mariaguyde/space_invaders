package shooter;
import java.util.ArrayList;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

public class GLUHandler  implements  GLEventListener  {
	private GLU glu;
	private float angle; 
	private Cube3D cube1, cube2, cube3, cube4, cube5, cube6, cube7, cube8;
	private float posX, posY;
	private ArrayList<Shape3D> items3D;
	private shooter shooter;

	
	public GLUHandler()
	{
		this.glu = new GLU();
		this.angle = 0;
		
		this.cube1 = new Cube3D(-11, 80, -55, 3);
		this.cube2 = new Cube3D(-2, 75, -55, 3);
		this.cube3 = new Cube3D(9, 50, -55, 3);
		this.cube4 = new Cube3D(-11, 25, -55, 3);
		this.cube5 = new Cube3D(-1, -18, -55, 3);
		this.cube6 = new Cube3D(9, -38, -55, 3);
		this.cube7 = new Cube3D(-20, -63, -55, 3);
		this.cube8 = new Cube3D(20, -85, -55, 3);
		this.shooter = new shooter(-1, -18, -55, 1);
	}

	public void display(GLAutoDrawable draw) {
		// TODO Auto-generated method stub
		GL2 gl = draw.getGL().getGL2();
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT | GL2.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		
		// Pour faire bouger les cubes que l'on a crée
		gl.glTranslatef(this.posX, this.posY, -0.01f);
	    gl.glRotatef(angle, -1.0f, 0.0f, 0.0f);

	    this.cube1.display(gl, this.angle);
		this.cube2.display(gl, this.angle);
		this.cube3.display(gl, this.angle);
	    this.cube4.display(gl, this.angle);
		this.cube5.display(gl, this.angle);
		this.cube6.display(gl, this.angle);
		this.cube7.display(gl, this.angle);
		this.cube8.display(gl, this.angle);

		
		gl.glLoadIdentity();
		this.shooter.display(gl, this.angle);
		this.angle += 0.6;
		
	}

	// LORSQUE L'ON QUITTE 
	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
		
		
	}

	// INITIALISATION
	@Override
	public void init(GLAutoDrawable draw ){
		// TODO Auto-generated method stub
		GL2 gl = draw.getGL().getGL2();
		//gl.glClearDepth(1.0f);
		//gl.glEnable(GL_DEPTH_TEST);
		//gl.glDepthFunc(GL_LEQUAL);
		//gl.glHint();
		gl.glClearColor(0,0,0,0);
		gl.glEnable(GL2.GL_DEPTH_TEST);
		
	}

	@Override
	public void reshape(GLAutoDrawable draw, int x, int y, int width, int height) {
		
		GL2 gl = draw.getGL().getGL2();
		float aspect = (float) width / height; 
		gl.glViewport(0,0,width,height);
		gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glLoadIdentity();
        GLU glu = new GLU();
        glu.gluPerspective(45.0, aspect, 0.1, 100);
        gl.glMatrixMode(GL2.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

	public void goRight() { this.posX += 0.1f; }
	public void goLeft() { this.posX -= 0.1f; }
	public void goDown() { this.posY -= 0.1f; }
	public void goUp() { this.posY += 0.1f; }



}
