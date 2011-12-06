package eg.entropy.model;

/**
 * Represents a paddle for playing the ball. <br><br>
 * 
 * Each panel is connected to a PanelControll Class which
 * adds the functionality and Listeners
 * 
 * @author Christopher Gebhardt
 *
 */
public class Paddle {
	
	public Vector position = new Vector();
	
	public float paddleHeight = 25.0f;
	public float paddleWidth = 5.0f;
	
	public Paddle(float x, float y){
		position.x = x;
		position.y = y;
	}
	
}
