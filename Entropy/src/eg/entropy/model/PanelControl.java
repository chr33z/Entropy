package eg.entropy.model;

/**
 * This is where you put your finger to move the actual paddle.
 * Needs to have on Paddle assigned to.<br><br>
 * 
 * <b>You must enter a correct side!</b>
 * <ul>Side is set by the parameter "side"</ul>
 * <li>"SIDE_LEFT" for paddle on the left side</li>
 * <li>"SIDE_RIGHT" for paddle on the right side</li>
 * </ul><br><br>
 * 
 * @author Christopher Gebhardt
 *
 */
public class PanelControl {

	public Vector position = new Vector();
	
	public float distanceToFrame = 10;
	public float distanceToPaddle = 10;
	public float size = 10;
	
	public Paddle paddle = new Paddle(position.x, position.y);
	
	public static final int SIDE_LEFT = 0;
	public static final int SIDE_RIGHT = 1;
	
	public int side = 0;
	
	/**
	 * Creates a 
	 * @param x
	 * @param y
	 * @param side
	 * @throws Exception
	 */
	public PanelControl(float x, float y, Paddle paddle, String side) throws Exception{
		position.x = x;
		position.y = y;
		this.paddle = paddle;
		
		if(side == "SIDE_LEFT") this.side = 0;
		else if(side == "SIDE_RIGHT") this.side = 1;
		else throw new Exception("PanelControl has no assigned side");
		
		// give the paddle the right position
		if(this.side == 0) paddle.position.x = position.x + distanceToPaddle;
		else paddle.position.x = position.x - distanceToPaddle;
		paddle.position.y = position.y;
	}
}
