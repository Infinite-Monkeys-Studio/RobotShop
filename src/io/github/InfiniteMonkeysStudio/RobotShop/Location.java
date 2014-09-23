package io.github.InfiniteMonkeysStudio.RobotShop;

/**
 * Represents a location in the world.
 * @author Quinn
 *
 */
public class Location {
	
	private float x, y; //location in building
	private Building building; //Building of location
	
	/**
	 * Class constructor.
	 * @param x The X component of the location.
	 * @param y The Y component of the location.
	 * @param building The building the Location refers to.
	 */
	public Location(float x, float y, Building building){
		this.x = x;
		this.y = y;
		this.building = building;
	}
	
	/**
	 * Class constructor.
	 * @param x The X component of the location.
	 * @param y The Y component of the location.
	 */
	public Location(float x, float y){
		this.x = x;
		this.y = y;
		//this.building = new Building();   ???
	}
	
	/**
	 * Get the X of this location
	 * @return double the X vector of this location
	 */
	public float getX() {
		return x;
	}
	
	/**
	 * Get the Y of this location
	 * @return double the Y vector of this location
	 */
	public float getY() {
		return y;
	}
}

