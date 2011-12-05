package eg.entropy.model;

public class PaddleRight {
	
	Vector position = new Vector();
	
	public float paddleHeight = 25.0f;
	public float paddleWidth = 5.0f;
	
	public float paddleVelocity = 1.0f;
	
	public PaddleRight(float x, float y){
		position.x = x;
		position.y = y;
	}
	
}
