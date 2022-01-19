package shooter;
import com.jogamp.opengl.GL2;

public class shooter extends Shape3D {
	
	int a; 
	int b; 
	int c; 
	int d;

	public shooter (int a, int b, int c, int d) {
		this.a = a; 
		this.b = b; 
		this.c = c; 
		this.d = d;
	}
	
	
	public void display(GL2 gl, float angle) {
		
        gl.glBegin(GL2.GL_POLYGON);
   		gl.glColor3d(0.498039, 0, 1.0);
		
        gl.glVertex3d(-1, -4, -8);
		gl.glVertex3d(1, -4, -8);
		gl.glVertex3d(1, -3, -8);
		
		gl.glVertex3d(0.5, -3, -8);
		gl.glVertex3d(0.5, -2.5, -8);
		gl.glVertex3d(0, -2.5, -8);
		gl.glVertex3d(0, -3, -8);
		
		gl.glVertex3d(-1, -3, -8);
        gl.glEnd();

	}

}
