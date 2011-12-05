package eg.entropy.model;

import java.io.Serializable;
import android.util.FloatMath;

/**
 * Implements basic functions for working with vectors
 * @author Christopher Gebhardt
 *
 */
public class Vector implements Serializable {

	private static final long serialVersionUID = -2518426362812972473L;
	
	float x, y, z;
	
	public Vector(){
		x = y = z = 0;
	}
	
	public Vector(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getDistance(Vector v){
		float a = v.x - x;
		float b = v.y = y;
		float c = v.z = z;
		return FloatMath.sqrt(a*a + b*b + c*c);
	}
	
	public void set(Vector v){
		this.x = v.x;
		this.y = v.y;
		this.z = v.z;
	}
	
	public void set(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector add(Vector v){
		this.x += v.x;
		this.y += v.y;
		this.z += v.z;
		return this;
	}
	
	public Vector sub(Vector v){
		this.x -= v.x;
		this.y -= v.y;
		this.z -= v.z;
		return this;
	}
	
	public float getLength(){
		return FloatMath.sqrt(x*x + y*y + z*z);
	}
}
