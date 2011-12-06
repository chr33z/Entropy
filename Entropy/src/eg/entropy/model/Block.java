package eg.entropy.model;

/**
 * Add a block object to the world. A block is not passable by the ball and is 
 * destroyed when it is hit. <br><br>
 * 
 * For square blocks use "FORM_BLOCK" modifier, for circle-shaped blocks use "FORM_CIRCLE"
 * 
 * 
 * @author Christopher Gebhardt
 *
 */
public class Block {
	
	/*
	 * What form has the bloc
	 * "BLOCK" = square
	 * "CIRCLE" = yes... it's a circle
	 */
	public final static int FORM_BLOCK = 0;
	public final static int FORM_CIRCLE = 1;
	
	public int form = FORM_BLOCK;
	
	public Vector position = new Vector();
	public Vector direction = new Vector();
	
	public float size = 10;
	
	// true when the block has left the viewable field
	public boolean hasLeftField = false;
	
	/**
	 * Square block with direction downwards
	 * @param x
	 * @param y
	 */
	public Block(float x, float y){
		position.x = x;
		position.y = y;
		direction.x = 0;
		direction.y = 1;
	}
	
	/**
	 * Set position, direction, form and size of block
	 * @param x
	 * @param y
	 * @param Square-shape = "FORM_BLOCK" <br> Circle-shape = "FORM_CIRCLE"
	 */
	public Block(float x, float y, float dx, float dy, String form, float size){
		position.x = x;
		position.y = y;
		direction.x = x;
		direction.y = y;
		this.size = size;
		
		if(form == "FORM_BLOCK") this.form = 0;
		else if(form == "FORM_CIRCLE") this.form = 1;
		else this.form = 0;
	}
	
	/**
	 * Updates the current position of the block using
	 * the direction vector and the elapsed time
	 * 
	 * @param delta
	 */
	public void update(float delta){
		position.x += direction.x * delta;
		position.y += direction.y * delta;
		
		if(position.x + size/2 < Simulation.PLAYFIELD_MIN_X) hasLeftField = true;
		if(position.x - size/2 > Simulation.PLAYFIELD_MAX_X) hasLeftField = true;
		
		if(position.x + size/2 < Simulation.PLAYFIELD_MIN_Y) hasLeftField = true;
		if(position.x - size/2 > Simulation.PLAYFIELD_MAX_Y) hasLeftField = true;
	}
}
