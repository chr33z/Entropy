package eg.entropy.model;

/**
 * An object that multiplies the score of the player for a short time.
 * 
 * @author Christopher Gebhardt
 *
 */
public class ScoreMultiplier {

	public final static int ALIVE_TIME = 5000; // should be 5 seconds
	
	Vector position = new Vector();
	Vector direction = new Vector();
	
	public float multiplier = 2;
	public float size = 10;
	public float aliveTime = 0;
	
	public boolean isALive = true;
	public boolean hasLeftField = false;
	
	/**
	 * Created a Multiplier Item that moves downwards
	 * @param x
	 * @param y
	 * @param multiplier
	 */
	public ScoreMultiplier(float x, float y, float multiplier){
		position.x = x;
		position.y = y;
		this.multiplier = multiplier;
	}
	
	public ScoreMultiplier(float x, float y, float dx, float dy, float multiplier, float size){
		position.x = x;
		position.y = y;
		direction.x = dx;
		direction.y = dy;
		this.multiplier = multiplier;
		this.size = size;
	}
	
	/**
	 * Updates the current alive time using the elapsed time
	 * @param delta
	 */
	public void update(float delta){
		position.x += direction.x * delta;
		position.y += direction.y * delta;
		aliveTime += delta;
		
		if(position.x + size/2 < Simulation.PLAYFIELD_MIN_X) hasLeftField = true;
		if(position.x - size/2 > Simulation.PLAYFIELD_MAX_X) hasLeftField = true;
		
		if(position.x + size/2 < Simulation.PLAYFIELD_MIN_Y) hasLeftField = true;
		if(position.x - size/2 > Simulation.PLAYFIELD_MAX_Y) hasLeftField = true;
	}
}
