package eg.entropy.model;

/**
 * Represents the game ball in the game.
 * Position is defined by a 3D Vector though we use only 2 dimensions.
 * Direction is also defined by a Vector. Speed is defined by the length of the 
 * direction vector.
 * 
 * @author Christopher Gebhardt
 *
 */
public class Ball {

	public Vector position = new Vector();
	public Vector direction = new Vector();
	
	public float ballSize = 10;
	
	public int lives = 1;
	
	/**
	 * Create a ball with certain position and direction
	 * @param x
	 * @param y
	 * @param dx
	 * @param dy
	 */
	public Ball(float x, float y, float dx, float dy){
		position.x = x;
		position.y = y;
		
		direction.x = dx;
		direction.y = dy;
	}
	
	/**
	 * create a ball with a certain position
	 * @param x
	 * @param y
	 */
	public Ball(float x, float y){
		position.x = x;
		position.y = y;
		
		direction.x = 0;
		direction.y = 0;
	}
	
	/**
	 * Set a new position for  the ball
	 * @param x
	 * @param y
	 */
	public void setPosition(float x, float y){
		position.x = x;
		position.y = y;
	}
	
	/**
	 * Set a new direction for the ball. Note that this
	 * effects the speed of the ball
	 * @param dx
	 * @param dy
	 */
	public void setDirection(float dx, float dy){
		direction.x = dx;
		direction.y = dy;
	}
	
	/**
	 * Set a new Direction for the ball with also setting the speed
	 * @param dx
	 * @param dy
	 * @param speed
	 */
	public void setDirection(float dx, float dy, float speed){
		float length = position.getLength();
		direction.x = dx/length*speed;
		direction.x = dy/length*speed;
	}
	
	/**
	 * Set the size of the ball
	 * @param size
	 */
	public void setBallSize(float size){
		ballSize = size;
	}
	
	/**
	 * Updates the current position of the ball using
	 * the direction vector and the elapsed time
	 * 
	 * @param delta
	 */
	public void update(float delta){
		position.x += direction.x * delta;
		position.y += direction.y * delta;
	}
}
