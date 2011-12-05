package eg.entropy.model;

import java.util.ArrayList;

public class Simulation {
	
	// defines max and min fieldsize
	public final static float PLAYFIELD_MAX_X = 14;
	public final static float PLAYFIELD_MIN_X = -14;
	
	public final static float PLAYFIELD_MAX_Y = 14;
	public final static float PLAYFIELD_MIN_Y = -14;
	
	// define game elements
	ArrayList<Block> blocks = new ArrayList<Block>();
	ArrayList<ScoreMultiplier> scoreMult = new ArrayList<ScoreMultiplier>();
	
	public Ball ball; // game ball
	
	public float gameSpeed; // multiplier to speed up ball/game elements
	
	public int score; // score...
	
	// public SimulationListener listener;
	
	public Simulation(){
	}
}
